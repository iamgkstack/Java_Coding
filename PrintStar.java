package org.gaurav.iamgkstack;
import java.security.PrivateKey;
import java.util.*;

public class PrintStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the row you want to print!!");
        int n=sc.nextInt();

        PrintPat(n);
    }

    private static void PrintPat(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}
