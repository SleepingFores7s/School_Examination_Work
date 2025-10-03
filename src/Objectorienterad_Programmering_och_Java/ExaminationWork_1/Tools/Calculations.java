package Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools;

public class Calculations {


    //TODO - olika sorters vatten behöver implementeras

    private final String LITER = "l";


    //Type choice
    public void plantTypeChoice(String type, double height) {
        switch(type.toUpperCase()) {
            case "PALM" -> getPalmAmount(height);
            case "CARNIVOROUS" -> getCarnivorousAmount(height);
            case "CACTUS" -> getCactusAmount();

        }
    }
//TODO - Fixa matten, inte helt klart än
    //Palm
    private void getPalmAmount(double height) {
        //Vatten
        double palmWaterMath = 0.5;
        System.out.println((palmWaterMath * height) + LITER);
    }
    //Carnivorous
    private void getCarnivorousAmount(double height) {
        //Protein
        double carnivorousMathProtein1 = 0.1;
        double carnivorousMathProtein2 = 0.2;
        System.out.println(carnivorousMathProtein1 + (carnivorousMathProtein2 * height) + LITER);
    }
    //Cactus
    private void getCactusAmount() {
        //Mineralvatten
        double cactusMathMineral = 0.2;
        System.out.println(cactusMathMineral + LITER);
    }
}
