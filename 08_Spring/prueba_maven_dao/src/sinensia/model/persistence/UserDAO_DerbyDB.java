package sinensia.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import sinsensia.model.User;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ACCESO A LA BASE DE DATOS 
 * @author María Alejandra
 */
public class UserDAO_DerbyDB implements IUserDAO {
    
    
    private static final String CONEX_DB = "jdbc:derby://localhost:1527/db_users";
    private static final String USER_DB = "root"; 
    private static final String PSSWD_DB = "1234"; 
    
    public UserDAO_DerbyDB() {
        //Creamos el driver de Derby DB está basado en JDBC
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver"); 
        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        }catch(Exception ex){
           Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }


    @Override
    public User create(User user) {
        Connection con=null; 
        try{
        con = DriverManager.getConnection(CONEX_DB, USER_DB, PSSWD_DB);
        String sqlQuery = "INSERT INTO users (email, password, name, age) VALUES(" + "'" + user.getEmail() + "','" 
                + user.getPassword() +"','" + user.getName() + "'," + user.getAge()+")"; 
        Statement stmt = con.createStatement(); 
        stmt.executeUpdate(sqlQuery);
        con.close(); 
        }catch(SQLException ex){
             Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }

    @Override
    public List<User> getAll() {
        try(Connection con = DriverManager.getConnection(CONEX_DB, USER_DB, PSSWD_DB)){
            
            ArrayList <User> usersList = new ArrayList<>();
            String sqlQuery = "SELECT id, email, password, name, age FROM users";
            Statement stmt = con.createStatement(); 
            ResultSet res = stmt.executeQuery(sqlQuery);
            while(res.next()){
                int id = res.getInt("id"); 
                String email = res.getString("email"); 
                String password = res.getString("password"); 
                String name = res.getString("name"); 
                int age = res.getInt("age");
                User newUser = new User(email,password,name,age); 
                newUser.setId(id); 
                usersList.add(newUser); 
            }
            return usersList;
        }catch(SQLException ex){
            Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
    
    
}
