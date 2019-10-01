package sinensia.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sinensia.model.logic.UserService;
import sinensia.modelo.User;
import sinensia.modelo.persistence.IUserDAO;
import sinensia.modelo.persistence.UserDAO_DerbyDB;

/**
 * @author María Alejandra
 */
@WebServlet(asyncSupported=true, urlPatterns="/users.do")
public class UserController extends HttpServlet {
    
    UserService userSrv; 

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        IUserDAO usersDAO = new UserDAO_DerbyDB(); 
        this.userSrv = new UserService(usersDAO);
    }
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
      
        try { 
       String email=req.getParameter("email");
       String password=req.getParameter("password");
       String name=req.getParameter("name");
       String age=req.getParameter("age");
            userSrv.create(email,password,name,age);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    
            try { 
            List<User> listUsers = userSrv.getAll();
            //Invocamos a la vista con el getrequestDispatcher
            //Enviamos los datos a traves de la peticion
            //Si los pasamos por la sesion los datos pueden estar desactualizados ya que la sesion funciona como una cache
            req.setAttribute("usersList", listUsers); //Clave valor hashmap
            req.getRequestDispatcher("listUsers.jsp").forward(req, resp);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    
    

}
