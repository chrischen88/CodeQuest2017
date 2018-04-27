import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Prob07 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob07.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0){
            String [] s = in.nextLine().split(":|,");
            String name = s[0];
            double atBat = 0;
            double slg = 0;
            for (int i = 1; i < s.length; i++) {
                try{
                    if(s[i].length() >= 2) {
                        int base = new Integer(s[i].substring(0,s[i].length()-1));
                        slg+=base;
                    }
                    atBat++;
                }
                catch (Exception e){
                    if(s[i].equals("HR")){
                        slg+=4;
                        atBat++;
                    }
                }

            }
            System.out.printf("%s=%.3f%n", name, atBat==0? 0 : slg/atBat);
        }
    }
}
