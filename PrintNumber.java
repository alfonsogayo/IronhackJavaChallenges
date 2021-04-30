
/* Write a program called printNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number"
   is 1, 2,... , 9, or other, respectively. Use:
   (a) a "nested-if" statement;
   (b) a "switch-case-default" statement. */

public class PrintNumber {

	public static void main(String[] args) {
		//Definimos una variable entera en la que vamos a almacenar el numero que enviaremos a uno de nuestros dos metodos
		int num=8;
		//Definimos una variable de tipo String en la que almacenaremos lo que impriman nuestros metodos
		String numero;
		
		//Instanciamos un objeto de nuestra clase para hacer las llamadas a los metodos.
		PrintNumber print=new PrintNumber();
		
		//Hacemos la llamada al metodo de declaraci�n if y lo que devuelva lo almacenaremos en numero para despu�s mostrarlo
		numero=print.printNumberInWordIf(num);
		System.out.println("Seg�n declaraci�n if: "+numero);
		
		//Hacemos la llamada al metodo de declaraci�n switch y lo que devuelva lo almacenaremos en numero para despu�s mostrarlo
		numero=print.printNumberInWordSwitch(num);
		System.out.println("Seg�n declaraci�n switch: "+numero);
	}

	//M�todo est�tico con declaracion if anidada
	public String printNumberInWordIf(int num) {
		String numero = null;
		if (num==1) {
			numero="ONE";
		}else if(num==2) {
			numero="TWO";
		}else if(num==3) {
			numero="THREE";
		}else if(num==4) {
			numero="FOUR";
		}else if(num==5) {
			numero="FIVE";
		}else if(num==6) {
			numero="SIX";
		}else if(num==7) {
			numero="SEVEN";
		}else if(num==8) {
			numero="EIGHT";
		}else if(num==9) {
			numero="NINE";
		}else {
			numero="OTHER";
		}
		return numero;
	}
	
	//M�todo est�tico con declaraci�n switch
	public String printNumberInWordSwitch(int num) {
		String numero = null;
		switch(num){
		case 1:
			numero="ONE";
			break;
		case 2:
			numero="TWO";
			break;
		case 3:
			numero="THREE";
			break;
		case 4:
			numero="FOUR";
			break;
		case 5:
			numero="FIVE";
			break;
		case 6:
			numero="SIX";
			break;
		case 7:
			numero="SEVEN";
			break;
		case 8:
			numero="EIGHT";
			break;
		case 9:
			numero="NINE";
			break;
		default:
			numero="OTHER";
		}
		return numero;
	}
}