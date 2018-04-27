import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.*;

public class Prob08 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob08.in.txt"));
        int sets = new Integer(in.nextLine());
        while(sets-->0){
            String [] s = in.nextLine().split(" ");
            long totalSeconds = Math.round(((new Double(s[0]) * 1_000_000)/new Double(s[1]))*60*60);
            LocalDateTime time = LocalDateTime.of(2000,1,1,0,0,0);
            LocalDateTime newTime = time.plusSeconds(totalSeconds);
            System.out.print("Time to Mars: " + DAYS.between(time, newTime) + " days, ");
            newTime = newTime.minusDays(DAYS.between(time, newTime));
            System.out.print(HOURS.between(time,newTime)+" hours, ");
            newTime = newTime.minusHours(HOURS.between(time, newTime));
            System.out.print(MINUTES.between(time,newTime)+" minutes, ");
            newTime = newTime.minusMinutes(MINUTES.between(time,newTime));
            System.out.println(SECONDS.between(time,newTime)+" seconds");
        }
    }
}
