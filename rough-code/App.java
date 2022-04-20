// package name
package src;

// imports
import java.io.*;
import com.rerms.functionalReqs.*;

//DOCUMENTATION :-
//
/*The idea is to develop an application in CUI to monitor nodes in a power grid */
/*
Implement the concept of class, data members, 
member functions and access specifiers in your domain. 
Follow the required programming standards.
*/

public class App {

    protected static int[] signIn(StringBuffer creds[], Member members[]) {
        int status[] = new int[2];
        status[0] = 0; // to determine whether the record exists in the database or not
        status[1] = 0; // to return the index in the array of objects if the record exists
        for (int i = 0; i < members.length; i++) {
            if ((creds[0].equals(members[i].consumerID)) && (creds[1].equals(members[i].password))) {
                status[0] = 1;
                status[1] = i;
                return status;
            }
        }
        return status;
    }

    protected static Member[] addNode(Member[] memList) {
        int len = memList.length;
        Member newList[] = new Member[len + 1];
        for (int i = 0; i < len; i++)
            newList[i] = memList[i];
        System.gc();
        return newList;
    }

    protected static Member addMember(String con_id) throws IOException {

        String contact, password, name, AadhaarNo, dob;
        int solarDevs, windDevs, hydroElecDevs, geothermalDevs;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name : ");
        name = br.readLine();
        System.out.print("Enter Contact No. : ");
        contact = br.readLine();
        System.out.print("Enter Aadhar No. : ");
        AadhaarNo = br.readLine();
        System.out.print("Enter Date of birth : ");
        dob = br.readLine();
        System.out.print("Enter Password : ");
        password = br.readLine();
        System.out.print("Enter No. of Solar devices owned : ");
        solarDevs = Integer.parseInt(br.readLine());
        System.out.print("Enter No. of Wind devices owned : ");
        windDevs = Integer.parseInt(br.readLine());
        System.out.print("Enter No. of Hydroelectric devices owned : ");
        hydroElecDevs = Integer.parseInt(br.readLine());
        System.out.print("Enter No. of Geothermal devices owned : ");
        geothermalDevs = Integer.parseInt(br.readLine());
        System.out.println("Your unique consumer ID is, " + con_id);

        Member temp = new Member(con_id, contact, AadhaarNo, password, name, dob, solarDevs, windDevs, hydroElecDevs,
                geothermalDevs);

        return temp;
    }

    protected static char menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[ 1 ] : SIGN IN");
        System.out.println("[ 2 ] : SIGN UP");
        // System.out.println("[ 3 ] : PRINT CREDS");
        System.out.println("[ X ] : EXIT");
        System.out.print("[ > ] : ");
        return Character.toUpperCase((char) reader.read());
    }

    protected static char menu1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[ 1 ] : add SOLAR DEVICE");
        System.out.println("[ 2 ] : add WIND DEVICE");
        System.out.println("[ 3 ] : add HYDROELECTRIC DEVICE");
        // System.out.println("[ 4 ] : add GEOTHERMAL DEVICE");
        System.out.println("[ X ] : EXIT");
        System.out.print("[ > ] : ");
        return Character.toUpperCase((char) reader.read());
    }
w
    public static void main(String[] args) throws Exception {
        
        // initialize the power grid

        

        boolean flag = true;
        int len = 0, count = 0;
        char ch;
        String creds[] = new String[2], con_id = "2147100";
        Member members[] = new Member[1];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (flag) {
                switch (menu()) {
                    case '0': // exit program
                        flag = false;
                        break;

                    case '1': // sign-in
                        if (len == 0) {
                            System.out.println("Add some members first!!");
                            break;
                        }
                        System.out.print("\nEnter Consumer ID : ");
                        creds[0] = reader.readLine();
                        System.out.print("Enter Password : ");
                        creds[1] = reader.readLine();

                        // check credentials
                        int status[] = signIn(creds, members);
                        if (status[0] == 0) {
                            System.out.print("\nSigned-in successfully...");
                            System.out.print("\nPrinting Member Details...");
                            members[status[1]].printMem();
                        } else
                            System.out.print(
                                    "\nUser Credentials do not exist in our database...\nCheck the entered credentials and try again...");
                        System.gc();
                        break;

                    case '2': // sign-up
                        members = addNode(members);
                        members[len] = addMember(con_id);
                        con_id = String.valueOf(Integer.parseInt(con_id) + 1);
                        len++;
                        System.gc();
                        break;

                    case '3': // Add device
                        Device dev[] = new Device[5];
                        switch (menu1()) {
                            case '1':
                                System.out.println("Adding a Solar device : ");
                                dev[count] = Device();
                                count++;
                                break;

                            case '2':
                                System.out.println("Adding a Wind device : ");
                                dev[count] = Device();
                                count++;
                                break;

                            case '3':
                                System.out.println("Adding a Hydroelectic device : ");
                                dev[count] = Device();
                                count++;
                                break;

                            default:
                                System.out.println("WRONG INPUT!!");
                                reader.read();
                                break;
                        }
                        System.gc();
                        break;

                    // case '3': // print-creds
                    // parseCreds();
                    // break;

                    default:
                        System.out.println("INVALID INPUT!\nTRY AGAIN...");
                        System.gc();
                        break;
                }
                System.out.println("Press any key to continue ....");
                reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Press any key to exit ....");
        reader.read();
    }
}