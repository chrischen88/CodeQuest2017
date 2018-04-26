import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob02.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0){
            String [] s = in.nextLine().split(" ");
            int index = new Integer(s[1]);
            System.out.println(s[0].substring(0,index) + s[0].substring(index+1));
        }
    }
}
