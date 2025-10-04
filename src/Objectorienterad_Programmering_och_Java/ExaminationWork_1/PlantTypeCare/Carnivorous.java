package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Carnivorous extends Plant implements Liquid{

    private final String proteinDrink = "Protein Dryck";

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public void liquidMath() {

    }

    @Override
    public String liquidType() {
        return this.proteinDrink;
    }
}
