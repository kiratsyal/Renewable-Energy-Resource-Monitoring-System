package Multithreading;

import java.lang.Runnable;
import java.util.Scanner;

//  implementing runnable in the main class
public class Main implements Runnable {

    @Override
    public void run() {
        System.out.println("Executed");
    }

    // making the main function
    public static void main(String[] args) {
        // Creating a Thread -->
        Thread printer = new Thread();

        // starting the thread
        printer.start();

        // Implementing the concept of exception handling to catch the exception if any
        try {
            // declaring the variables
            String username, password, cpassword;

            // Using the scanner class -->
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username: ");
            username = sc.next();
            System.out.println("Enter your password");
            password = sc.next();
            System.out.println("Renter your password");
            cpassword = sc.next();

            // implementing the validations for password
            if (password.length() == cpassword.length()) {
                System.out.println("Welcome " + username);
            } else if (password == cpassword) {
                System.out.println("Hello " + username);
            } else {
                System.out.println("Password is invalid or does not match");
            }

            // making the thread sleep
            printer.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception catched");
        }

        // setting the priority of the printer -->
        printer.setPriority(1);

        // getting the priority of the printer thread
        int demo = printer.getPriority();
        System.out.println(demo);
        System.out.println("Thread Running");
    }
}
