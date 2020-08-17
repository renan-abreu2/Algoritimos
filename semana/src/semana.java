import java.util.*;
public class semana {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String semana;
		
		System.out.printf("Informe qual é o dia da semana");
		
		semana = ler.next();
		ler.close();
		
		
		
		if(semana.equals("domingo")) {
			System.out.printf("É Final de Semana");
			
		}else {
			if(semana.equals("sabado")) {
		System.out.printf(" É Final de Semana");
		}
		
		else {
		System.out.printf("Não É Final de Semana");}
	}

}
}
