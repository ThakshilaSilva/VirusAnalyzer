/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusanalyzer;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class VirusAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        userInterface ui = new userInterface();
        ui.setVisible(true);
    }
    
//    public boolean loadToDB(String hash , String type) throws SQLException{
//        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HashFiles", "ktss", "ktss");
//        PreparedStatement stmt = con.prepareStatement("INSERT INTO sample values(?,?)");
//        stmt.setString(1, hash);
//        stmt.setString(2, type);
//        int executeUpdate = stmt.executeUpdate();
//        
//        return executeUpdate > 0;
//    }
    
}
