import java.util.*;
import java.io.*;
import java.lang.*;
public class Toi {
    static int count = 0;
    static void towerofhonoi(int n, char source, char auxiliary, char destination){
        if(n == 1)
        {
            System.out.println("Move disk 1 from "+source+" to "+ destination);
            count++;
            System.out.println("Total number of movements: "+count);
            return;
        }
        count++;
        towerofhonoi(n-1,source,auxiliary,destination);
        System.out.println("Move the "+n+"th disk from "+source+" to "+destination);
        towerofhonoi(n-1,auxiliary,destination,source);

    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int n = s.nextInt();
        towerofhonoi(n,'A','B','C');

    }
}
