
/* Write a method called checkOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
   Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0. */

public class ParImpar {

	public static void main(String[] args) {
		//Variable en la que almacenamos el numero entero que queremos pasarle al metodo checkOddEven y que nos dirá si es par o impar
		int num=5;
		
		//instanciamos un objeta de la clase para llamar al metodo
		ParImpar parimpar=new ParImpar();
		
		//hacemos la llamada a través del objeto
		parimpar.checkOddEven(num);
	}
	
	//Metodo que nos dice si el numero dado es par o impar
	public void checkOddEven(int num) { 
		 if(num%2==0) {
			 System.out.println("El número introducido es "+num+" y es Par");
		 }else {
			 System.out.println("El número intoducido es "+num+" y es Impar");
		 }
	}

}
