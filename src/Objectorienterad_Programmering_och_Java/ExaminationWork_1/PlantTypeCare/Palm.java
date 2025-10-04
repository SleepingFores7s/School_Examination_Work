package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Palm extends Plant implements Liquid{

private final String water = "Vatten";

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public void liquidMath() {

        System.out.println("Plantan" + this.getName() +" ska ha " + (0.5 * this.getHeight() + " " +  this.liquidType()));
    }

    @Override
    public String liquidType() {
        return this.water;
    }
}
