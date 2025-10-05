package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Cactus extends Plant implements Liquid {

    //Inkapsling
    private final String mineralwater = "Mineralvatten";

    //Konstruktor
    public Cactus(String name, double height) {
        super(name, height);
    }

    //Equation for liquid
    @Override
    public double liquidMath() {
        return 0.2;
    }

    //Liquid type
    @Override
    public String liquidType() {
        return this.mineralwater;
    }
}
