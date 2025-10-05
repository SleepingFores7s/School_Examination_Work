package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Palm extends Plant implements Liquid {

    //Inkapsling
    private final String water = "Vatten";

    //Konstruktor
    public Palm(String name, double height) {
        super(name, height);
    }

    //Equation for liquid
    @Override
    public double liquidMath() {
        return (0.5 * this.getHeight());
    }

    //Liquid type
    @Override
    public String liquidType() {
        return this.water;
    }
}
