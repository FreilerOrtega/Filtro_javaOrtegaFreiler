
package Modelo;

import java.sql.*;

public class Conect {

    Connection con = null;
    private static String url = "jdbc:mysql://bx2ximvpudsyi9wxukob-mysql.services.clever-cloud.com:3306/bx2ximvpudsyi9wxukob";
    private static String user = "uv5yecomlgx8taau";
    private static String password="IRMmcBgQHKNL7P9LunB7";

    public static Connection getCon() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,password);
            System.out.println( "connection successful");
        } catch (SQLException e) {
            System.out.println("Error al conectar la base de datos: "+e.getMessage());
        }

        return con;
    }

    public static void main(String[] args) {
        Connection con = getCon();
    }
}