package model;

public class NumericalRoman {
    public String change(int number) {

        String st = "";

        if(number >= 5 && number <= 9 ) {
            st += "V";
            number -= 5;
        }

        if(number >= 11 && number <= 13) {
            st += "X";
            number -= 10;
        }
        /*if(number == 12) return "XII";
        if(number == 13) return  "XIII";*/

        for(int i=0 ; i < number ; i++) {
            st += "I";
        }
        return st;
    }
}
