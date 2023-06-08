package modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Horoscopo {
    private int id;
    private String horoscopo;
    private String mesInicio;
    private String mesFinal;
    private String compatible;
    private String urlImagen;

    public Horoscopo() {
    }

    public Horoscopo(int id, String horoscopo, String mesInicio, String mesFinal, String compatible, String urlImagen) {
        this.id = id;
        this.horoscopo = horoscopo;
        this.mesInicio = mesInicio;
        this.mesFinal = mesFinal;
        this.compatible = compatible;
        this.urlImagen = urlImagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoroscopo() {
        return horoscopo;
    }

    public void setHoroscopo(String horoscopo) {
        this.horoscopo = horoscopo;
    }

    public String getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(String mesInicio) {
        this.mesInicio = mesInicio;
    }

    public String getMesFinal() {
        return mesFinal;
    }

    public void setMesFinal(String mesFinal) {
        this.mesFinal = mesFinal;
    }

    public String getCompatible() {
        return compatible;
    }

    public void setCompatible(String compatible) {
        this.compatible = compatible;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "Horoscopo{" +
                "id=" + id +
                ", horoscopo='" + horoscopo + '\'' +
                ", mesInicio='" + mesInicio + '\'' +
                ", mesFinal='" + mesFinal + '\'' +
                ", compatible='" + compatible + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                '}';
    }
    public ImageIcon getImagen()throws MalformedURLException {
        URL urlIma=new URL(this.urlImagen);
        return new ImageIcon(urlIma);
    }
}
