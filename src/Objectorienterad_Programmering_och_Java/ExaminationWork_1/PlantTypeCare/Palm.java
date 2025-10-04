package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Palm extends Plant implements Liquid{

private String water = "Vatten";

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public void liquidMath() {

    }

    @Override
    public String liquidType() {
        return this.water;
    }
}
