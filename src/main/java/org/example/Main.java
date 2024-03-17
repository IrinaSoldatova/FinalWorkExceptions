package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные о пользователе в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
        String input = scanner.nextLine();

        try {
            UserData userData = DataValidator.parseInput(input);
            FileWriter.writeToTxt(userData);
            System.out.println("Данные успешно записаны в файл.");
        } catch (InvalidDataException | InvalidDataFormatException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}