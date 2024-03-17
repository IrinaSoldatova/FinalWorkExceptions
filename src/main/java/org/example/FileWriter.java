package org.example;

import java.io.IOException;

public class FileWriter {
    public static void writeToTxt(UserData userData) throws IOException {
        java.io.FileWriter writer = new java.io.FileWriter(userData.lastName + ".txt", true);
        writer.write(userData.lastName + " " + userData.firstName + " " + userData.middleName + " " +
                userData.dateOfBirth + " " + userData.phoneNumber + " " + userData.gender + "\n");
        writer.close();
    }
}
