import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/*Mariana Arroyo Mu�oz
 * 197344
 * 04/12/2020
 * Clase para dise�ar la ventana de Farmacia (elementos visuales)
 */
public class VistaFarmacia extends JFrame {
	
	protected JTextArea info;
	protected JLabel etVacia, etProducto, etMes, etCosto, etImagen;
	protected JTextField ctProducto, ctCosto, ctCantidad, ctMes;
	protected JButton btBuscar, btAlta, btVentasTotales, btMesM�s, btMesMenos, btVentasPromedio, btArribaProm;
	protected JPanel miPanel;
	protected Border miBorde;
	
	public VistaFarmacia () {
		super ("Farmacia San Pablo");
		miPanel = new JPanel (new GridLayout (16,2));
		miBorde = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		miPanel.setBorder(miBorde);
		miPanel.setBackground(Color.cyan); //se le agrega color al fondo

		/*etImagen = new JLabel();
		etImagen.setIcon(new ImageIcon("SanPablo.png"));  //Se agrega una imagen
		etImagen.setHorizontalAlignment(SwingConstants.CENTER);
		etImagen.setVerticalAlignment(SwingConstants.CENTER);
		miPanel.add(etImagen);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);*/
		
		//Primer Rengl�n
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
	
		//Segundo Rengl�n
		info = new JTextArea();
		miPanel.add(info);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//Tercer rengl�n
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//Cuarto Rengl�n
		etProducto = new JLabel ("Producto");
		miPanel.add(etProducto);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//Quinto Rengl�n
		ctProducto = new JTextField (20);
		miPanel.add(ctProducto);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//Sexto Rengl�n
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//S�ptimo Rengl�n
		btBuscar = new JButton ("Buscar");
		miPanel.add(btBuscar);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
	
		//Octavo Rengl�n
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//Noveno Rengl�n
		etMes = new JLabel ("Mes");
		miPanel.add(etMes);
		etCosto = new JLabel ("Costo");
		miPanel.add(etCosto);
		
		//D�cimo Rengl�n
		ctMes = new JTextField (20);
		miPanel.add(ctMes);
		ctCosto = new JTextField (20);
		miPanel.add(ctCosto);
		
		//Onceavo rengl�n
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//Doceavo rengl�n
		btAlta = new JButton ("Alta");
		miPanel.add(btAlta);
		btMesM�s = new JButton ("Mes mayores ventas");
		miPanel.add(btMesM�s);
		
		//Treceavo rengl�n
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		//Catorceavo rengl�n
		btVentasTotales = new JButton ("Ventas Totales");
		miPanel.add(btVentasTotales);
		btMesMenos = new JButton ("Mes menoresVentas");
		miPanel.add(btMesMenos);
		
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		etVacia = new JLabel (" ");
		miPanel.add(etVacia);
		
		btVentasPromedio = new JButton ("Ventas Promedio");
		miPanel.add(btVentasPromedio);
		btArribaProm = new JButton ("Ventas arriba del promedio");
		miPanel.add(btArribaProm);

		
	super.setContentPane(miPanel);
	super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}//Fin de VistaFarmacia
	
}//Fin de la clase VistaFarmacia JFrame
