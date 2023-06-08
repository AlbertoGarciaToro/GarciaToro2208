package controlador;

import modelo.Horoscopo;
import modelo.ModeloTablaHoroscopo;
import vista.VentanaHoroscopo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorHoroscopo extends MouseAdapter {
    private VentanaHoroscopo view;
    private ModeloTablaHoroscopo modelo;

    public ControladorHoroscopo(VentanaHoroscopo view) {
        this.view = view;
        this.view.getBotonAdd().addMouseListener(this);
        this.view.getTabla().addMouseListener(this);
        modelo=new ModeloTablaHoroscopo();
        this.view.getTabla().setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== view.getBotonAdd()){
            System.out.println("Eventos sobre boton add");
            Horoscopo horoscopo=new Horoscopo();
            horoscopo.setId(Integer.parseInt(this.view.getTxtId().getText()));
            horoscopo.setHoroscopo(this.view.getTxtHoroscopo().getText());
            horoscopo.setMesInicio(this.view.getTxtMesInicio().getText());
            horoscopo.setMesFinal(this.view.getTxtMesFinal().getText());
            horoscopo.setCompatible(this.view.getTxtCompatible().getText());
            horoscopo.setUrlImagen(this.view.getTxtUrlImagen().getText());
            modelo.agregarHoroscopo(horoscopo);
            this.view.getTabla().updateUI();
        }
        if (e.getSource()== view.getTabla()){
            System.out.println("Eventos sobre tabla ");
            int index =this.view.getTabla().getSelectedRow();
            Horoscopo horos=modelo.getHoroscopoIndex(index);
            try {
                this.view.getImagenHoroscopo().setIcon(horos.getImagen());
                this.view.getImagenHoroscopo().setText("");

            }catch (MalformedURLException mue){
                System.out.println(mue.toString());
            }
        }
        if (e.getSource() == view.getBotonEliminar()) {
            System.out.println("Eventos sobre boton eliminar");
            eliminarHoroscopoSeleccionado();
        }
        if (e.getSource() == view.getBotonActualizar()) {
            System.out.println("Eventos sobre boton actualizar");
            actualizarHoroscopoSeleccionado();
        }
        this.view.getBotonEliminar().addMouseListener(this);
        this.view.getBotonActualizar().addMouseListener(this);

    }
    public void actualizarHoroscopoSeleccionado() {
        int rowIndex = view.getTabla().getSelectedRow();
        if (rowIndex >= 0) {
            Horoscopo horoscopo = modelo.getHoroscopoIndex(rowIndex);
            horoscopo.setHoroscopo(view.getTxtHoroscopo().getText());
            horoscopo.setMesInicio(view.getTxtMesInicio().getText());
            horoscopo.setMesFinal(view.getTxtMesFinal().getText());
            horoscopo.setCompatible(view.getTxtCompatible().getText());
            horoscopo.setUrlImagen(view.getTxtUrlImagen().getText());
            modelo.actualizarHoroscopo(rowIndex, horoscopo);
            view.getTabla().updateUI();
        }
    }
    public void eliminarHoroscopoSeleccionado() {
        int rowIndex = view.getTabla().getSelectedRow();
        if (rowIndex >= 0) {
            modelo.eliminarHoroscopo(rowIndex);
            view.getTabla().updateUI();
        }
    }

}
