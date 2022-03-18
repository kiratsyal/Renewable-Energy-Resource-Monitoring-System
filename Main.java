import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Main {

    protected String[] parseCreds() {
        //Boolean flag;
        String url = "https://raw.githubusercontent.com/bernardbdas/Renewable-Energy-Resource-Monitoring-System/main/userCreds.json";
        URL obj = new URL(url);
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        
        // optional default is GET
        connect.setRequestMethod("GET");
        // add request header
        //con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = connect.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);
        in.close();
        return true;
    }

    // protected static boolean signIn(String creds[]) {}

    protected static char menu(BufferedReader br) {
        System.out.println("[ 1 ] : SIGN IN");
        System.out.println("[ 2 ] : SIGN UP");
        System.out.println("[ X ] : EXIT");
        System.out.print("[ > ] : ");
        return Character.toUpperCase((char) br.read());
    }

    public static void main(String[] args) throws Exception {
        boolean flag = true;
        String creds[] = new String[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            switch (menu(br)) {
                case '0': // exit program
                    flag = false;
                    break;

                case '1': // sign-in
                    System.out.print("\nEnter Username : ");
                    creds[0] = br.readLine();
                    System.out.print("\nEnter Password : ");
                    creds[0] = br.readLine();
                    boolean status = signIn(creds);
                    if (status)
                        System.out.print("\nSigned-in successfully...");
                    else
                        System.out.print(
                                "\nUser Credentials do not exist in our database...\nCheck the entered credentials and try again...");
                    break;

                case '2': // sign-up
                    break;

                default:
                    System.out.println("INVALID INPUT!\nTRY AGAIN...");
                    break;
            }
            System.out.println("Press any key to continue ....");
            br.read();
        }
        System.out.println("Press any key to exit ....");
        br.read();
    }
}