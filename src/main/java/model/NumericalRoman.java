package model;

public class NumericalRoman {
    public String change(int number) {

        String st = "";

        if(number >= 5 && number <= 9 ) {
            st += "V";
            number -= 5;
        }

        if(number >= 10 && number <= 13) {
            st += "X";
            number -= 10;
        }

        for(int i=0 ; i < number ; i++) {
            st += "I";
        }
        return st;
    }
}
