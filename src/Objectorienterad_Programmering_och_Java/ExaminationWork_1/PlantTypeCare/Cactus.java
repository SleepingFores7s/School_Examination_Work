package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Cactus extends Plant implements Liquid{
    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public void liquidMath() {

    }

    @Override
    public String liquidType() {
        return "Mineralvatten";
    }
}
