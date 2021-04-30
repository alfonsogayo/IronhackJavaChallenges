
public class Promedio {

	public static void main(String[] args) {
		//Creamo un array de enteros que contiene los números de los que queremos calcular el promedio
		int[] numList= {9,9,8};
		
		/* Creamos una instancia del objeto para hacer la llamada al metodo y lo que nos devuelvo lo almacenamos en la variable
		   media para después mostrarlo por pantalla. */
		Promedio promedio=new Promedio();
		double media=promedio.average(numList);
		System.out.println("La media de los elementos facilitados es "+media);
	}
	
	//Médoto que calcula el promedio de una lista de número y nos lo devuelve como un dato de tipo Double
	public double average(int[] numList) { 
		int suma = 0;
		for(int i=0;i<numList.length;i++) {
			suma=suma+numList[i];
		}
		double media=(double) suma/numList.length;
		return media;
	}

}
