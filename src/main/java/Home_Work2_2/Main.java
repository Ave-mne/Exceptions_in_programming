package Home_Work2_2;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        float a = Integer.parseInt(sc.next());
        System.out.print("Введите число 2: ");
        float b = Integer.parseInt(sc.next());
        try {
            System.out.printf("Результат деления: %f", divide(a, b));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }


    public static double divide(float a, float b) throws DivisionByZeroException {
        if (b == 0) throw new DivisionByZeroException(" На ноль делить нельзя!");

        return a/b;
    }
}