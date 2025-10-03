package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

public abstract class Plant implements Liquid{

    private String name;
    private double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }
//Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//Height
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
