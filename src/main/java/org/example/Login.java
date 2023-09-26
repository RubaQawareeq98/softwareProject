package org.example;

public class Login {
    private String pass;
    private String userName;
    String[] users = {"Ali", "Mohammed", "Ruba"};
    String[] passwords = {"123", "234356", "1234"};

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isValidLogin() {
        for (int i = 0; i < users.length; i++) {

            if ((users[i] .equals(userName) ) && (passwords[i] .equals(pass))) {

               return true;
            }
        }
        return false;


    }
}