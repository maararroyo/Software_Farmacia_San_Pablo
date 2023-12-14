/*Mariana Arroyo Muñoz
 * 197344
 * 04/12/2020
 * 
 */
public class Ventas {

		//Atributos
		private double monto;
		private String nombre;
		
		//Constructor
		public Ventas(double monto, String nombre) {
			this.monto = monto;
			this.nombre = nombre;
		}

		//get´s
		public double getMonto() {
			return monto;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		//set´s
		public void setMonto(double otroMonto) {
			monto=otroMonto;
		}
		
		public void setNombre(String otroNombre) {
			nombre=otroNombre;
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
			Ventas other = (Ventas) obj;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}

		//compareTo
		public int compareTo(Ventas otraVenta) {
			int x;
			if(otraVenta.getMonto()<monto)
				x=1;
			else if(otraVenta.getMonto()==monto)
				x=0;
			else
				x=-1;
			return x;
		}
		
		//toString
		public String toString() {
			StringBuilder sb;
			sb= new StringBuilder();
			sb.append("Venta\n");
			sb.append("\nmonto:$"+monto);
			sb.append("nombre:"+nombre);
			return sb.toString();
		}
		
}//Fin de la clase Venta
