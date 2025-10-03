package Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests;

public enum PlantsInHotel {

    //Checked in plants
    IGGE("Igge", "Cactus", 0.2),
    LAURA("Laura", "Palm", 3),
    MEATLOAF("Meatloaf", "Carnivorous", 0.7),
    OLOF("Olof", "Palm", 1);

    private final String plantName;
    private final String plantType;
    private final double plantHeightInMeter;

    //Enum Constructor
    PlantsInHotel(String plantName, String plantType, double plantHeight) {
        this.plantName = plantName;
        this.plantType = plantType;
        this.plantHeightInMeter = plantHeight;
    }

    //Getters
    public String getPlantName() {
        return this.plantName;
    }
    public String getPlantType() {
        return this.plantType;
    }
    public double getPlantHeightInMeter() {
        return this.plantHeightInMeter;
    }
}
