package java.hw4;

import java.util.Scanner;
import java.util.Stack;

public class task4_3 {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        String input = scaner.next();
        Stack<Integer> calc = new Stack<Integer>();
        while (scaner.hasNext()) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int x = 0;
                int y = 0;
                int r = 0;
                if (Character.isDigit(c)) {
                    int t = Character.getNumericValue(c);
                    calc.push(t);
                } else if (c == '+') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x + y;
                    calc.push(r);
                } else if (c == '-') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x - y;
                    calc.push(r);
                } else if (c == '*') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x * y;
                    calc.push(r);
                } else if (c == '/') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x / y;
                    calc.push(r);
                }
            }
        }
        int a = calc.pop();
        System.out.println(a);
     }
}
