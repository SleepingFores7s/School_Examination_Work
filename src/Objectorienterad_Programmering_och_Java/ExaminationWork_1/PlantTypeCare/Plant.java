package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public abstract class Plant implements Liquid {

    //Inkapsling
    private final String name;
    private final double height;

    //Konstruktor
    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    //Name //Polymorfism in the sense that I can get the subclasses names by calling this
    public String getName() {
        return name;
    }

    //Height //Polymorfism in the sense that I can get the subclasses height by calling this
    public double getHeight() {
        return height;
    }
}
