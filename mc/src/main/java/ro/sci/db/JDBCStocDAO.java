package ro.sci.db;

import ro.sci.dao.StocDAO;
import ro.sci.meniu.Stoc;

import java.sql.*;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by Skipy on 07/06/2017.
 */
public class JDBCStocDAO implements StocDAO{
    private String host;
    private String port;
    private String dbName;
    private String userName;
    private String pass;

    public JDBCStocDAO(String host, String port, String dbName, String userName, String pass) {
        this.host = host;
        this.userName = userName;
        this.pass = pass;
        this.port = port;
        this.dbName = dbName;  }






    @Override
     public Collection<Stoc> listAll() {
        String sql = "select rownum , r.* from (select i.ingredienta, gi.gama_ing, i.stoc_curent, i.stoc_critic, i.um from ingrediente i, gama_ing gi where i.id_gama_ing = gi.id_gama_ing order by gi.id_gama_ing, i.id_ing) r";
        Collection<Stoc> result = new LinkedList<>();
        try (Connection connection = newConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                result.add(extractIngrediente(rs));
            }
            connection.commit();
        } catch (SQLException ex) {
            throw new RuntimeException("Nu sa putut genera lista de ingrediente pe stoc!", ex);
        }
        return result;
    }

    protected Connection newConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            String url = new StringBuilder()
                    .append("jdbc:oracle:thin:@")
                    .append(host)
                    .append(":")
                    .append(port)
                    .append(":")
                    .append(dbName).toString();
            Connection result = DriverManager.getConnection(url, userName, pass);
            result.setAutoCommit(false);
            return result;
        } catch (Exception ex) {
            throw new RuntimeException("Error getting DB connection", ex);
        }
    }

    private Stoc extractIngrediente(ResultSet rs) throws SQLException {
        Stoc stoc = new Stoc();
        stoc.setNrCrt(rs.getInt("rownum"));
        stoc.setIngredienta(rs.getString("ingredienta"));
        stoc.setGamaIngedienta(rs.getString("gama_ing"));
        stoc.setStocCurent(rs.getInt("stoc_curent"));
        stoc.setStocCritic(rs.getInt("stoc_critic"));
        stoc.setuM(rs.getString("um"));
        return stoc;
    }

    @Override
    public Collection<Stoc> getAll() {
        return null;
    }
}
