import java.io.*;
//import java.util.*;
//import java.net.HttpURLConnection;
//import java.net.ProtocolException;
//import java.net.URL;
//import org.json.simple.JSONObject;

/*
Implement the concept of class, data members, 
member functions and access specifiers in your domain. 
Follow the required programming standards.
*/

class Member {
    int consumerID, contact, AadhaarNo;
    int solarDevs, windDevs, hydroElecDevs, geothermalDevs;
    String name, dob, password;

    Member(int consumerID, int contact, int AadhaarNo, String password, String name, String dob, int solarDevs,
            int windDevs, int hydroElecDevs, int geothermalDevs) {
        this.consumerID = consumerID;
        this.password = password;
        this.contact = contact;
        this.AadhaarNo = AadhaarNo;
        this.name = name;
        this.dob = dob;
        // no. of devices the Member has
        this.solarDevs = solarDevs;
        this.windDevs = windDevs;
        this.hydroElecDevs = hydroElecDevs;
        this.geothermalDevs = geothermalDevs;
    }

    protected void printMem() {
        System.out.println("Name : " + this.name);
        System.out.println("Consumer ID : " + this.consumerID);
        System.out.println("Contact No. : " + this.contact);
        System.out.println("Aadhar No. : " + this.AadhaarNo);
        System.out.println("Date of birth : " + this.dob);
        System.out.println("No. of Solar devices owned : " + this.solarDevs);
        System.out.println("No. of Wind devices owned : " + this.windDevs);
        System.out.println("No. of Hydroelectric devices owned : " + this.hydroElecDevs);
        System.out.println("No. of Geothermal devices owned : " + this.geothermalDevs);
    }
}

public class App {
    /*
     * protected static void parseCreds() throws ProtocolException, IOException {
     * String line;
     * StringBuffer response = new StringBuffer();
     * BufferedReader reader;
     * try {
     * // Boolean flag;
     * // String url =
     * //
     * "https://raw.githubusercontent.com/bernardbdas/Renewable-Energy-Resource-Monitoring-System/main/userCreds.json";
     * URL obj = new URL(
     * "https://raw.githubusercontent.com/bernardbdas/Renewable-Energy-Resource-Monitoring-System/main/userCreds.json"
     * );
     * HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
     * connect.setRequestMethod("GET");
     * int responseCode = connect.getResponseCode();
     * if (responseCode > 299) {
     * reader = new BufferedReader(new InputStreamReader(connect.getErrorStream()));
     * while ((line = reader.readLine()) != null)
     * response.append(line);
     * reader.close();
     * } else {
     * reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
     * while ((line = reader.readLine()) != null)
     * response.append(line);
     * reader.close();
     * }
     * } catch (Exception e) {
     * e.printStackTrace();
     * }
     * }
     */

    protected static int[] signIn(String creds[], Member members[]) {
        int status[] = new int[2];
        status[0] = 0; // to determine whether the record exists in the database or not
        status[1] = 0; // to return the index in the array of objects if the record exists
        for (int i = 0; i < members.length; i++) {
            if ((Integer.parseInt(creds[0]) == members[i].consumerID) && (creds[1].equals(members[i].password))) {
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

    protected static Member addMember(int con_id) throws IOException {

        int contact, AadhaarNo;
        String password, name, dob;
        int solarDevs, windDevs, hydroElecDevs, geothermalDevs;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter Name : ");
        name = br.readLine();
        System.out.print("\nEnter Contact No. : ");
        contact = Integer.parseInt(br.readLine());
        System.out.print("\nEnter Aadhar No. : ");
        AadhaarNo = Integer.parseInt(br.readLine());
        System.out.print("\nEnter Date of birth : ");
        dob = br.readLine();
        System.out.print("\nEnter Password : ");
        password = br.readLine();
        System.out.print("\nEnter No. of Solar devices owned : ");
        solarDevs = Integer.parseInt(br.readLine());
        System.out.print("\nEnter No. of Wind devices owned : ");
        windDevs = Integer.parseInt(br.readLine());
        System.out.print("\nEnter No. of Hydroelectric devices owned : ");
        hydroElecDevs = Integer.parseInt(br.readLine());
        System.out.print("\nEnter No. of Geothermal devices owned : ");
        geothermalDevs = Integer.parseInt(br.readLine());

        Member temp = new Member(con_id, contact, AadhaarNo, password, name, dob, solarDevs,
                windDevs, hydroElecDevs, geothermalDevs);

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

    public static void main(String[] args) throws Exception {
        boolean flag = true;
        int con_id = 2147100, len = 0;
        String creds[] = new String[2];
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
                        con_id++;
                        len++;
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