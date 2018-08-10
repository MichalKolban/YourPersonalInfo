package YourPersonalInfo;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:");

        String name = scanner.nextLine();

        System.out.println("Enter your last name");

        String lastName = scanner.nextLine();

        System.out.println("Enter your birth date");

        String birthDay = scanner.nextLine();

        System.out.println("Enter your age");

        int age = scanner.nextInt();

        System.out.println("Enter your heigh");

        float heigh = scanner.nextFloat();


        System.out.println("Hello, this is your personal info");
        System.out.println("Name : " + name + " and last name : " + lastName);
        System.out.println("Your birthday : " + birthDay + " and your age: " + age);
        System.out.println("you have : " + heigh  + " cm ");

    }
}
