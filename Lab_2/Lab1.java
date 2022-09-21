package Lab_2;

import java.io.Console;

public class Lab1 {
    public static void main(String[] args) {
        Console cnsl = System.console();

        if (cnsl == null) {
            System.out.println(
                    "No console available");
            return;
        }

        // Read line
        String str = cnsl.readLine(
                "Enter points coordinates : ");

        String[] _str = str.split("\\s+");

        Point3d p1 = new Point3d(Double.parseDouble(_str[0]), Double.parseDouble(_str[1]), Double.parseDouble(_str[2]));
        Point3d p2 = new Point3d(Double.parseDouble(_str[3]), Double.parseDouble(_str[4]), Double.parseDouble(_str[5]));
        Point3d p3 = new Point3d(Double.parseDouble(_str[6]), Double.parseDouble(_str[7]), Double.parseDouble(_str[8]));

        if (!(p1.equals(p2) || p1.equals(p3) || p2.equals(p3)))
            System.out.println(PointUtils.computeArea(p1, p2, p3));
        else
            System.out.println("Some points are the same");
    }
}
