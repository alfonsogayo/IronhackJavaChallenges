
//Write a method maximum that returns the largest integer in the list. You can assume that the list has at least one element.

public class Maximum {

	public static void main(String[] args) {
		//creamo un array de enteros
		int[] numList= {10,5,17,22,3};
		
		//Instanciamos un objeto de nuestra clase para hacer las llamadas a los metodos.
		Maximum max=new Maximum();
		
		//almacenamos en una variable de tipo entero el resultado de llamar al metodo maximum pasandole nuestro array
		int mayor=max.maximum(numList);
		
		System.out.println("El número entero más grande obtenido es: "+mayor);
	}
	
	public int maximum(int[] numList) {
		//Suponemos que la lista tiene al menos un elemento y que este es el mayor
		int max=numList[0];
		
		/*Recorremos la lista y si encontramos algún elemento mayor que el que tenemos almacenado en la variable max,
		lo sustitumos por el que teniamos guardado*/
		for(int i=0;i<numList.length;i++) {
			if (numList[i]>max) {
				max=numList[i];
			}
		}
		
		//Devolvemos el valor maximo obtenido
		return max;
	}

}
