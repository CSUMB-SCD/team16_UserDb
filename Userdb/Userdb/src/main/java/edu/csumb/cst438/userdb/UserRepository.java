package edu.csumb.cst438.userdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.csumb.cst438.userdb.entities.User;

public interface UserRepository extends MongoRepository<User, String>{
    @Query (value = "{'username':?0}")   
    User findUser(String name);

    @Query (value = "{'_id':'?0'}")
    User findId(String id);

    @Query (value = "{'password': ?0}")
    User findUserbyPassword(String password);
}