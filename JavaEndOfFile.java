import java.io.*;
import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int line=1;
        while(sc.hasNext())
        {
            System.out.println(line+" "+sc.nextLine());
            line+=1;
        }
    }
}
