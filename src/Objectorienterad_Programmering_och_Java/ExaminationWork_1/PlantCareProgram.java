package Objectorienterad_Programmering_och_Java.ExaminationWork_1;

import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests.PlantsInHotel;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Plant;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Calculations;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Popups;

public class PlantCareProgram {
    public void careProgram() {

        //Essentials
        Calculations plantCalculations = new Calculations();
        String plantInput;
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

                plantInput = popup.getPlantInput().toUpperCase();

                switch (plantInput) {
                    case "IGGE" -> {
                        plantInUse = PlantsInHotel.IGGE.getPlant();
                        plantInUse.liquidMath();
                        nameLoop = false;
                    }
                    case "OLOF" -> {
                        plantInUse = PlantsInHotel.OLOF.getPlant();
                        plantInUse.liquidMath();
                        nameLoop = false;
                    }
                    case "LAURA" -> {
                        plantInUse = PlantsInHotel.LAURA.getPlant();
                        plantInUse.liquidMath();
                        nameLoop = false;
                    }
                    case "MEATLOAF" -> {
                        plantInUse = PlantsInHotel.MEATLOAF.getPlant();
                        plantInUse.liquidMath();
                        nameLoop = false;
                    }
                    default -> System.out.println("No input was detected");
                }
            }while(nameLoop);



        } while (workLoop);
    }
}
