/*Mariana Arroyo Muñoz
 * 197344
 * 29/11/2020
 * 
 * Clase de una matriz de medicinas
 */
public class Medicinas {
	private String nombre;
	private char tipo; //D (dormir), B (bebés), H (higiene), M (malestares), C (condones), P (primeros auxilios)
	private String codigo; //código de indentificación
	private int precio;
	
	//Constructor generado
	public Medicinas(String nombre, char tipo, String codigo, int precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.codigo = codigo;
		this.precio = precio;
	}

	//Get's y Set's
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public char getTipo() {
		return tipo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	//Equals con Código de Identificación
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Medicinas other = (Medicinas) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	//compareTo
	public int compareTo (Medicinas otro) {
		return codigo.compareTo(otro.getCodigo());
	}
	
	//toString
	public String toString() {
		StringBuilder sb;
		sb= new StringBuilder();
		sb.append("Medicina \n");
		sb.append("nombre:"+nombre);
		sb.append("Tipo: "+tipo);
		sb.append("Código de Identificación: "+codigo);
		sb.append("Precio : "+precio);
		return sb.toString();
	}

}//Fin de la clase medicinas
