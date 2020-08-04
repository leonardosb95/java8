package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		//Function<String, Integer> funcao=s->s.length();//Passa um objeto para a interface estatico com as referências
		//Comparator<String> comparador=Comparator.comparing(funcao);//Ordenando palavras comparando pelo tamanho
		
		//palavras.sort(Comparator.comparing(String::length));
		
		
		//Method reference
		
		palavras.sort(Comparator.comparing(String::length));
	
		//palavras.forEach(s -> System.out.println(s));
		
		//Method reference passando o consumer
		palavras.forEach(System.out::println);

	}
}


