/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import ventanas.Ventana;

/**
 *
 * @author CesarAlex
 */
public class Controladora {
    
    
     public static void main(String args[]) {

         Ventana miVentana= new Ventana();

         miVentana.setVisible(true);
         

Ventana miventana=new Ventana();
miventana.setVisible(true);

String[] codigos={"lb456","bw456","cn785","ty789"};
String[] nombres={"lapicero","borrador","cuaderno","folder"};
String[] marcas={"bic","staedtler","norma","san rey"};
double[] precios={0.25,0.50,1.25,0.5};

for(int i=0;i<4;i++){
	Producto p=new Producto();
	p.codigo=(codigos[i]);
	p.nombre=(nombres[i]);
	p.marca=(marcas[i]);
	p.precio=(precios[i]);

	miventana.modeloProductos.productos.add(p);
}         
   
    }
    
}
