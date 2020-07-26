package javamysql;

import java.sql.*;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
        String name, producttype, created;
        double price, Number;

        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        Statement state = null;
        
        System.out.print("ประเภทสิ้นค้า :  ");
        producttype = sc.nextLine();
        
        System.out.print("ชื่อสิ้นค้า :  ");
        name = sc.nextLine();

        System.out.print("ราคาสิ้นค้า :  ");
        price = sc.nextInt();

        

        System.out.print("จำนวน :  ");
        Number = sc.nextInt();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost/javadb"
                    + "?user=root&password=");

            state = connect.createStatement();

            String sql;
            sql = "INSERT INTO products"
                    + "(name,price,producttype,Number)"
                    + "VALUES ('" + name + "','" + price + "','" + producttype + "','" + Number +"')";
            state.execute(sql);
            System.out.println("Recrd Inserted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
