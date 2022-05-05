package com.rerms;

//javac -d . *.java - [to compile all java files in one go]
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import com.rerms.functionalReqs.*;
import com.rerms.NonfunctionalReqs.*;

class Login {

    ArrayList<LinkedList<String>> adminCreds = new ArrayList<LinkedList<String>>();
    ArrayList<LinkedList<String>> memCreds = new ArrayList<LinkedList<String>>();

    //public Login() {}

    public void printCreds() {
        System.out.println("\nADMIN CREDS :-\n");
        for (int i = 0; i < this.adminCreds.size(); i += 1) {
            System.out.print("\n\nAdmin " + (i + 1) + " Creds :\n");
            System.out.print("Username : " + this.adminCreds.indexOf(i).indexOf(0));
            System.out.print("Password : " + this.adminCreds.indexOf(i).indexOf(1));
        }

        System.out.println("\nMEMBER CREDS :-\n");
        for (int i = 0; i < this.adminCreds.size(); i += 1) {
            System.out.print("\n\nAdmin " + (i + 1) + " Creds :\n");
            System.out.print("Username : " + this.adminCreds.indexOf(i).indexOf(0));
            System.out.print("Password : " + this.adminCreds.indexOf(i).indexOf(1));
        }
    }

    public void addCreds(String username, String password, String mode) {

        // Adding Admin Creds
        if (mode.equals("ASU")) {
            this.adminCreds.add(new ArrayList<String>.add(username));
            this.adminCreds.indexOf(1).add(password);
        }

        // Adding Member Creds
        if (mode.equals("MSU")) {
            this.memCreds.add(new ArrayList<String>.add(username));
            this.memCreds.indexOf(1).add(password);
        }
    }

    public boolean validateCreds(String username, String password, String mode) {

        if (mode.equals("ASI"))
            for (int i = 0; i < this.adminCreds.size(); i += 1)
                if (username.equals(this.adminCreds.indexOf(i).indexOf(0))
                        && username.equals(this.adminCreds.indexOf(i).indexOf(1)))
                    return true;

        if (mode.equals("MSI")) {
            for (int i = 0; i < this.memCreds.size(); i += 1)
                if (username.equals(this.memCreds.indexOf(i).indexOf(0))
                        && username.equals(this.memCreds.indexOf(i).indexOf(1)))
                    return true;

            return false;
        }
    }
}

public class App {

    public static void print(StringBuilder str) {
        System.out.print(str);
    }

    public static void printLn(StringBuilder str) {
        System.out.println(str);
    }

    public static String menu(int WhichMenu) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        if (WhichMenu == 0) {
            print("\nLOGIN FUNCTIONALITIES :-\n");
            print("\n[ ASI ] : ADMIN Sign-In");
            print("\n[ ASU ] : ADMIN Sign-Up");
            print("\n[ MSI ] : MEMBER Sign-In");
            print("\n[ MSU ] : MEMBER Sign-Up");
        }

        if (WhichMenu == 1) {
            print("\n\nGRID RELATED FUNCTIONALITIES :-");
            print("\n[ CG  ] : CREATE GRID");
            print("\n[ SG  ] : SELECT GRID");
            print("\n[ DG  ] : DELETE GRID");
        }

        if (WhichMenu == 2) {
            print("\n\nRECORDS RELATED FUNCTIONALITIES :-");
            print("\n[ 1 ] : SHOW ALL ");
            print("\n[ 1 ] : ");
            print("\n[ 1 ] : ");
        }
        print("\n[ > ] : ");
        return br.readLine().toUpperCase();
    }

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        int WhichMenu = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Grid myGrid = new Grid((int)args[0], (int)args[1]);
        Login login = new Login();
        
        while (flag) {
            switch (menu(WhichMenu)) {
                case "ASI":
                    System.out.print("\nusername : ");
                    String usr = br.readLine();
                    System.out.print("\npassword : ");
                    String passw = br.readLine();
                    Login.validateCreds(usr, passw, "ASI");
                    break;

                case "ASU":
                    break;

                case "MSI":
                    break;

                case "MSU":
                    break;

                case "CG":
                    break;

                case "SG":
                    break;

                case "DG":
                    break;

                default:
                    break;
            }
        }
    }
}