package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radiusInput = in.nextDouble();
        double area = Circle.getArea(radiusInput);
        System.out.println(area);
        in.close();
    }

}
