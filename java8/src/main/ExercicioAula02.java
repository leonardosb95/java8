package main;

public class ExercicioAula02 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		
		//Transformando com lambda
		
		new Thread(()-> System.out.println("Executando um Runnable")).start();
		
		
	}
	
}
