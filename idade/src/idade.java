import java.util.*;
public class idade {
	public static void main(String[] args) {
		
	
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Por Favor informe sua idade :");
		n = ler.nextInt();
		
		ler.close();
		
		if(n>18){
			System.out.printf("Maior de idade!!");
		}
		else {
			System.out.printf("Menor de idade!!");
		}
		
	}

}

