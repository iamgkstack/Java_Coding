package org.gaurav.iamgkstack;
import java.util.*;

public class PrintPattern {
    public static void  main(String[] args){
        System.out.println("Enter The Number!!");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPat(n);
    }

   public static void printPat(int n)
    {
        StringBuffer sb= new StringBuffer();
        for(int i=n;i>=1;i--){
            for(int j=n; j>=1; j--){
                for(int k=i;k>=1; k--){
//                    sb.append(j+" ");
                    System.out.print(j+" ");
                }
            }
//            sb.append("$");
            System.out.println();
        }
//        System.out.print(sb);
    }
}
