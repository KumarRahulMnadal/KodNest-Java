package Practice.Module1;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter short value:");
        short s = sc.nextShort();
        System.out.println("Short value: " + s);

        System.out.println("Enter int value:");
        int i = sc.nextInt();
        System.out.println("Int value: " + i);

        System.out.println("Enter long value:");
        long l = sc.nextLong();
        System.out.println("Long value: " + l);

        System.out.println("Enter float value:");
        float f = sc.nextFloat();
        System.out.println("Float value: " + f);

        System.out.println("Enter double value:");
        double d = sc.nextDouble();
        System.out.println("Double value: " + d);

        System.out.println("Enter char value:");
        char c = sc.next().charAt(0);
        System.out.println("Char value: " + c);

        System.out.println("Enter boolean value:");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean value: " + b);
    }
}