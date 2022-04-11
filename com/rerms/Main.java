class Grid {
    int num_of_nodes, rows, cols;

    Grid(int num_of_nodes) {
        this.num_of_nodes = num_of_nodes;
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
}

public class Main {
    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        print("Hello JAVA\n\t" + 234);
    }
}
