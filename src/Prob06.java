import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Prob06 {
    static TreeMap<Character, String> map;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob06.in.txt"));
        int sets = new Integer(in.nextLine());
        map = new TreeMap<>();
        initMap();
        while(sets-->0){
            int lines = new Integer(in.nextLine());
            while(lines-->0){
                String [] words = in.nextLine().toUpperCase().split(" ");
                for (int i = 0; i < words.length; i++) {
                    char[]arr = words[i].toCharArray();
                    for (int j = 0; j < words[i].length(); j++) {
                        System.out.print(map.get(arr[j]));
                        if (j < words[i].length()-1) System.out.print("-");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    static void initMap() {
        map.put('A', "Alpha");
        map.put('B', "Bravo");
        map.put('C', "Charlie");
        map.put('D', "Delta");
        map.put('E', "Echo");
        map.put('F', "Foxtrot");
        map.put('G', "Golf");
        map.put('H', "Hotel");
        map.put('I', "India");
        map.put('J', "Juliet");
        map.put('L', "Lima");
        map.put('M', "Mike");
        map.put('N', "November");
        map.put('O', "Oscar");
        map.put('P', "Papa");
        map.put('Q', "Quebec");
        map.put('R', "Romeo");
        map.put('S', "Sierra");
        map.put('T', "Tango");
        map.put('U', "Uniform");
        map.put('V', "Victor");
        map.put('W', "Whiskey");
        map.put('X', "Xray");
        map.put('Y', "Yankee");
        map.put('Z', "Zulu");
    }
}
