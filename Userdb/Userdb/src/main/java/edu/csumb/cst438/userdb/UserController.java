package edu.csumb.cst438.userdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.userdb.UserRepository;
import edu.csumb.cst438.userdb.entities.User;

@RestController
public class UserController{
    @Autowired
    UserRepository userRepo;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users")
    public List<User> getAll(){
        List<User> result = userRepo.findAll();
        return result;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/username/{name}")
    public User getUsername (@PathVariable String name) {
        User result = userRepo.findUser(name);
        return result;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/password/{pass}")
    public User getPassword (@PathVariable String password) {
        User result = userRepo.findUserbyPassword(password);
        return result;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/userid/{id}")
    public User getUserId (@PathVariable String id) {
        User result = userRepo.findId(id);
        return result;
    }
}