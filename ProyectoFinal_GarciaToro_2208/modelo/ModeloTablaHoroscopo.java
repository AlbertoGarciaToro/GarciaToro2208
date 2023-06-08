package modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaHoroscopo implements TableModel {
    ArrayList<Horoscopo> datos;
    public static final int COLS=6;

    public ModeloTablaHoroscopo(ArrayList<Horoscopo> datos) {
        this.datos = datos;
    }

    public ModeloTablaHoroscopo() {
        datos=new ArrayList<>();
    }

    @Override
    public int getRowCount() {//Cuantos elementos va pinta la vista
        return datos.size();
    }

    @Override
    public int getColumnCount() {//Cunatas columnas va a reservar (6)
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {//Titulo de columna
        String nombreCol="";
        switch (columnIndex){
            case 0:
                nombreCol="Id";
                break;
            case 1:
                nombreCol="Horoscopo";
                break;
            case 2:
                nombreCol="Mes de inicio";
                break;
            case 3:
                nombreCol="Mes de finalizacion";
                break;
            case 4:
                nombreCol="Compatible";
                break;
            case 5:
                nombreCol="Url de imagen";
                break;
            default:
                nombreCol="";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {//Que clase pertenece cada columna
        switch (columnIndex){
            case 0:
                return int.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;


        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {//La celda es editable?
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Horoscopo hrc=datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return hrc.getId();
            case 1:
                return hrc.getHoroscopo();
            case 2:
                return hrc.getMesInicio();
            case 3:
                return hrc.getMesFinal();
            case 4:
                return hrc.getCompatible();
            case 5:
                return hrc.getUrlImagen();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex != 0) {
            switch (columnIndex) {

                case 0:
                    datos.get(rowIndex).setId((int) aValue);
                    break;
                case 1:
                    datos.get(rowIndex).setHoroscopo((String) aValue);
                    break;
                case 2:
                    datos.get(rowIndex).setMesInicio((String) aValue);
                    break;
                case 3:
                    datos.get(rowIndex).setMesFinal((String) aValue);
                    break;
                case 4:
                    datos.get(rowIndex).setCompatible((String) aValue);
                    break;
                case 5:
                    datos.get(rowIndex).setUrlImagen((String) aValue);
                    break;
            }

        }



    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarHoroscopo(Horoscopo horoscopo){
        datos.add(horoscopo);
    }
    public Horoscopo getHoroscopoIndex(int idx){
        return datos.get(idx);
    }
    public void actualizarHoroscopo(int rowIndex, Horoscopo horoscopo){
        datos.set(rowIndex,horoscopo);
    }
    public void eliminarHoroscopo(int rowIndex){
        datos.remove(rowIndex);
    }
}
