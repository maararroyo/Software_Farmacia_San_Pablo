/*Mariana Arroyo MUñoz
 * 197344
 * 30/11/2020
 * Clase para dar funcionalidad
 */
public class Farmacia {
	
	private String nombre;
	private String direccion;
	private Medicinas [][] producto; //MATRIZ DE MEDICINAS
	private final int MAXC = 3; //3 columnas de medicamentos
	private final int MAXF = 6; //6 renglónes de tipo de medicamentos
	private double ventas[]; //ARREGLO DE VENTAS;
	private final int TOTALVENTAS = 12;
	private String [] meses= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	
	//Constructor vacío
	public Farmacia() {
		ventas = new double[TOTALVENTAS];
	}

	//Constructor Generado
	public Farmacia(String nombre, String direccion, int ocupados) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	//Get's y Set's
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	//equals con Nombre
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farmacia other = (Farmacia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	//compareTo
	public int compareTo(Farmacia otra) {
		return nombre.compareTo(otra.getNombre());
	}
		
	//----------> FUNCIONES <----------
	
	//BUSCA MEDICAMENTO (matriz usando genéricos)
	public static <T extends Comparable<T>> int buscaMedicamento (T producto[][], int f,int c, T medicina) {
			int medicinas;
			
			medicinas = ManejadorMatricesGenerico.buscarEnMatriz(producto, f, c, medicina);
			return medicinas;
	}
	
	//ALTA VENTA
	public boolean altaVenta(int mes, double monto) {
		boolean resp;
		if(mes>=1 && mes<=TOTALVENTAS) {
			ventas[mes-1]=monto;
			resp=true;
		}
		else 
			resp=false;
		return resp;//"Gracias por su compra"
	}
	
	//PROMEDIO
	
	public double calculaPromedio() {
		double prom;
		prom= ManejadorArreglo.promedioArreglo(ventas, TOTALVENTAS);
		return prom;
	}
	
	//MES CON MÁS VENTAS
	
	public int indicaMesMayoresVentas1() {
		int mes;
		mes=ManejadorArreglo.indiceMayor(ventas, TOTALVENTAS);
		mes++;
		return mes;
	}
	
	//NOMBRE DEL MES CON MÁS VENTAS
	
	public String indicaMesMayoresVentas() {
		int mes;
		String nombreMes;
		mes=ManejadorArreglo.indiceMayor(ventas, TOTALVENTAS);
		nombreMes= meses [mes];
		return nombreMes;
	}
	
	//MES CON MENOS VENTAS
	public int indicaMesMenoresVentas1() {
		int mes;
		
		mes=ManejadorArreglo.indiceMenor(ventas, TOTALVENTAS);
		mes++;
		return mes;
	}
	
	//NOMBRE DEL MES CON MENOS VENTAS
	public String indicaMesMenoresVentas() {
		int mes;
		String nombreMes;
		
		mes=ManejadorArreglo.indiceMenor(ventas, TOTALVENTAS);
		nombreMes= meses [mes];
		return nombreMes;
	}
	
	//MES CON VENTAS ARRIBA DEL PROMEDIO
	public int indicaCuantosArribaProm() {
		int cuantos;
		double promedio;
		
		promedio = ManejadorArreglo.promedioArreglo(ventas, TOTALVENTAS);
		cuantos = ManejadorArreglo.cuantosMayorA(ventas, TOTALVENTAS, promedio);
		return cuantos;
	}
	
	//NOMBRE DEL MES CON VENTAS ARRIBA DEL PROMEDIO
	public String indicaMesArribaProm() {
		int cuantos;
		double promedio;
		String nombreMes;
		
		promedio = ManejadorArreglo.promedioArreglo(ventas, TOTALVENTAS);
		cuantos = ManejadorArreglo.cuantosMayorA(ventas, TOTALVENTAS, promedio);
		nombreMes = meses [cuantos];
		return nombreMes;
	}
	
	//VENTAS TOTALES
	public double indicaVentasTotales() {
		double suma;
		
		suma = ManejadorArreglo.sumArreglo(ventas, TOTALVENTAS);
		return suma;
	}
	
}
