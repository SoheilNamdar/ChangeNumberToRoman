package model;

public class NumericalRoman {
    public String change(int number) {

        String st = "";

        while(number >= 10) {
            st += "X";
            number -= 10;
        }

        while(number >= 5 ) {
            st += "V";
            number -= 5;
        }

        for(int i=0 ; i < number ; i++) {
            st += "I";
        }
        return st;
    }
}
