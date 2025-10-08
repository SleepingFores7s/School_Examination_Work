package Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests;

import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Cactus;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Carnivorous;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Palm;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Plant;

public enum PlantsInHotel {

    //Checked in plants
    IGGE(new Cactus("Igge", 0.2)),
    LAURA(new Palm("Laura", 5)),
    MEATLOAF(new Carnivorous("Meatloaf", 0.7)),
    OLOF(new Palm("Olof", 1));

    //Inkapsling
    private final Plant plant;

    //Enum Constructor
    PlantsInHotel(Plant plant) {
        this.plant = plant;
    }

    //Getter
    public Plant getPlant() {
        return this.plant;
    }
}
