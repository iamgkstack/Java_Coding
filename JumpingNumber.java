package org.gaurav.iamgkstack;
import  java.util.*;

public class JumpingNumber {
    public static  void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Please Enter the test Case");
        int t=in.nextInt();
        while(t-->0){
            System.out.println("Enter the number");
            int n=in.nextInt();
            findJumpingNumber(n);
        }
    }

    static void findJumpingNumber(int n){
        LinkedList<Integer> queue=new LinkedList<Integer>();
        for(int i=1;i<=9;i++){
            queue.add(i);
        }
        System.out.print(0+" ");
        while(!queue.isEmpty()){
            int temp=queue.remove();
            if(temp>n)
                break;
            System.out.print(temp+" ");
            int left=temp%10;
            if(left>0)
                queue.add(temp*10+(left-1));
            if(left<9)
                queue.add(temp*10+(left+1));
        }
        System.out.println();
    }


}
