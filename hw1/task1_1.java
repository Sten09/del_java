package java.hw1;

import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        int num = iScanner.nextInt();
        int triangularNum = 0;
        int factorialNum = 1;
        for (int i = 1; i <= num; i++) {
            triangularNum += i;
            factorialNum *= i;
        }
        System.out.printf("Треугольное число: %s\n", triangularNum);
        System.out.printf("Факториал числа: %s\n", factorialNum);
        iScanner.close();
    }
}