package qltv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
    public static void main(String args[]) {
      Connection conn;
        conn = null;
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/qltv_ct467?"
                                            + "user=root");

         System.out.println("Noi ket thanh cong");
    } catch (ClassNotFoundException | SQLException ex) { //xử lý ngoại lệ nếu có
            System.out.println("Noi ket khong thanh cong");
            }
        }
    }

