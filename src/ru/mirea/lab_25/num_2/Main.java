package ru.mirea.lab_25.num_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String pattern = "abcdefghijklmnopqrstuv18340";

        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";


        Pattern p = Pattern.compile(pattern);
        Matcher m1 = p.matcher(input1);
        Matcher m2 = p.matcher(input2);

        if (m1.matches()) {
            System.out.println("Строка 1 соответствует шаблону");
        } else {
            System.out.println("Строка 1 не соответствует шаблону");
        }

        if (m2.matches()) {
            System.out.println("Строка 2 соответствует шаблону");
        } else {
            System.out.println("Строка 2 не соответствует шаблону");
        }
    }
}
