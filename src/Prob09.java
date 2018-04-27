import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Prob09 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob09.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0) {
            char[] toEncrypt = in.nextLine().toCharArray();
            char[] key = in.nextLine().toCharArray();
            TreeMap<Character, Character[]>map = initMap(key);
            String s = "";
            int count = 0;
            for (int i = 0; i < toEncrypt.length; i++) {
                if(toEncrypt[i]!=' ') {
                    s += map.get(key[count])[toEncrypt[i] - 65];
                    count++;
                }
                else {
                    s+=' ';
                }
                if(count >= key.length) count=0;
            }
            System.out.println(s);
        }
    }

    public static TreeMap initMap(char[]key) {
        TreeMap<Character, Character[]>map = new TreeMap<>();
        for (int i = 0; i < key.length; i++) {
            if(!map.containsKey(key[i])) {
                Character[]c=new Character[26];
                int count = 0;
                char letter = key[i];
                while(count<26) {
                    c[count] = letter;
                    letter++;
                    if(letter>90) letter = 65;
                    count++;
                }
                map.put(key[i], c);
            }
        }
        return map;
    }
}
