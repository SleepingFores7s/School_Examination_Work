package Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools;

public class Calculations {

    private double palmMath = 0.5;
    private double carnivorousMathBase = 0.1;
    private double carnivorousMathAdded = 0.2;
    private double cactusMath = 0.2;
    private final String CENTILITERS = "cl";

    //Type choice
    public void plantTypeChoice(String type, double height) {
        switch(type.toUpperCase()) {
            case "PALM" -> getPalmAmount(height);
            case "CARNIVOROUS" -> getCarnivorousAmount(height);
            case "CACTUS" -> {getCactusAmount();}

        }
    }
//TODO - Fixa matten, inte helt klart än
    //Palm
    private void getPalmAmount(double height) {
        System.out.println((palmMath * height) + CENTILITERS);
    }
    //Carnivorous
    private void getCarnivorousAmount(double height) {
        System.out.println(carnivorousMathBase + (carnivorousMathAdded * height) + CENTILITERS);
    }
    //Cactus
    private void getCactusAmount() {
        System.out.println(cactusMath + CENTILITERS);
    }
}
