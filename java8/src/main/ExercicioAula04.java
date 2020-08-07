package main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioAula04 {

	public static void main(String[] args) {
		List<Curso> cursos= new ArrayList<Curso>();
		
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("Javascript",150));
		cursos.add(new Curso("Java 8",113));
		cursos.add(new Curso("C",55));
		
		//method reference
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		Stream<Curso> streamDeCurso=cursos.stream().filter(c->c.getAlunos()>100);//Devolve uma lista de cursos que tenha o numero maior que 100
		
//		cursos.forEach(s->System.out.println(s.getNome()));
//		
//		streamDeCurso.forEach(s->System.out.println(s.getNome()));
		
		//Podemos fazer tudo na mesma linha
//		cursos.stream()
//			.filter(c->c.getAlunos()>100)
//			.forEach(c->System.out.println(c.getNome()));
		
//		cursos.stream()
//		.filter(c->c.getAlunos()>50)
//		.forEach(System.out::println);
//
//
//		int total=cursos.stream()
//		.filter(c->c.getAlunos()>100)
//		.mapToInt(Curso::getAlunos)
//		.sum();
//
//		System.out.println("TOTAL :"+total);
//
//		cursos.forEach(c->System.out.println(c.getAlunos()));


//		Optional<Curso> optional= cursos.stream()
//				.filter(c->c.getAlunos()>100)
//				.findAny()
//                .ifPresent(c-> System.out.println(c.getNome());


       // Curso curso=optional.orElse(null);

        //Curso curso=optional.get();

                cursos=cursos.stream()
                .filter(c->c.getAlunos()>100)
                .collect(Collectors.toList());


                Map mapa=cursos
                        .stream()
                        .filter(c->c.getAlunos()>100)
                        .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));


                cursos=cursos
                        .stream()
                        .filter(x->x.getAlunos()>45)
                        .collect(Collectors.toList());
















		
	}
	
}
