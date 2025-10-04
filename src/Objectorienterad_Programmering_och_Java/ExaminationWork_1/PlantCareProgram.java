package Objectorienterad_Programmering_och_Java.ExaminationWork_1;

import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests.PlantsInHotel;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Plant;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Popups;

public class PlantCareProgram {
    public void careProgram() {

        //Essentials
        String plantInput;
        Plant plantInUse;

//TODO - Lägg till en funktion för att lägga till nya växter, som man
// kan använda interface/arv/polymorfism på

        //Program loop
        boolean workLoop = true;
        do {

            //Checks if the plant is in the hotel
            boolean nameLoop = true;
            do {

                //retrieves a plant through User Input
                plantInput = new Popups().getPlantInput().toUpperCase();

                //checks which plant the user want
                switch (plantInput) {
                    case "IGGE" -> {
                        plantInUse = PlantsInHotel.IGGE.getPlant();
                        //TODO - Make a call to popups information window with liquidMath & liquidType
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "OLOF" -> {
                        plantInUse = PlantsInHotel.OLOF.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "LAURA" -> {
                        plantInUse = PlantsInHotel.LAURA.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "MEATLOAF" -> {
                        plantInUse = PlantsInHotel.MEATLOAF.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    //TODO - remake the no input/ alt. remove default
                    default -> System.out.println("No input was detected");
                }

            }while(nameLoop);

        } while (workLoop);
    }

    public void sendPlantCareMessage(Plant plantInUse) {
        String plantCareMessage = plantInUse.getName() + " needs: " + plantInUse.liquidMath() + "l " + plantInUse.liquidType();
        new Popups().openInformationWindow(plantCareMessage);
    }

}
