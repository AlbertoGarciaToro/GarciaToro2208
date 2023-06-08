package persistencia;

import modelo.Horoscopo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HoroscopoDAO implements InterfazDAO{
    private static int ultimoId = 0;
    public HoroscopoDAO() {
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int nuevoUltimoId) {
        ultimoId = nuevoUltimoId;
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {//Metodo para establecer valor en PreparedStatement
        String sqlInsert = "INSERT INTO Horoscopos(Horoscopo, MesInicio, MesFinalizacion, CompatibleCon, UrlImagen) VALUES (?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Horoscopo.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Horoscopo) obj).getHoroscopo());
        pstm.setString(2, ((Horoscopo) obj).getMesInicio());
        pstm.setString(3, ((Horoscopo) obj).getMesFinal());
        pstm.setString(4, ((Horoscopo) obj).getCompatible());
        pstm.setString(5, ((Horoscopo) obj).getUrlImagen());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {//Metodo para establecer valor en PreparedStatement
        String sqlUpdate = "UPDATE Horoscopos SET Horoscopo = ?, MesInicio = ?, MesFinalizacion = ?, CompatibleCon = ?, UrlImagen = ? WHERE Id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Horoscopo.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Horoscopo) obj).getHoroscopo());
        pstm.setString(2, ((Horoscopo) obj).getMesInicio());
        pstm.setString(3, ((Horoscopo) obj).getMesFinal());
        pstm.setString(4, ((Horoscopo) obj).getCompatible());
        pstm.setString(5, ((Horoscopo) obj).getUrlImagen());
        pstm.setInt(6, ((Horoscopo) obj).getId());
        rowCount = pstm.executeUpdate(); // Ejecutar la consulta de actualización
        return rowCount > 0; // Devolver true si se actualizó al menos una fila
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Horoscopos WHERE Id = ?";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Horoscopo.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id)); // Establecer el valor de Id en el PreparedStatement
        rowCount = pstm.executeUpdate(); // Ejecutar la consulta de eliminación
        return rowCount > 0; // Devolver true si se eliminó al menos una fila
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Horoscopos";
        ArrayList<Horoscopo> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("Horoscopo.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql); // Ejecutar la consulta de selección
        while (rst.next()) {
            // Crear un objeto Audifono a partir de los datos obtenidos de la base de datos
            resultado.add(new Horoscopo(rst.getInt("Id"), rst.getString("Horoscopo"), rst.getString("MesInicio"), rst.getString("MesFinalizacion"), rst.getString("CompatibleCon"), rst.getString("UrlImagen")));
        }
        return resultado;
    }

    @Override
    public Horoscopo buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Horoscopos WHERE Id = ?";
        Horoscopo horoscopo = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("Horoscopo.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            horoscopo = new Horoscopo(rst.getInt("Id"), rst.getString("Horoscopo"), rst.getString("MesInicio"), rst.getString("MesFinalizacion"), rst.getString("CompatibleCon"), rst.getString("UrlImagen"));
        }
        return horoscopo;
    }
}