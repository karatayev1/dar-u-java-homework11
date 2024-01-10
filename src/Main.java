// Homework 11

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вещественное число: ");
        try {
            Double x = in.nextDouble();
            System.out.println(Math.sqrt(x));
        } catch (Exception e) {
            System.out.println("Введите корректное значение");
        }
        System.out.println("......");

        // Task 3
        Scanner inStr = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = inStr.nextLine();
        int sum = sumDigitsFromStr(str);
        System.out.println(sum);
        System.out.println("......");

        // Task 2
        double z = divide(6, 0);
        System.out.println(z);
    }

    static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на 0");
        } else {
            return x / y;
        }
    }

    static int sumDigitsFromStr(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        int sum = 0;

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        if (sum == 0) {
            throw new ArithmeticException("В строке не найдены числа");
        } else {
            return sum;
        }
    }
}