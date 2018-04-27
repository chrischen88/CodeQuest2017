import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob11.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0) {
            String [] s = in.nextLine().toLowerCase().split(" ");
            String newString = "";
            for (int i = 0; i < s.length; i++) {
                if(s[i].matches("[^\\w]+")) {
                    char[]c=s[i].toCharArray();
                    for (int j = s[i].length()-2; j >= 0; j--) {
                        newString+=c[j];
                    }
                    newString+=c[s[i].length()-1];
                }
                else {
                    char[]c=s[i].toCharArray();
                    for (int j = s[i].length()-1; j >= 0; j--) {
                        newString+=c[j];
                    }
                }
                newString+=" ";
            }
            newString = newString.trim();
            System.out.println(newString);
        }
    }
}
