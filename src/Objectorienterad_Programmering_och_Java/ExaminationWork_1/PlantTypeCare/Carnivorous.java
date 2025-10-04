package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public class Carnivorous extends Plant implements Liquid{

    //Inkapsling
    private final String proteinDrink = "Protein Dryck";

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public double liquidMath() {
        return (0.1 + (0.2 * this.getHeight()));
    }

    @Override
    public String liquidType() {
        return this.proteinDrink;
    }
}
