import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob04 {

    static ArrayList<BigInteger>list;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob04.in.txt"));
        list = new ArrayList<>();
        list.add(new BigInteger("0")); list.add(new BigInteger("1"));
        int sets = new Integer(in.nextLine());
        while(sets-->0){
            int nth = new Integer(in.nextLine());
            System.out.println(nth+" = "+fibonacci(nth));
        }
    }

    static BigInteger fibonacci(int n)
    {
        if(n==1) return list.get(0);
        else if(n == 2) return list.get(1);
        else if(n < list.size()) return list.get(n);
        else {
            BigInteger fib = fibonacci(n-1).add(fibonacci(n-2));
            list.add(fib);
            return fib;
        }
    }
}
