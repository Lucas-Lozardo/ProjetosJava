

///Realizar Transações no MySQL

package apllication;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
			
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); ///Só executará os comandos abaixo quando chegar na linha de comando 32 "conn.commit();
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE	DepartmentId = 1");
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE	DepartmentId = 2");
			
			conn.commit(); ///confirmação para realizar todos os comandos da transação.
			
			System.out.println("Rows1: " + rows1);
			System.out.println("Rows2: " + rows2);
		}
		catch(SQLException e) {
			try {
				conn.rollback(); ///comando para voltar ao estado original da transação, desfazer o que foi feito até o momento do erro.
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}						
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
