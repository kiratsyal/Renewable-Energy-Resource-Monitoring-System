package com.rerms.NonfunctionalReqs;

import java.lang.*;
import org.json.simple.*;
import org.json.simple.parser.*;

interface Login {

    static ArrayList<LinkedList<String>> adminCreds = new ArrayList<LinkedList<String>>();
    static ArrayList<LinkedList<String>> memCreds = new ArrayList<LinkedList<String>>();

    public void printCreds() {}

    public void addCreds(String username, String password, String mode) {}

    public boolean validateCreds(String username, String password, String mode) {}
}
