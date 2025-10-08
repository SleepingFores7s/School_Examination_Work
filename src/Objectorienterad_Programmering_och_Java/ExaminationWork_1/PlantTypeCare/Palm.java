package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Palm extends Plant{

    //Inkapsling
    private final String waterType; //Vatten

    //Konstruktor
    public Palm(String name, double height, String waterType) {
        super(name, height);
        this.waterType = waterType;
    }

    //Equation for liquid
    @Override
    public double liquidMath() {
        return (0.5 * this.getHeight());
    }

    //Liquid type
    @Override
    public String liquidType() {
        return this.waterType;
    }
}
