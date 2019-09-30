/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.model.persistence;

import sinsensia.model.User;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface IUserDAO {
    User create(User user);
    List <User> getAll(); 
}
