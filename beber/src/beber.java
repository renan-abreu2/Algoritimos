import java.util.*;
public class beber {
public static void main(String[] args) {
	String carteira;
	Scanner  ler = new Scanner(System.in);
	int idade;
	//--------------------------------------------
	
	System.out.printf("POR FAVOR Informe sua idade:");
	
	idade = ler.nextInt();

	
	//-----------------------------------------------
	
	

	
	
	if(idade >= 18) {
		
		System.out.printf("Voc� tem Habilita��o?:");
		carteira = ler.next();
		ler.close();
			if(carteira.equals("sim")){
			
			System.out.println("PARABENS!! VOC� PODE DIRIGIR!!");
			
			}else {
				
				System.out.println("!!!!N�O PODE DIRIGIR!!!!");
				
			}
	
	
		
	
	}else {
		System.out.println("!!!!N�O PODE DIRIGIR!!!!");
	}
	
	
	
	
	
}
}
