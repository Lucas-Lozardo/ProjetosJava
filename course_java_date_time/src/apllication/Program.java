//Data 27/12/2022


package apllication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //d08
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //d09
		
		//Horário de agora (java11), outra forma (forma antiga java8) linha 117.
		LocalDate d01 = LocalDate.now();			//LocalDate e LocalDateTime sao  horário Local
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();				// Instant é horário Global
		
		
		LocalDate d04 = LocalDate.parse("2022-12-27");
		LocalDateTime d05 = LocalDateTime.parse("2022-12-27T14:39:00");
		Instant d06 = Instant.parse("2022-12-27T14:39:00Z");
		Instant d07 = Instant.parse("2022-12-27T14:39:00-03:00");
		
		LocalDate d08 = LocalDate.parse("27/12/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("27/12/2022 13:30", fmt2);
		
		//pode ser instanciado direto
		LocalDateTime d10 = LocalDateTime.parse("27/12/2022 13:37", 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d11 = LocalDate.of(2022, 12, 27);
		LocalDateTime d12 = LocalDateTime.of(2022, 12, 27, 1, 30);
		
		
		System.out.println("d01 = "+d01.toString()); //toString é opcional
		System.out.println("d02 = "+d02);
		System.out.println("d03 = "+d03);
		System.out.println("d04 = "+d04);
		System.out.println("d05 = "+d05);
		System.out.println("d06 = "+d06);
		System.out.println("d07 = "+d07);
		System.out.println("d08 = "+d08);
		System.out.println("d09 = "+d09);
		System.out.println("d10 = "+d10);
		System.out.println("d11 = "+d11);
		System.out.println("d12 = "+d12);
		
		
		System.out.println("---------");
		
		LocalDate d13 = LocalDate.parse("2022-12-27");
		
		System.out.println("d13 = "+ d13.format(fmt1)); // tanto essa quanto a de baixo está correta para local.
		System.out.println("d13 = "+ fmt1.format(d13));
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// Código para ser usado com o fuso horário local (Global).
		
		System.out.println("d06 = "+ fmt3.format(d06)); // para global só funciona assim pois Instant não aceita format.
		
		System.out.println("---------");
		
		Instant d14 = Instant.parse("2022-12-27T01:37:00Z");
		LocalDate r1 = LocalDate.ofInstant(d14, ZoneId.systemDefault()); //global para local.
		LocalDate r2 = LocalDate.ofInstant(d14, ZoneId.of("Portugal"));
		
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		
		System.out.println("d13 dia = "+d13.getDayOfMonth());
		System.out.println("d13 ano = "+d13.getYear());
		System.out.println("---------");
		
		LocalDate d15 = LocalDate.parse("2022-12-27");
		LocalDate pastWeekLocalDate = d15.minusDays(7); //Alterar data
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		
		Instant pastWeekInstant = d14.minus(7, ChronoUnit.DAYS); //Utilizado quando for Instant.
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("Past and Next WeekLocalDateTime = " 
					+ pastWeekLocalDateTime 
					+ " " 
					+ nextWeekLocalDateTime);
		
		//Calculo entre datas LocalDateTime.
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05); 
		System.out.println("t1 dias = " + t1.toDays());
		
		//Calculo entre datas LocalDate. Precisa converter para LocalDateTime.
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d15.atStartOfDay()); 
		System.out.println("t2 dias = " + t2.toDays());
		
		System.out.println();
		
		///Outra forma de instanciar Date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d1 = sdf1.parse("15/06/1990");
		Date d2 = sdf2.parse("10/10/1990 12:00:21");
		
		Date x1 = new Date(); //Outra forma (mais antiga java8) de Horário de agora.
		
		
		System.out.println("d1 com sdf1 " + sdf1.format(d1));
		System.out.println("d2 com sdf2 " + sdf2.format(d2));
		System.out.println("x1 com sdf2 " + sdf2.format(x1));
		System.out.println("x1 apenas " + x1);
		
		System.out.println("---------");
		
		
		///para utilizacao do Calendario
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d3 = sdf3.parse("15/06/1990 23:00:21");
		
		//Calendario em si
		Calendar cal = Calendar.getInstance();
		cal.setTime(d3);
		
		//Para pegar parte da data em especifico.
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); //Tem que acrescentar o 1, posi comeca com 0 igual vetor.
		
		System.out.println("Minutes " + minutes);
		System.out.println("Mounth " + month);
	}

}
