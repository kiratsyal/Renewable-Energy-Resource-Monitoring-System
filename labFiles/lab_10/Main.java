package lab_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Runnable;

//  implementing runnable in the main class
public class Main implements Runnable {

    @Override
    public void run() {
        System.out.println("\nExecuted");
    }

    // making the main function
    public static void main(String[] args)throws IOException {
        // Creating a Thread -->
        Thread printer = new Thread();

        // starting the thread
        printer.start();

        // Implementing the concept of exception handling to catch the exception if any
        try {
            // declaring the variables
            String username, password, cpassword;

            // Using the scanner class -->
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nusername: ");
            username = br.readLine();
            System.out.print("\npassword: ");
            password = br.readLine();
            System.out.print("\nRenter password: ");
            cpassword = br.readLine();

            // implementing the validations for password
            if (password.equals(cpassword))
                System.out.println("\nWelcome " + username);
            else
                System.out.println("\nPassword is invalid or does not match");

            // making the thread sleep
            printer.sleep(1000);
        } catch (InterruptedException e) {
            System.out.print("\nException catched");
        }

        // setting the priority of the printer -->
        printer.setPriority(1);

        // getting the priority of the printer thread
        int demo = printer.getPriority();
        System.out.println(demo);
        System.out.print("\nThread Running");
    }
}
