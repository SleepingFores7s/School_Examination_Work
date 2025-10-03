package Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests;

public enum PlantsInHotel {

    //Checked in plants
    IGGE("Igge", "Cactus", 20),
    LAURA("Laura", "Palm", 500),
    MEATLOAF("Meatloaf", "Carnivorous", 70),
    OLOF("Olof", "Palm", 100);

    private String plantName;
    private String plantType;
    private double plantHeightInCm;

    //Enum Constructor
    PlantsInHotel(String plantName, String plantType, double plantHeight) {
        this.plantName = plantName;
        this.plantType = plantType;
        this.plantHeightInCm = plantHeight;
    }

    //Getters
    public String getPlantName() {
        return this.plantName;
    }
    public String getPlantType() {
        return this.plantType;
    }
    public double getPlantHeightInCm() {
        return this.plantHeightInCm;
    }
}
