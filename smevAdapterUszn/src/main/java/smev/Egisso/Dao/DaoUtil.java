package smev.Egisso.Dao;

import lombok.extern.log4j.Log4j2;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class DaoUtil {

    public static ResultSet getResultSet(ResultSet rs, List<Map<String, Object>> rows) throws SQLException {
        try {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<String, Object>(columns);
                //HashMap row = new HashMap(columns);
               //HashMap<String,Object> row = new HashMap<String, Object>(columns);
                for (int i = 1; i <= columns; ++i) {
                    row.put(md.getColumnName(i).toUpperCase(), rs.getObject(i));
                }
                rows.add(row);
                row = null;
            }
            return rs;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
