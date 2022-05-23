package com.rerms;

//javac -d . *.java - [to compile all java files in one go]
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// importing custom packages
import com.rerms.functionalReqs.*;
import com.rerms.NonfunctionalReqs.*;

public class App {

    public 
    public static void print(StringBuilder str)
        System.out.print(str);

    public static void println(StringBuilder str)
        System.out.println(str);

    public static String menu(int WhichMenu) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (WhichMenu == 0) {
            print("\nLOGIN FUNCTIONALITIES :-\n");
            print("\n[ ASI ] : ADMIN Sign-In");
            print("\n[ ASU ] : ADMIN Sign-Up");
            print("\n[ MSI ] : MEMBER Sign-In");
            print("\n[ MSU ] : MEMBER Sign-Up");
            print("\n[  X  ] : EXIT PROGRAM");
        }

        if (WhichMenu == 1) {
            print("\n\nGRID RELATED FUNCTIONALITIES :-");
            print("\n[ CG  ] : CREATE GRID");
            print("\n[ SG  ] : SELECT GRID");
            print("\n[ DG  ] : DELETE GRID");
            print("\n[  X  ] : EXIT PROGRAM");
        }

        if (WhichMenu == 2) {
            print("\n\nRECORDS RELATED FUNCTIONALITIES :-");
            print("\n[ 1 ] : SHOW ALL ");
            print("\n[ 1 ] : ");
            print("\n[ 1 ] : ");
            print("\n[  X  ] : EXIT PROGRAM");

        }

        print("\n[  >  ] : ");
        return br.readLine().toUpperCase();
    }

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        int WhichMenu = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Grid myGrid = new Grid((int) args[0], (int) args[1]);
        Login login = new Login();

        while (flag) {
            switch (menu(WhichMenu)) {
                case "ASI":
                    System.out.print("\nusername : ");
                    String usr = br.readLine();
                    System.out.print("\npassword : ");
                    String passw = br.readLine();
                    if (Login.validateCreds(usr, passw, "ASI"))
                        WhichMenu = 1;
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