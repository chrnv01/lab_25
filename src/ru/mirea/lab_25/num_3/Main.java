package ru.mirea.lab_25.num_3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";

        String input1 = "11/09/2001";
        String input2 = "09/05/2002";
        String input3 = "01/02/2003";
        String input4 = "03/11/2004";
        String input5 = "03-11-2004";
        String input6 = "1/1/1111";

        Pattern p = Pattern.compile(pattern);
        Matcher m1 = p.matcher(input1);
        Matcher m2 = p.matcher(input2);
        Matcher m3 = p.matcher(input3);
        Matcher m4 = p.matcher(input4);
        Matcher m5 = p.matcher(input5);
        Matcher m6 = p.matcher(input6);

        System.out.println("11/09/2001: " + m1.matches());
        System.out.println("09/05/2002: " + m2.matches());
        System.out.println("01/02/2003: " + m3.matches());
        System.out.println("03/11/2004: " + m4.matches());
        System.out.println("03-11-2004: " + m5.matches());
        System.out.println("1/1/1111: " + m6.matches());
    }
}
