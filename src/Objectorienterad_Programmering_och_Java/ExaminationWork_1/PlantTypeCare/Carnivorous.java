package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Carnivorous extends Plant{

    //Inkapsling
    private final String waterType; //Protein Dryck

    //Konstruktor
    public Carnivorous(String name, double height, String waterType) {
        super(name, height);
        this.waterType = waterType;
    }

    //Equation for liquid
    @Override
    public double liquidMath() {
        return (0.1 + (0.2 * this.getHeight()));
    }

    //Liquid type
    @Override
    public String liquidType() {
        return this.waterType;
    }
}
