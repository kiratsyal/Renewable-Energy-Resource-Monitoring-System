package com.rerms;

//javac -d . *.java - [to compile all java files in one go]
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import com.rerms.functionalReqs.*;
import com.rerms.NonfunctionalReqs.*;

public class App {

    public static void print(String str) {
        System.out.print(str);
    }

    public static void printLn(String str) {
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
        Grid G1 = new Grid(20, 4, 5);
        while (flag) {
            switch (menu(WhichMenu)) {
                case "ASI":
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
            print("Hello JAVA\n\t" + 234);
        }
    }
}
