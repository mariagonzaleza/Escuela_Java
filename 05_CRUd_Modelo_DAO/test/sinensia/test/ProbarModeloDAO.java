package sinensia.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sinensia.model.logic.UserService;
import sinensia.model.persistence.IUserDAO;
import sinensia.model.persistence.UserDAO_DerbyDB;
import sinsensia.model.User;

/**
 *
 * @author alumno
 */
public class ProbarModeloDAO {
    
    UserService userServ; 
    
    public ProbarModeloDAO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        IUserDAO daoUsers = new UserDAO_DerbyDB(); 
        userServ = new UserService(daoUsers);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createAndListUsersFail() {
         User u1 = userServ.create(null, null, null, 0); 
         User u2 = userServ.create("", "p1234", "3 3", 20); 
         User u3 = userServ.create("er@dd", "", "3 3", 22); 
         User u4 = userServ.create("er@dd", "p1234", "", 20); 
         User u5 = userServ.create("ar@ed", "p124", "3 3", 0);
         assertNull(u1); 
         assertNull(u2); 
         assertNull(u3); 
         assertNull(u4); 
         assertNull(u5); 
         List <User> allUsers = userServ.getAll(); 
         assertEquals(allUsers.size(),0); 
     }
        @Test
     public void createAndListUsersOK() {
         User u1 = userServ.create("alk@mail.com", "321", "Marta", 32); 
         User u2 = userServ.create("jul@mail.com", "p1234", "Julia", 20); 
         User u3 = userServ.create("marcos@mail.com", "524tg", "Marcos", 22); 
         User u4 = userServ.create("cc@mail.com", "p1234", "E r", 20); 
         
         assertNotNull(u1); 
         assertEquals(u2.getName(),"Julia"); 
         assertTrue(u3.getEmail().equals("marcos@mail.com")); 
         assertFalse(u4.getAge()!=50); 
        
         //
         User u5 = userServ.create("cc@mail.com", "124", "ccc S", 50);
         assertNull(u5); 
         List <User> allUsers = userServ.getAll(); 
         assertEquals(allUsers.size(), 4); 
     }
}
