package com.rerms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Record{

}

class Grid {
    static Grid AllGrids[] = new Grid[5];
    static int iter = 0;
    int num_of_nodes, rows, cols;

    Grid(int num_of_nodes) {
        this.num_of_nodes = num_of_nodes;
        AllGrids[iter] = this;
        iter+=1;
    }

    // for linear grid
    Grid(int num_of_nodes, int rows) {
        this(num_of_nodes);
        this.rows = rows;
    }

    // for 2D grid
    Grid(int num_of_nodes, int rows, int cols) {
        this(num_of_nodes, rows);
        this.cols = cols;
    }

    // to add records
    void addRecord(){

    }

}

public class Main {

    public static void print(String str) {
        System.out.print(str);
    }

    public static char menu(int WhichMenu) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        print("\nLOGIN FUNCTIONALITIES :-\n");
        print("\n[ ASI ] : ADMIN Sign-In");
        print("\n[ MSI ] : MEMBER Sign-In");
        print("\n[ MSU ] : MEMBER Sign-Up");
        print("\n\nGRID RELATED FUNCTIONALITIES :-");
        print("\n[ CG  ] : CREATE GRID");
        print("\n[ SG  ] : SELECT GRID");
        print("\n[ DG  ] : DELETE GRID");
        print("\n\nRECORDS RELATED FUNCTIONALITIES :-");        
        print("\n[ 1 ] : SHOW ALL ");
        print("\n[ 1 ] : ");
        print("\n[ 1 ] : ");
        print("\n[ > ] : ");
        return Character.toUpperCase((char) br.read());
        //return Character.toUpperCase((char) br.read());
    }

    public static void main(String[] args) {
        int WhichMenu = 0;
        char choice = menu(WhichMenu);
        print("Hello JAVA\n\t" + 234);
    }
}
