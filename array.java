import java.util.Scanner;
public class array {

	public static void arrays(int []a ){
		 int numero, exp, digito;
	        double binario;
	        int i=0;
	        Scanner teclado = new Scanner(System.in);

	        do{  
	            System.out.print("Introduce un numero ");
	            numero = teclado.nextInt();
	        }while(numero<0);

	        exp=0;
	        binario=0;
	        while(numero!=0){
	                digito = numero % 2;            
	                a[i] = (int) (a[i] + digito );   
	                exp++;
	                numero = numero/2;
	                i++;
	       
	        } i--;
	       
	       while(i>-1){
	    	   System.out.print(a[i]);
	    	   i--;
	       }
	      
	     
	        
	       
	       
	       
	        
		
		
	}
}
