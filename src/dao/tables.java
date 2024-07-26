/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author divyasharma
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//           st.executeUpdate("CREATE TABLE appuser (appuser_pk INT AUTO_INCREMENT PRIMARY KEY, userRole VARCHAR(50), name VARCHAR(200), mobileNumber VARCHAR(50), email VARCHAR(200), password VARCHAR(50), address VARCHAR(200), status VARCHAR(50))");
//           st.executeUpdate("INSERT INTO appuser (userRole, name, mobileNumber, email, password, address, status) VALUES ('SuperAdmin', 'Super Admin', '12345', 'superadmin@testemail.com', 'admin', 'India', 'Active')");
//             st.executeUpdate("CREATE TABLE category (category_pk INT AUTO_INCREMENT PRIMARY KEY, name varchar(200))");
//            st.executeUpdate("CREATE TABLE product (product_pk INT AUTO_INCREMENT PRIMARY KEY, name varchar(200), quantity int, price int, description varchar(500), category_fk int)");
//            st.executeUpdate("CREATE TABLE customer (customer_pk INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), mobileNumber VARCHAR(50), email VARCHAR(200))");
               st.executeUpdate("CREATE TABLE orderDetail (order_pk INT AUTO_INCREMENT PRIMARY KEY, orderId VARCHAR(200), customer_fk INT, orderDate VARCHAR(200), totalPaid INT)");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}
