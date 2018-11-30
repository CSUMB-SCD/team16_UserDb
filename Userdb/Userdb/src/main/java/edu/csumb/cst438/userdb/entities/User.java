package edu.csumb.cst438.userdb.entities;

public class User{
    String username;
    String password;
    double credits;

    public User(String username,String password, double credits){
        this.username = username;
        this.password = password;
        this.credits = credits;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return the credits
     */
    public double getCredits() {
        return this.credits;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @param credits the credits to set
     */
    public void setCredits(double credits) {
        this.credits = credits;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}