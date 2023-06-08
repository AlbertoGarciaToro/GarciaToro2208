package persistencia;

import modelo.Horoscopo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDAO {//Metodos para modificar la base de datos
    public abstract boolean insertar(Object obj) throws SQLException;
    public abstract boolean update(Object obj) throws SQLException;
    public abstract boolean delete(String id) throws SQLException;
    public abstract ArrayList obtenerTodo() throws SQLException;
    public abstract Horoscopo buscarPorId(String id) throws SQLException;
}
