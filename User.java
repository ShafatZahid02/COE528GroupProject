/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528project;

import java.util.ArrayList;

/**
 *
 * @author andrewsudyk
 */
public class User {
    private String username;
    private String password;
    static ArrayList<User> users = new ArrayList<User>();
    
    //private String UsernameInput; //temporary variable to store Scanner username input
    //private String PasswordInput; //temporary variable to store Scanner password input
    
    //public String currentlyLoggedUser; //to keep track of currently logged user
    //public boolean currentlyLoggedAdmin; //only true when admin logs in
    

    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean login(String U, String P) {
        for (int i=0;i<users.size();i++) {
            if (U.equals(users.get(i).username) && P.equals(users.get(i).password))  //checks if inputted user credentials are correct or exist
                return true; //assigns this user as the active user
        }
        /*for (User now: users) {
            if (U.equals(now.getUsername()) && P.equals(now.getPassword()))  //checks if inputted user credentials are correct or exist
                return true; //assigns this user as the active user
        }*/
        /*if (users.stream().anyMatch((now) -> (U.equals(now.getUsername()) && P.equals(now.getPassword()))  //checks if inputted user credentials are correct or exist
        )) {
            return true;
        } //assigns this user as the active user*/
        return false;
    }
    
    /*
    public void logout() {
        currentlyLoggedUser = null;
        currentlyLoggedAdmin = false;
         //end session
    }
*/
}