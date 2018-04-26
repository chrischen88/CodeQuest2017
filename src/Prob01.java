import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob01.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0){
            String s = in.nextLine();
            System.out.println(s + "\n" + s);
        }
    }
}
