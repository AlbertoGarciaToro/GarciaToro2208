package org.SQLiteDemo.PatronDeAccesoADatos;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LibroDAO ldao=new LibroDAO();

       /* Libro libro=new Libro(1,"El perfume"," Patrick ");
        try {
            if (ldao.update(libro)){
                System.out.println("se inserto correctamnete ");
            }else {
                System.out.println("No se pudo insertar ");
            }
        }catch (SQLException sqle){
            System.out.println("error al insertar");
        }*/
        try {
            if (ldao.delete("11")){
                System.out.println("se elimino correctamente");
        }else {
                System.out.println("No se pudo eliminar ");
            }
    }catch (SQLException sql){
            System.out.println("Error al eliminar");
            System.out.println(sql.getMessage());
        }
}
}