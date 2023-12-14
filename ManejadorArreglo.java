import java.util.*;

/*Mariana Arroyo Muñoz }
 * 197344
 * 02/10/2020
 * Clase para el manejo general de arreglos
 */
public class ManejadorArreglo {
	
	//SUMA

	public static double sumArreglo(double a[], int n) {
		double suma;
		int i;
		
		suma=0;
		for(i=0;i<n;i++)
			suma=suma+a[i];
		return suma;
	}
	
	//PROMEDIO
	
	public static double promedioArreglo(double a[], int n) {
		double suma, prom;
		
		suma=sumArreglo(a,n);
		prom=suma/n;
		return prom;
	}
	
	//INDICE MAYOR
	
	public static int indiceMayor(double a[], int n) {
		int mayor, i;
		
		mayor=0;
		for(i=1;i<n;i++)
			if(a[i]>a[mayor])
				mayor=i;
		return mayor;
	}
	
	//INDICE MENOR
	
	public static int indiceMenor(double a[], int n) {
		int menor, i;
		
		menor=0;
		for(i=1;i<n;i++)
			if(a[i]<a[menor])
				menor=i;
		return menor;
	}
	
	//MAYOR A CIERTO PARÁMETRO
	
	public static int mayorArreglo(double a[], int n) {
		int mayor, i;
		
		mayor=0;
		for(i=1;i<n;i++)
			if(a[i]>a[mayor])
				mayor = i;
		return mayor;
	}
	
	//MENOR A CIERTO PARÁMETRO
	
	public static int menorArreglo(double a[], int n) {
		int menor, i;
		
		menor = 0;
		for(i=1; i<n; i++)
			if(a[i]<a[menor])
				menor = i;
		return menor;
	}
	
	//CUANTOS ELEMENTOS MAYORES AL PARÁMETRO
	
	public static int cuantosMayorA(double a[], int n, double p) {
		int i, cuantos;
		
		cuantos = 0;
				for (i = 0; i<n; i++)
					if(a[i]>p)
						cuantos ++;
				return cuantos;
	}
	
	public static ArrayList<Double> cualesMayorA (double a[], int n, double p){
		int i;
		ArrayList<Double> cuales;
		
		cuales=new ArrayList<Double>();
		for(i=0; i<n; i++)
			if(a[i]>p)
				return cuales;
		return cuales;
	}
	
	//CUANTOS ELEMENTO MENORES AL PARÁMETRO
	
	public static int cuantosMenorA(double a [], int n,double p) {
		int i, cuantos;
		
		cuantos=0;
		for(i=0;i<n;i++)
			if(a[i]<p)
				cuantos++;
		return cuantos;
	}
	
	//CORRER LOS ELEMENTOS UN LUGAR A LA DERECHA
	
	public static void recorreDerecha (double a [], int n) {
		int i;
		for (i=n-1; i>0;i--)
			a[i]=a[i-1];
		a[0]=0;
	}
	
	//CORRER LOS ELEMENTOS UN LUGAR A LA IZQUIERDA
	
	public static void recorreIzquierda(double a[], int n) {
		int i;
		for (i=0; i<n-1;i++)
			a[i]=a[i+1];
		a[n-1]=0;
	}
	
	//RECORRER LOS ELEMENTOS A LA IZQUIERDA APARTIR DE UNA POSICIÓN
	public static void recorreIzquierdaApartirPos(double a[], int n, int pos) {
		int i;
		for(i=pos; i<n-1; i++)
			a[i] = a[i+1];
		a[n-1]=0;
	}
	//INVERTIR LOS ELEMENTOS
	
	public static void invertir (int a[]) {
		int j=0, k=0, n=0;
		for(int i=0; i<n/2;i++) {
			j=a[i];
			k=a[n-1-i];
			
			a[i]=k;
			a[n-1-i]=j;
		}
	}
	
	//ELEMENTOS CAPICÚOS
	public static boolean esCapicua(double a[], int n) {
		int i, mitad;
		boolean resp;
		
		mitad=n/2;
		i=0;
		while (i<mitad && a[i]==a[n-1-i])
			i++;
		if(i<mitad)
			resp=false;
		else
			resp=true;
		return resp;
	}
	
	//ELIMINA REPETIDOS
	public static void eliminaRepetidos (double a[], int n) {
		int i, j, k;
		for(i=0;i<n;i++) {//recorrer el arreglo
			j=i+1;
			while (j<n && a[i]!=a[j])//lo busca
				j++;
			if(j<n) {//si esta
				for(k=j;k<n-1;k++)//recorre izquierda
					a[k]=a[k+1];
				a[n-1]=0;
				n--;//para no revisar los ceros del final
				i--;//por si hay más de 1 repetido contiguo
			}
		}
	}
	
	//ORDENA ARREGLO
	public static void ordena(double a[], int n) {
		int i, j, menor;
		double aux;
		
		for (i=0; i<n-1; i++) {
			menor = i;
			for (j=i+1; j<n; j++)
				if (a[j]<a[menor])
					menor=j;
			aux=a[i];
			a[i]=a[menor];
			a[menor]=aux;
		}
	}
		
	//BUSCAR UNA SECUENCIA DADO UN VALOR (cuando no tiene orden)
		public static int buscaSeq(double a[], int n, double valor) {
			int i, pos;
		
		i=0;
		while(i<n && a[i]!=valor)
			i++;
		if(i<n)
			pos=i;
		else
			pos=-1;
		return pos;	
		
	}//Fin del método
	
}//Fin de la clase
