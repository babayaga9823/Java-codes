package com.company;

import java.util.Scanner;

public class _13collinear {
    public static void isCollinear(int x1, int y1, int x2,int y2, int x3, int y3){
            int a = x1 * (y2 - y3) +
                    x2 * (y3 - y1) +
                    x3 * (y1 - y2);
            if (a == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
    }

    public static void main(String[] args) {
        System.out.println("Enter the three points: ");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        isCollinear(x1, y1, x2, y2, x3, y3);
    }
}
