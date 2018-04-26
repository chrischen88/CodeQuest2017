import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prob05 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob05.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0){
            String [] lastYearDonors = in.nextLine().split(",");
            String [] thisYearDonors = in.nextLine().split(",");
            ArrayList<String> onlyLast = lastYear(lastYearDonors, thisYearDonors);
            for (int i = 0; i < onlyLast.size(); i++) {
                System.out.print(onlyLast.get(i));
                if(i<onlyLast.size()-1) System.out.print(",");
            }
            System.out.println();
            ArrayList<String> both = bothYear(lastYearDonors, thisYearDonors);
            for (int i = 0; i < both.size(); i++) {
                System.out.print(both.get(i));
                if(i<both.size()-1) System.out.print(",");
            }
            System.out.println();
            ArrayList<String> onlyThis = thisYear(lastYearDonors, thisYearDonors);
            for (int i = 0; i < onlyThis.size(); i++) {
                System.out.print(onlyThis.get(i));
                if(i<onlyThis.size()-1) System.out.print(",");
            }
            System.out.println();
        }
    }

    static ArrayList<String> thisYear(String [] lyd, String [] tyd){
        ArrayList<String>list = new ArrayList<>();
        for (int i = 0; i < tyd.length; i++) {
            boolean only = true;
            for (int j = 0; j < lyd.length; j++) {
                if(tyd[i].equals(lyd[j])) only = false;
            }
            if(only)list.add(tyd[i]);
        }
        Collections.sort(list);
        return list;
    }

    static ArrayList<String> lastYear(String [] lyd, String [] tyd){
        ArrayList<String>list = new ArrayList<>();
        for (int i = 0; i < lyd.length; i++) {
            boolean only = true;
            for (int j = 0; j < tyd.length; j++) {
                if(lyd[i].equals(tyd[j])) only = false;
            }
            if(only)list.add(lyd[i]);
        }
        Collections.sort(list);
        return list;
    }

    static ArrayList<String> bothYear(String [] lyd, String [] tyd){
        ArrayList<String>list = new ArrayList<>();
        for (int i = 0; i < lyd.length; i++) {
            for (int j = 0; j < tyd.length; j++) {
                if(lyd[i].equals(tyd[j])) list.add(lyd[i]);
            }
        }
        Collections.sort(list);
        return list;
    }
}
