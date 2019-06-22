package model;

public class NumericalRoman {
    public String change(int number) {
        if(number == 1) return "I";
        else
        if(number == 2) return "II";
        else return "III";
    }
}
