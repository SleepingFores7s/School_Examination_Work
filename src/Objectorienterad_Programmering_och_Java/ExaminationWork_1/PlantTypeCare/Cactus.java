package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Cactus extends Plant{

    //Inkapsling
    private final String waterType; //Mineralvatten;

    //Konstruktor
    public Cactus(String name, double height, String waterType) {
        super(name, height);
        this.waterType = waterType;
    }

    //Equation for liquid
    @Override
    public double liquidMath() {
        return 0.2;
    }

    //Liquid type
    @Override
    public String liquidType() {
        return this.waterType;
    }
}
