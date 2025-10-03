package Objectorienterad_Programmering_och_Java.ExaminationWork_1;

import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests.PlantsInHotel;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Calculations;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Popups;

public class PlantCareProgram {
    public void careProgram() {

        //Essentials
        Calculations plantCalculations = new Calculations();
        PlantsInHotel plantInUse = null;
        Popups popup = new Popups();



        //Program loop
        boolean workLoop = true;
        do {


            //Checks if the plant is in the hotel
            boolean nameLoop = true;
            do {
                switch (popup.getPlantInput().toUpperCase()) {
                    case "IGGE" -> {
                        plantInUse = PlantsInHotel.IGGE;
                        nameLoop = false;
                    }
                    case "OLOF" -> {
                        plantInUse = PlantsInHotel.OLOF;
                        nameLoop = false;
                    }
                    case "LAURA" -> {
                        plantInUse = PlantsInHotel.LAURA;
                        nameLoop = false;
                    }
                    case "MEATLOAF" -> {
                        plantInUse = PlantsInHotel.MEATLOAF;
                        nameLoop = false;
                    }
                    default -> System.out.println("No input was detected");
                }
            }while(nameLoop);

            plantCalculations.plantTypeChoice(
                    plantInUse.getPlantType(),
                    plantInUse.getPlantHeightInCm()
            );


        } while (workLoop);
    }
}
