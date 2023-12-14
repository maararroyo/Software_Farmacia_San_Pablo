import java.util.ArrayList;

/*Mariana Arroyo Muñoz
 * 197344
 * 10/11/2020
 */
public class ManejadorMatricesGenerico {
	
	public static <T extends Comparable<T>> int buscaPorRenglon(T a[][], int f,int c, T valor) {
		//busca valor en a en la fila 
			int n, m, j;
			boolean encontre;
			
			n = a.length;
			m = a[0].length;
			j = 0;
			encontre = false;
			while (j<m && encontre == false) {
				if (a[f][j]!=null && a[f][j].equals(valor))
						encontre = true;
				else
					j++;
			}
			if (!encontre)
				j = -1;
			return j;
	}
	
	public static <T extends Comparable <T>> ArrayList<T> creaString(T a[][],int f, int c) {
		//regresa en forma de string los elementos de una matriz
		int i, j;
		ArrayList<T> lista;
		lista= new ArrayList<T>();
		for(i=0;i<f;i++) 
			for(j=0;j<c;j++) {
				lista.add((T) a[i][j]);	
			}
		return lista;
	}

	public static <T extends Comparable<T>> int busca(T a[][], int f, int c,  T valor) {
		//busca valor en a 
		int i,j,pos;
		pos=0;
		for(i=0;i<f;i++) 
			for(j=0;j<c;j++) {
				while(j<c && !a[i][j].equals(valor))
					i++;
				if(j<c)
					pos=i;
				else
					pos=-1;
			}
		return pos;
	}
	
	public static <T extends Comparable<T>> int buscarEnMatriz(T a[][], int f, int c,  T valor) {
		int resultado = -1;
		for(int ren=0; ren<=f;ren++) {
			for(int col=0;col <=c; col++) {
				if(a[ren][col].equals(valor)) {
					resultado= 1;
				} 
			}
		}
		return resultado;
	}

	public static <T extends Comparable <T>> int indicaMayorColumna(T a[][], int c) {
		int i, mayor;
		
		mayor = 0;
		for ( i = 1; i<c; i++)
			if(a[i][c].compareTo(a[mayor][c])>0)
				mayor = i;
		return mayor;
	}
	
	public static <T extends Comparable <T>> int indicaMenorColumna(T a[][], int c) {
		int i, menor;
		
		menor = 0;
		for ( i = 1; i<c; i++)
			if(a[i][c].compareTo(a[menor][c])<0)
				menor = i;
		return menor;
	}
	
	public static <T extends Comparable <T>> int indicaMayorFila(T a[][], int f) {
		int j, mayor;
		
		mayor = 0;
		for ( j = 1; j<f; j++)
			if(a[f][j].compareTo(a[f][mayor])>0)
				mayor = j;
		return mayor;
	}

	public static <T extends Comparable <T>> int indicaMenorFila(T a[][], int f) {
		int j, menor;
		
		menor = 0;
		for ( j = 1; j<f; j++)
			if(a[f][j].compareTo(a[f][menor])>0)
				menor = j;
		return menor;
	}
	
	public static <T extends Comparable <T>> boolean sonIguales(T a[][], int f, int c, T b[][]) {
		boolean resp=false;
		int i,j;
		for(i=0;i<f;i++) 
			for(j=0;j<c;j++) {
				if(a[i][j].equals(b[i][j]))
					resp=true;
					else
						resp=false;
			}
		return resp;
	
	}
	
	public static <T extends Comparable<T>> boolean matrizDiagonalInfMay(T a[][], int f, int c) {
		int i,j;
		boolean resp=false;
		for(i=0;i<f;i++) 
			for(j=0;j<c;j++) {
				while(a[i+1][0].compareTo(a[0][j+1])>0)
					resp=true;
				
			}
		return resp;
		
		
	}
	
}//Fin de la clase
