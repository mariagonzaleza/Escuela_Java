package sinensia.model.logic;

import java.util.List;
import sinensia.model.persistence.IUserDAO;
import sinensia.model.persistence.UserDAO_DerbyDB;
import sinsensia.model.User;

/**
 * @author María Alejandra
 */
public class UserService {
    
        IUserDAO daoUsers; 
        
        //Constructor
        public UserService(IUserDAO daoUsers){
            this.daoUsers = daoUsers; 
        }

        public User create(String email, String password, String name, int age){
            
            User u= null; 
            if(email !=null && password!=null && name !=null){
            if(email.length()>3 
                    && ! password.equals("")
                    && ! name.equals("")
                    && age >0){
                
                 u = new User(email, password, name, age); 
                 u = daoUsers.create(u); 
            }
            }
            return u;
        }; 
        
        public List<User> getAll(){
            return daoUsers.getAll(); 
        
        }
}
