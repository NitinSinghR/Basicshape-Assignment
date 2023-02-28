package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class BasicShape {
    public static void main(String[] args) {
        Logger l=Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        double radius;
        double length;
        double base;
        double width;
        double height;
        double a;
        double b;
        String s="circle";
        String s2="rectangle";
        String s3="triangle";

        Shape s1 = null;

        l.info("Enter the type of shape\n1.circle\n2.rectangle\n3.triangle");
        String type = sc.next();
        try {
            if (type.equals(s)) {
                l.info("Enter the radius");
                radius = sc.nextDouble();
                s1 = new Shape(type, radius);
            } else if (type.equals(s2)) {
                l.info("Enter the length");
                length = sc.nextInt();
                l.info("Enter the width");
                width = sc.nextDouble();
                s1 = new Shape(type, length, width);
            } else if (type.equals(s3)) {
                l.info("Enter the length of a");
                a = sc.nextDouble();
                l.info("Enter the length of b");
                b = sc.nextDouble();
                l.info("Enter the base");
                base = sc.nextDouble();
                l.info("Enter the height");
                height = sc.nextDouble();
                s1 = new Shape(type, a, b, base, height);
            } else {
                l.info("Enter the correct shape");
            }
        }catch(InputMismatchException e){
            l.log(Level.INFO,()->" "+e);
        }
        assert s1 != null;
        l.info("Area is " + s1.getArea());
        l.info("Perimeter is" + s1.getPerimeter());
    }

}


