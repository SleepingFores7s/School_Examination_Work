package Objectorienterad_Programmering_och_Java.ExaminationWork_1;

import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests.PlantsInHotel;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Plant;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Calculations;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Popups;

public class PlantCareProgram {
    public void careProgram() {

        //Essentials
        Calculations plantCalculations = new Calculations();
        Plant plantInUse;
        Popups popup = new Popups();


//TODO - Lägg till en funktion för att lägga till nya växter, som man
// kan använda interface/arv/polymorfism på

        //Program loop
        boolean workLoop = true;
        do {


            //Checks if the plant is in the hotel
            boolean nameLoop = true;
            do {
                switch (popup.getPlantInput().toUpperCase()) {
                    case "IGGE" -> {
                        plantInUse = PlantsInHotel.IGGE.getPlant();
                        nameLoop = false;
                    }
                    case "OLOF" -> {
                        plantInUse = PlantsInHotel.OLOF.getPlant();
                        nameLoop = false;
                    }
                    case "LAURA" -> {
                        plantInUse = PlantsInHotel.LAURA.getPlant();
                        nameLoop = false;
                        plantInUse.liquidMath();
                    }
                    case "MEATLOAF" -> {
                        plantInUse = PlantsInHotel.MEATLOAF.getPlant();
                        nameLoop = false;
                    }
                    default -> System.out.println("No input was detected");
                }
            }while(nameLoop);

//            plantCalculations.plantTypeChoice(
//                    plantInUse.getPlantType(),
//                    plantInUse.getPlantHeightInMeter()
//            );


        } while (workLoop);
    }
}
