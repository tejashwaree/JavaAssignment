package Assignment;

import java.util.Scanner;

public class NumberDivisor {
    public static void main(String args[]){
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        divisorNum(x);
    }

    private static void divisorNum(int x) {
        for(int i =1;i<=x;i++){
            if(x%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("All divisor of "+x+" are printed");
    }
}
