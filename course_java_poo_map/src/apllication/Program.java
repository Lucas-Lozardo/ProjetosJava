package apllication;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("UserName", "Maria");
		cookies.put("E-mail", "maria@gmail.com");
		cookies.put("Celular", "00000-0000");
		
		cookies.remove("Celular");
		
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}

}
