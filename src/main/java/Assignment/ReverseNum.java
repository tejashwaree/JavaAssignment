package Assignment;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]){
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        reverseNum(x);
    }

    private static void reverseNum(int x) {
        int t=0, s=0;
        while(x>0){
          t = x%10;
          s = s*10 + t ; //30
          x = x/10;
        }
        System.out.println("Reverse number is "+s);
    }

}
