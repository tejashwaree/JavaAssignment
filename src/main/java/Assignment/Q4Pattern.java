package Assignment;

public class Q4Pattern {
    public static void main(String args[]){
        getPattern();
    }

    private static void getPattern() {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
