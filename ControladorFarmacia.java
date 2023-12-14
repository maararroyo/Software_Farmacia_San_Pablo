import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

/*Mariana Arroyo Muñoz
 * 197344
 * 04/12/2020
 * Clase para poner funcionalidad a la VistaFarmacia y llamar a la Farmacia
 */
public class ControladorFarmacia extends VistaFarmacia {

	private Farmacia miFarmacia;
	private JTextField matriz[][];
	private final int MAXF = 5;
	private final int MAXC = 2;
	
	public static String [][] cargarMatrizMedicamentos(String nombreArchivo){
		
		String [][] matrizMedicamentos = new String [6][3];
		File miArchivo;
		Scanner lectura;
		int i, j, n=5 ,m=2;
		
		nombreArchivo = nombreArchivo+".txt";
		miArchivo = new File (nombreArchivo);
		try {
			lectura = new Scanner (miArchivo);
			for (i=0; i<=n; i++) {
				for(j=0;j<=m ;j++) {
					matrizMedicamentos[i][j] = lectura.next();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return matrizMedicamentos;
	}
	
	public class EscuchaBusqueda implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String producto;
			int resp;
			
			producto = ctProducto.getText();
			resp = miFarmacia.buscaMedicamento(cargarMatrizMedicamentos("medicamentos"), MAXF, MAXC, producto);
			if (resp == -1)
				info.setText("No disponible");
			else
				info.setText("En existencia");
				
		}
		
	}//Fin de EscuchaBusqueda
	
	public class EscuchaAlta implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int mes;
			double monto;
			boolean resp;
			
			monto = Double.parseDouble(ctCosto.getText());
			mes = Integer.parseInt(ctMes.getText());
			resp = miFarmacia.altaVenta(mes, monto);
			if (resp = true)
				info.setText("Gracias por su compra");
			else
				info.setText("Alta NO Esxitosa");
			
		}
	}//Fin de EscuchaAlta
	
	public class EscuchaVentasTotales implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			double total, resp;
			
			total = Double.parseDouble(ctCosto.getText());
			resp = miFarmacia.indicaVentasTotales();
			info.setText("Ventas Totales: "+resp);
		}
	}
	
	public class EscuchaPromedio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double resp;
			
			resp = miFarmacia.calculaPromedio();
			info.setText("Promedio de ventas: "+resp);
		}
		
	}//Fin de EscuchaPromedio
	
	public class EscuchaMayoresVentas implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int mes;
			String resp;
			
			mes = Integer.parseInt(ctMes.getText());
			resp = String.valueOf(miFarmacia.indicaMesMayoresVentas());
			info.setText("Mes Mayores Ventas: "+resp);
		}
	}
	
	public class EscuchaMenosVentas implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int mes;
			String resp;
			
			mes = Integer.parseInt(ctMes.getText());
			resp = String.valueOf(miFarmacia.indicaMesMenoresVentas());
			info.setText("Mes Menores Ventas: "+resp);
		}
	}
	
	public class EscuchaArribaPromedio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int mes;
			String resp;
			
			mes = Integer.parseInt(ctMes.getText());
			resp = String.valueOf(miFarmacia.indicaMesArribaProm());
			info.setText("Mes Arriba del Promedio: "+resp);
		}
	}

	public ControladorFarmacia () {
		super ();
		miFarmacia = new Farmacia();
		btBuscar.addActionListener(new EscuchaBusqueda());
		btAlta.addActionListener(new EscuchaAlta());
		btVentasPromedio.addActionListener(new EscuchaPromedio());
		btVentasTotales.addActionListener(new EscuchaVentasTotales());
		btMesMás.addActionListener(new EscuchaMayoresVentas());
		btMesMenos.addActionListener(new EscuchaMenosVentas());
		btArribaProm.addActionListener(new EscuchaArribaPromedio());
		
	}
	
}//Fin de la clase ControladorFarmacia
