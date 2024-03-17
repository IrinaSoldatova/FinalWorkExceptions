package org.example;

public class UserData {
    String lastName;
    String firstName;
    String middleName;
    String dateOfBirth;
    long phoneNumber;
    char gender;

    public UserData(String lastName, String firstName, String middleName, String dateOfBirth, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}