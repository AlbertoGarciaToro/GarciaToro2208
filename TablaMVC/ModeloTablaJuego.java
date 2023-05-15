package TablaMVC;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    public static final int COLS = 6;
    ArrayList<Videojuego> datos;

    public ModeloTablaJuego(ArrayList<Videojuego> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columNombre = "";
        switch (columnIndex) {
            case 0:
                columNombre = "id";
                break;
            case 1:
                columNombre = "Nombre";
                break;
            case 2:
                columNombre = "Genero";
                break;
            case 3:
                columNombre = "Peso en GB";
                break;
            case 4:
                columNombre = "Plataforma";
                break;
            case 5:
                columNombre = "Desarrollador";
                break;

        }
        return columNombre;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }

        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Videojuego tnp=datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tnp.getId();
            case 1:
                return tnp.getNombre();
            case 2:
                return tnp.getGenero();
            case 3:
                return tnp.getPesoEnGB();
            case 4:
                return tnp.getPlataforma();
            case 5:
                return tnp.getDesarrollador();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarJuego(Videojuego juego){
        this.datos.add(juego);

    }
}
