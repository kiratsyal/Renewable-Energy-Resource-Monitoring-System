package com.rerms.NonfunctionalReqs;

import java.lang.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Login {
    static ArrayList<ArrayList<String>> adminCreds = new ArrayList<ArrayList<String>>();
    static ArrayList<ArrayList<String>> memCreds = new ArrayList<ArrayList<String>>();

    // Adding Admin Creds
    adminCreds.indexOf(i).indexOf(1)

    // Adding Member Creds

    public void printCreds(){
        for (int i = 0; i < adminCreds.size(); i += 1)
            print(adminCreds.indexOf(i).indexOf(1));
    }

    public void addCreds(String username, String password, String mode){
        if (mode.equals("ASIU")){
            adminCreds.add(new ArrayList<String>.add(username));
            adminCreds.indexOf(1).add(password));
        }
        
        if (mode.equals("MSU")){
            memCreds.add(new ArrayList<String>.add(username));
            memCreds.indexOf(1).add(password));
        }
    }

    public boolean validateCreds(String username, String password, String mode) {

        if (mode.equals("ASI"))
            for (int i = 0; i < adminCreds.size(); i += 1)
                if (username.equals(adminCreds.indexOf(i).indexOf(0))
                        && username.equals(adminCreds.indexOf(i).indexOf(1)))
                    return true;

        if (mode.equals("MSI")) {
            for (int i = 0; i < memCreds.size(); i += 1)
                if (username.equals(memCreds.indexOf(i).indexOf(0))
                        && username.equals(memCreds.indexOf(i).indexOf(1)))
                    return true;
        } else
            return false;
    }
}
