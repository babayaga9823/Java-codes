package com.company;

import java.util.Scanner;

public class _18circle {
    public static int radius;
    public static void main(String[] args){
        System.out.println("Let given circle is: x^2 + y^2 = r^2 ");
        System.out.println("Enter the points i.e x and y : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextInt();
        // if s < 0 inside circle
        int s = x*x + y*y - radius*radius;
        if(s <= 0){
            System.out.println("Points "+ x + " " + " "+ y + " lies inside the circle");
        } else {
            System.out.println("Points "+ x + " " + " " + y + " lies outside the circle");
        }
    }
}
