package Assignment;

public class Q5Pattern {
    public static void main(String args[]){
        //getSquarePattern();
        printPattern();
    }

//    private static void getSquarePattern() {
//        int x =4;
//        String s = "";
//        List<String> st = new ArrayList<String>();
//        for (int i = 0; i < x; i++) {
//            for (int j = 2*x-1; j >0; j--) {
//                s = s + x ;
//                switch(i){
//                    case 1:
//                        s = s + x ;
//                }
//            }
//            st.add(s);
//            s = "";
//        }
//        for(String g: st){
//            System.out.println(g);
//        }
//    }

    public static void printPattern(){

                int n = 7; // Size of the pattern

                // Loop through each row
                for (int i = 0; i < n; i++) {
                    // Loop through each column in the current row
                    for (int j = 0; j < n; j++) {
                        // Calculate the value to be printed
                        int value = (n/2+1) - Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
                        // Print the value without a newline
                        System.out.print(value);
                    }
                    // Move to the next line after printing each row
                    System.out.println();
                }
            }
        }

