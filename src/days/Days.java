package days;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (one, two, three, four, five)");
        String code = in.next();
        Weekdays t = new Weekdays();
        t.nameOfDay(code);
    }
}
