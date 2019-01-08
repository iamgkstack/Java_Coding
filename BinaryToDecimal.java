package org.gaurav.iamgkstack;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Test Case!!");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Please enter the binary number which you want to convert in decimal");

            long num=sc.nextLong();
            String b_num= String.valueOf(num);

            System.out.println(binary_to_decimal(b_num));
        }
    }

    public static int binary_to_decimal(String num){
        String n=num;
        int dec_value=0;
        int base=1;
        int len=n.length();
        for(int i=len-1; i>=0;i--) {
            if(n.charAt(i)=='1') {
                dec_value=dec_value+base;

            }
            base=base*2;
        }
        return dec_value;
    }
}
