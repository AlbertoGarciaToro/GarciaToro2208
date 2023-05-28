package org.SQLiteDemo.ActividadExtra8GarciaToro;

import org.SQLiteDemo.Libro;
import org.SQLiteDemo.LibroDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaLibro implements TableModel {
    public static final int COLUMNS=3;
    private ArrayList<Libro> datos;
    private LibroDAO ldao;

    public ModeloTablaLibro() {
        ldao=new LibroDAO();
        datos=new ArrayList<>();

    }

    public ModeloTablaLibro(ArrayList<Libro> datos) {
        this.datos = datos;

    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";
            case 1:
                return "Libro";
            case 2:
                return "Autor";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columIndex) {
        Libro tmp=datos.get(rowIndex);
        switch (columIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getTitulo();
            case 2:
                return tmp.getAutor();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                break;
            case 1:
                datos.get(rowIndex).setTitulo((String) o );
                break;
            case 2:
                datos.get(rowIndex).setAutor((String) o );
                break;
            default:
                System.out.println("No se modifica");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            datos=ldao.obtenerTodo();

        }catch (SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
}
