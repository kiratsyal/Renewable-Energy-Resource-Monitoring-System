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

class Grid{
    static boolean status = false;

}

public class Main {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        int WhichMenu = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static{
            
        }
        
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
