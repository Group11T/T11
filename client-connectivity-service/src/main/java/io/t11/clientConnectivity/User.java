package io.t11.clientConnectivity;

public class User {

    protected String firstName;
    protected String lastName;
    protected String password;
    protected String emailAddress;
    protected int DOB;

    // Constructor
    public User(String firstName, String lastName, String password, String emailAddress, int DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.DOB = DOB;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getDOB() {
        return DOB;
    }

}
