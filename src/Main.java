package com.rerms.NonfunctionalReqs;

import java.lang.*;
import java.io.*;
// import org.json.simple.*;
// import org.json.simple.parser.*;
import java.util.ArrayList;
import java.util.LinkedList;

interface LoginInterface {

    static ArrayList<LinkedList<String>> adminCreds = new ArrayList<LinkedList<String>>(10);
    static ArrayList<LinkedList<String>> memCreds = new ArrayList<LinkedList<String>>(10);

    public void printCreds();

    public void addCreds(String username, String password, String mode);

    public boolean validateCreds(String username, String password, String mode);
}

// abstract class Login implements LoginInterface {

// super.adminCreds = new LinkedList<String>();
// super.memCreds = new LinkedList<String>();

// // public Login() {}

// public void printCreds() {
// System.out.println("\nADMIN CREDS :-\n");
// for (int i = 0; i < this.adminCreds.size(); i += 1) {
// System.out.print("\n\nAdmin " + String.valueOf(i + 1) + " Creds :\n");
// System.out.print("Username : " + (this.adminCreds.indexOf(i)).indexOf(0));
// System.out.print("Password : " + (this.adminCreds.indexOf(i)).indexOf(1));
// }

// System.out.println("\nMEMBER CREDS :-\n");
// for (int i = 0; i < this.adminCreds.size(); i += 1) {
// System.out.print("\n\nAdmin " + (i + 1) + " Creds :\n");
// System.out.print("Username : " + (this.adminCreds.indexOf(i)).indexOf(0));
// System.out.print("Password : " + (this.adminCreds.indexOf(i)).indexOf(1));
// }
// }

// public void addCreds(String username, String password, String mode) {

// // Adding Admin Creds
// if (mode.equals("ASU")) {
// this.adminCreds.add(new ArrayList<String>.add(username));
// this.adminCreds.indexOf(1).add(password);
// }

// // Adding Member Creds
// if (mode.equals("MSU")) {
// this.memCreds.add(new ArrayList<String>.add(username));
// this.memCreds.indexOf(1).add(password);
// }
// }

// public boolean validateCreds(String username, String password, String mode) {

// if (mode.equals("ASI"))
// for (int i = 0; i < this.adminCreds.size(); i += 1)
// if (username.equals(this.adminCreds.indexOf(i).indexOf(0))
// && username.equals(this.adminCreds.indexOf(i).indexOf(1)))
// return true;

// if (mode.equals("MSI")) {
// for (int i = 0; i < this.memCreds.size(); i += 1)
// if (username.equals(this.memCreds.indexOf(i).indexOf(0))
// && username.equals(this.memCreds.indexOf(i).indexOf(1)))
// return true;

// return false;
// }
// }
// }

public abstract class Login implements LoginInterface {
    Login() {
        super.adminCreds = new LinkedList<String>();
        super.memCreds = new LinkedList<String>();
    }

    protected void storeUsr() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter no. of users : ");
        int num = Integer.parseInt(br.readLine());
        StringBuffer usr = new StringBuffer("");
        StringBuffer pasw = new StringBuffer("");

        for (int i = 0; i < num; i += 1) {
            usr.delete(0, (usr.length() - 1));
            pasw.delete(0, (pasw.length() - 1));

            System.out.print("\nEnter Username : ");
            usr.append(br.readLine());
            System.out.print("\nEnter Password : ");
            pasw.append(br.readLine());

            super.adminCreds.get(i).add(usr);
            super.adminCreds.get(i).add(pasw);
        }

        for (int i = 0; i < num; i += 1) {
            System.out.print("\nEnter Username : " + super.adminCreds.get(i).get(0));
            System.out.print("\nEnter Password : " + super.adminCreds.get(i).get(1));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Login log = new Login();
        log.storeUsr();
    }
}