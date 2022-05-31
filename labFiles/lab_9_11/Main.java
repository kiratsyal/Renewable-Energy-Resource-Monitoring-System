//package lab_9_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

class ContainsNumException extends Exception {
    public ContainsNumException(String s) {
        // Call constructor of parent Exception
        System.out.println("ContainsNumException : The owner's name should not contain numbers");
        // super(s);
    }
}

class Device {
    static StringBuilder seedID = new StringBuilder("D00");
    static int dev_count = 0;
    String dev_id, owner_name;
    float power_required;
    // 1: Solar, 2: Wind, 3: HydroElectric
    int dev_type;

    Device(String owner_name, int dev_type, float power_required) {
        this.dev_id = seedID.substring(0, 2) + String.valueOf(dev_count);
        this.dev_type = dev_type;
        this.owner_name = owner_name.substring(0, 1).toUpperCase() + owner_name.substring(1);
        this.power_required = power_required;
        //this.dev_count += 1;
    }
}

public class Main {
    public static String containsNum(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars)
            if (Character.isDigit(c))
                sb.append(c);

        return sb.toString();
    }

    public static Device getInp() throws IOException{
        int dev_type;
        float power_required;
        StringBuffer name = new StringBuffer(30);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("\nEnter Name of owner : ");
            name.append(br.readLine());
            if (containsNum(name.toString()).length() > 1)
                throw new ContainsNumException("\nThe name must not contain numeric values...");

        } catch (ContainsNumException CNE) {
            System.out.println(CNE.getMessage());
        } catch (Exception myEx) {
            System.out.println(myEx);
        } finally {
            System.out.print("\nException or No Exception... Finally always executes!!\n");
            // continue;
        }
        System.out.print(
                "\n[ 1: Solar Panel, 2: Windmill, 3: HydroElectric Generator ]\nEnter device type : ");
        dev_type = Integer.parseInt(br.read());
        System.out.print("\n");
        power_required = Float.parseFloat(br.readLine());

        return new Device(name.toString(), dev_type, power_required);
    }

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Showing ArrayList of Class Device and using
        // Command Line arguments to initialize size of ArrayList
        ArrayList<Device> Devices = new ArrayList<>(Integer.parseInt(args[0]));

        while (flag) {
            System.out.print(
                    "\n[ 1 ] : Enter Record\n[ 2 ] : Show all records\n[ 3 ] : Search a record\n[ x ] : Exit Program\n[ > ] : ");

            switch ((char) br.read()) {

                case '1':
                    // Adding new object to arraylist
                    Devices.add(getInp());
                    break;

                case '2':
                    Iterator<Device> itr = Devices.iterator();
                    System.out.println("\nDEVICE ID\tOWNER\tDEVICE TYPE\tPOWER REQUIRED (in watt)");
                    System.out.println(
                            "\n=============================================================================================");
                    while (itr.hasNext()) {
                        Device obj = itr.next();
                        System.out.print(obj.dev_id + "\t" + obj.owner_name + "\t" + obj.dev_type + "\t"
                                + obj.power_required + "\t");
                    }
                    System.out.println(
                            "\n=============================================================================================");
                    break;

                case '3':
                    // continue;
                    // for (Integer i : numbers)
                    // System.out.print(i + " ");
                    break;

                case '4':
                    // continue;
                    break;

                default:
                    System.out.print("\nInvalid Input ...\nTry Again ...\n");
                    break;
            }
            System.out.print("\nPress any key to continue ...");
            br.read();
        }
        br.close();
        System.out.print("\nExiting Program ...");
    }
}