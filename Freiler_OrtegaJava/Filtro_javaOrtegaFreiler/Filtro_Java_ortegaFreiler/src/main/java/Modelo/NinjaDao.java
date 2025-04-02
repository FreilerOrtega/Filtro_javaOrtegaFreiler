package Modelo;

import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NinjaDao {

    public static List<Ninja> getlistninja()throws SQLException{
        List<Ninja> ninjaslist = new ArrayList<>();

        String sql = "select * from Ninja ";



    }
}
