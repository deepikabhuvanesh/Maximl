import java.util.*;
import java.io.*;
class Main{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         int n=sc.nextInt();
         int NO_OF_CHARS=256;
        int count[] = new int[NO_OF_CHARS]; 
        for (int i =0; i < n; i++) { 
            count[str.charAt(i)]++; 
        } 
        int max_distinct = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++) { 
            if (count[i] != 0) { 
                max_distinct++; 
            } 
        }
        System.out.print(max_distinct); 
     }
}
