package com.rerms.functionalReqs;

import java.lang.*;
import java.util.ArrayList;

public class Grid {
    static ArrayList<> AllGrids = new ArrayList<Grid>();
    static int iter = 0;
    int num_of_nodes, rows = 0, cols = 0;
    StringBuilder GridID = new StringBuilder("G21");

    // for 2D grid
    public Grid(int num_of_nodes, int rows, int cols) {
        this(num_of_nodes, rows);
        this.cols = cols;
    }

    // for linear grid
    public Grid(int num_of_nodes, int rows) {
        this(num_of_nodes);
        this.rows = rows;
    }

    public Grid(int num_of_nodes) {
        this.num_of_nodes = num_of_nodes;
        this.GridID.append(iter);
        AllGrids.add(this);
        iter += 1;
    }

    // protected void del(){
    // for(int i = 0; i < AllGrids.length; i++){
    // if(AllGrids[i] == this)

    // }
    // }
}
