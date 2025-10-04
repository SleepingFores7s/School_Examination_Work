package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Palm extends Plant implements Liquid {

    private final String water = "Vatten";

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double liquidMath() {
        return (0.5 * this.getHeight());
    }

    @Override
    public String liquidType() {
        return this.water;
    }
}
