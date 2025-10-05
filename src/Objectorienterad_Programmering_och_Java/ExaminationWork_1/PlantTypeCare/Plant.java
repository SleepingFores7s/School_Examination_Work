package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public abstract class Plant implements Liquid {

    //Inkapsling
    private String name;
    private double height;

    //Konstruktor
    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    //Name
    public String getName() {
        return name;
    }

    //Height
    public double getHeight() {
        return height;
    }
}
