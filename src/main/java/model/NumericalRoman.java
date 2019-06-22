package model;

public class NumericalRoman {
    public String change(int number) {
        String st = "";
        for(int i=0 ; i < number ; i++) {
            st += "I";
        }
        return st;
    }
}
