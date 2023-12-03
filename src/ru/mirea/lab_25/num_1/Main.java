package ru.mirea.lab_25.num_1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String regex = "\s+"; // Разделитель пробелов

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        String[] elements = pattern.split(input);

        System.out.println("Элементы строки:");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
