import java.lang.*;
import java.io.*;

interface Professional_Robbing_Technique {
    int RowHouses(int arr[]);

    int RoundHouses(int arr[]) throws IOException;

    default void Assessments() {
        System.out.print("\nCalling Assessments method in interface Professional_Robbing_Technique :\nI love Assesments\n");
    }
}

abstract class Robber {
    abstract void RobbingMarks();
}

class JAVAProfessionalRobber extends Robber implements Professional_Robbing_Technique {
    int max_robbed = 0;

    public int RowHouses(int arr[]) {
        this.max_robbed = 0;
        for (int i = 0; i < arr.length; i += 2)
            this.max_robbed += arr[i];

        return this.max_robbed;
    }

    public int RoundHouses(int arr[]) throws IOException {
        int i, loc;
        this.max_robbed = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nFrom which location do you want to start robbing : ");
        loc = Integer.parseInt(br.readLine());
        if ((-1 < loc) && (loc < arr.length)) {
            if (((loc + 1) % 2) == 0) {
                for (i = 0; i < arr.length - 1; i += 2)
                    this.max_robbed += arr[i];
            } else {
                for (i = 1; i < arr.length; i += 2)
                    this.max_robbed += arr[i];
            }
        } else {
            System.out.println("\nIndex out of bounds error...!!!\nCaught by police :(\n");
            return 0;
        }

        return this.max_robbed;
    }

    public void display(int arr[]) {
        System.out.print("\n[ ");
        for (int i = 0; i < arr.length - 1; i += 1) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + " ]");
    }

    public void RobbingMarks() {
        System.out.print("\n< insert rubrics here ...>\n\n");
    }
}

public class Main {

    public static void main(String args[]) throws IOException {
        // initialising variables
        int choice, num_of_houses;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        JAVAProfessionalRobber Robber = new JAVAProfessionalRobber();

        // Calling Assesments method
        Robber.Assessments();

        // Calling RobbingMarks method
        Robber.RobbingMarks();

        // taking user-input
        System.out.print("\nEnter no. of Houses : ");
        num_of_houses = Integer.parseInt(br.readLine());
        int arr[] = new int[num_of_houses];
        for (int i = 0; i < num_of_houses; i += 1) {
            System.out.print("\nEnter max money in house [ " + (i + 1) + " ] : ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println();

        // menu-driven program starts here
        System.out.print("\n\n[ 1 ] : ROW HOUSES\n[ 2 ] : ROUND HOUSES\n[ > ] : ");
        choice = br.read();
        switch (choice) {
            // // EXIT PROGRAM
            // case '0':
            // flag = false;
            // break;

            // ROW HOUSES
            case '1':
                Robber.display(arr);
                System.out.println("Max. amount that robber robbed : " + Robber.RowHouses(arr));
                break;

            // ROUND HOUSES
            case '2':
                Robber.display(arr);
                System.out.println("Max. amount that robber robbed : " + Robber.RoundHouses(arr));
                break;

            // Default choice
            default:
                System.out.print("\nWRONG INPUT!!\nTRY AGAIN...\n\n");
                break;
        }
        System.out.print("\n\nPress any key to continue ...");
        System.out.print("\nExiting Program ...\nThank You!!");
    }
}