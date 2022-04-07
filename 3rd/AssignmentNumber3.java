import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.InetAddress;
import java.util.Scanner;
//import java.net.UnknownHostException;

public class AssignmentNumber3 {
    public static void runSystemCommand(String str) {

        try {
            Process process = Runtime.getRuntime().exec(str);
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String s;
            // reading output stream of the command
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                //process.destroy();
            }
          process.destroy();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        str =sc.nextLine();
        // str=35.200.167.142 or str=cricbuzz.com
        runSystemCommand("ping "+str);
    }
}
