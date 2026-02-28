package ge.tbc.testautomation.util;


import java.sql.*;
import java.util.*;

public class DBUtils {

    public static List<Object[]> getLocationsData() throws Exception {

        Connection conn = DriverManager.getConnection("jdbc:h2:~/testdb", "sa", "");

        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE IF NOT EXISTS locations(area VARCHAR, expected INT)");
        stmt.execute("INSERT INTO locations VALUES('Tbilisi',1)");

        ResultSet rs = stmt.executeQuery("SELECT * FROM locations");

        List<Object[]> data = new ArrayList<>();

        while (rs.next()) {
            data.add(new Object[]{
                    rs.getString("area"),
                    rs.getInt("expected")
            });
        }

        return data;
    }
}