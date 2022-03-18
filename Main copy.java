import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.net.URL; 
import org.json.JSONObject;

class Dashboard {
    Dashboard() {
    }

    private static boolean createDashboard() {
        return false;
    }

    private static void displayProfile() {

    }

    private static void displayMyDevices() {
    }

    private static boolean SignIn() {
        return false;
    }

    private static boolean LogOut() {
        return false;
    }
}

class manageDevice {
    // will be used to handle the functions related to the devices responsible for
    // generating renewable energy

    private static boolean display_devices(String usr_name) {
        return false;
    }

    private static String[] calc_stats(String dev_ID) // returns the vital stats of a selected device
    {
        String stats[] = { "32.32", "13.2", "cs3.13" };
        return stats;
    }

    private static String inst_date(String dev_ID)// returns the installation date of the device
    {
        return dev_ID;
    }

    private static float dev_temp(String dev_ID) // returns the current temperature of the device
    {
        return 75.00;
    }

    private static float eng_level(String dev_ID) // returns the percentage of energy the device is currently generating
    {
        return 75.2;
    }

    private static float calc_eff(String dev_ID) // returns the working efficiency of the given device
    {
        return 75.2;
    }
}

class solarDevs extends manageDevice
// will be used to handle the functions related to the devices responsible for
// generating solar energy
{
    private static String[] fetchDeviceID(String usr_name) {
        String devs[] = { "D001BM", "D002BM", "D003BM" };
        return devs;
    }

    // returns an array of string containing the device IDs owned by the user
    private static float getPanelSize(String dev_ID) {
        return dev_ID;
    }

    private static String getPanelMaterial(String dev_ID) {
        return dev_ID;
    }

    private static String getUptime(String dev_ID) {
        return dev_ID;
    }

    private static String getShutdownTime(String dev_ID) {
        return dev_ID;
    }

    private static float[] getAngleOfInclination(String dev_ID) {
        return 75.00;
    }
}

class windEnergy extends manageDevice
// will be used to handle the functions related to the devices responsible for
// generating wind energy
{
    private static String[] fetchDeviceID(String usr_name) {
        String devs[] = { "D001BM", "D002BM", "D003BM" };
        return devs;
    }

    // returns an array of string containing the device IDs owned by the user
    private static float getWindSpeed(String dev_ID) {
        return 75.00;
    }

    private static float getRotorSpeed(String dev_ID) {
        return 456.23;
    }

    private static float[] getWindDirections(String dev_ID) {
        float directions[] = { 23.12, 56.21 };
        return directions;
    }

    private static String getUptime(String dev_ID) {
        return dev_ID;
    }

    private static String getShutdownTime(String dev_ID) {
        return dev_ID;
    }

    private static float getAngleOfTurbine(String dev_ID) {
        return 35.23;
    }
}

class hydroElectric extends manageDevice
// will be used to handle the functions related to the devices responsible for
// generating hydro electric energy
{
    private static String[] fetchDeviceID(String usr_name) {
        String devs[] = { "D001BM", "D002BM", "D003BM" };
        return devs;
    }

    // returns an array of string containing the device IDs owned by the user
    private static float getCurrentSpeed(String dev_ID) {
        return 35.23;
    }

    private static float[] getRotorSpeed(String dev_ID) {
        float speeds[] = { 23.12, 56.21 };
        return speeds;
    }

    private static float[] getCurrentDirections(String dev_ID) {
        float directions[] = { 23.12, 56.21 };
        return directions;
    }

    private static String getUptime(String dev_ID) {
        return dev_ID;
    }

    private static String getShutdownTime(String dev_ID) {
        return dev_ID;
    }
}

class geoThermal extends manageDevice
// will be used to handle the functions related to the devices responsible for
// generating geothermal energy
{
    private static String[] fetchDeviceID(String usr_name) {
        String devs[] = { "D001BM", "D002BM", "D003BM" };
        return devs;
    }

    // returns an array of string containing the device IDs owned by the user
    private static float getCurrentSpeed(String dev_ID) {
        return 35.23;
    }

    private static float[] getRotorSpeed(String dev_ID) {

    }

    private static String getUptime(String dev_ID) {
    }

    private static String getShutdownTime(String dev_ID) {
    }
}

class bioMass
// will be used to handle the functions related to the devices responsible for
// generating biomass energy
{
    private static String[] fetchDeviceID(String usr_name) {
        String devs[] = { "D001BM", "D002BM", "D003BM" };
        return devs;
    }
    // returns an array of string containing the device IDs owned by the user
}

class userLogin
// will be used to handle the functions related to user login [sign-up and
// sign-in]
{
    private static boolean usr_login() {
        return false;
    }

    private static boolean sign_in(String usr_name, String phn_no, String pass, String cnf_pass, boolean captcha) {
        return false;
    }

    private static boolean twofa(String t_otp) {
        return false;
    }

    private static boolean edit_profile() {
        return false;
    }
}

class resourceMapGenerator extends dashboard
// will be used to handle the functions related to the generation and
// working of a map view interface of the various devices set-up at
// different locations of the country
{
    private static void createDashboard() {
    }
}

class solarDev{
    String devId;
    protected 
}

protected class storeDevsInfo{

    storeInfo 
    protected StoreInfo(){

    }
}

protected class storeUsrInfo {

}

public class Main {

    protected String[] parseCreds() {
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
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
    }

    protected static boolean signIn(String creds[]) {

    }

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