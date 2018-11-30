package edu.csumb.cst438.userdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.userdb.entities.User;

@Component
public class UserDbSeeder implements CommandLineRunner{
    @Autowired
    UserRepository userRepo;
    @Override
    public void run(String... args) throws Exception {
        
        User user1 = new User("USER1","Password" ,100);


        userRepo.deleteAll();
        List<User> users = Arrays.asList(user1);
        userRepo.saveAll(users);
    }
}