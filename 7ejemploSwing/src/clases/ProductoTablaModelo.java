/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CesarAlex
 */
public class ProductoTablaModelo extends AbstractTableModel {
    
    public List<Producto> productos= new ArrayList<Producto>();

    @Override
    public int getRowCount(){
            return productos.size();
    }

    @Override
    public int getColumnCount(){
            return 4;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex){

	Object valor=null;

	switch(columnIndex){
	  case 0: valor= productos.get(rowIndex).codigo;
		break;
	  case 1: valor= productos.get(rowIndex).nombre;
		break;

	  case 2: valor= productos.get(rowIndex).marca;
		break;
	  case 3: valor= productos.get(rowIndex).precio;
		break;



	}
	return valor;

}
    
    
}
