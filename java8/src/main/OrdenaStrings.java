package main;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		palavras.sort((s1,s2)->{//Lambda
			return Integer.compare(s1.length(),s2.length());
		});
	

//		for(String p:palavras) {
//			System.out.println(p);
//		}
//		

		// uma nova forma de interar numa lista, existe no java 8

//		palavras.forEach(new Consumer<String>() {
//			public void accept(String s) {
//				System.out.println(s);
//			}
//			
//		});

		// Podemos remover as chaves porque só existe apenas uma unica instrução
		palavras.forEach(s -> System.out.println(s));

	}
}


