import java.util.*;
public class semana {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String semana;
		
		System.out.printf("Informe qual � o dia da semana");
		
		semana = ler.next();
		ler.close();
		
		
		
		if(semana.equals("domingo")) {
			System.out.printf("� Final de Semana");
			
		}else {
			if(semana.equals("sabado")) {
		System.out.printf(" � Final de Semana");
		}
		
		else {
		System.out.printf("N�o � Final de Semana");}
	}

}
}
