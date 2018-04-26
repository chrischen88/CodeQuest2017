import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob03.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0){
            String [] s = in.nextLine().split(" ");
            int num1 = new Integer(s[0]);
            int num2 = new Integer(s[1]);
            System.out.println(num1+num2+" "+num1*num2);
        }
    }
}
