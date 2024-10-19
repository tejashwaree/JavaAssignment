package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Q3Pattern {
    public static void main(String args[]){
        int x = 5;
        getHalfDiamondShape(x);
    }

    private static void getHalfDiamondShape(int x) {
        String s = "";
        List<String> st = new ArrayList<String>();
        for(int i=0;i<x;i++){
            for(int j=0;j<x-1-i;j++){
                s = s+" ";
            }
            for(int k=1;k<=2*i+1;k++){
                s = s+ "*";
            }
            st.add(s);
            s = "";
        }
        for(String g: st){
            System.out.println(g);
        }
    }
}
