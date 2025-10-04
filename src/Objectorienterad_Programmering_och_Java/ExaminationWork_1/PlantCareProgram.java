package Objectorienterad_Programmering_och_Java.ExaminationWork_1;

import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests.PlantsInHotel;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Plant;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Popups;

public class PlantCareProgram {
    Popups popup = new Popups();
    public void careProgram() {

        //Essentials
        String plantInput;
        Plant plantInUse;
        String plantCareMessage;



//TODO - Lägg till en funktion för att lägga till nya växter, som man
// kan använda interface/arv/polymorfism på

        //Program loop
        boolean workLoop = true;
        do {


            //Checks if the plant is in the hotel
            boolean nameLoop = true;
            do {

                //retrieves a plant through User Input
                plantInput = popup.getPlantInput().toUpperCase();

                //checks which plant the user want
                switch (plantInput) {
                    case "IGGE" -> {
                        sendPlantCareMessage(PlantsInHotel.IGGE.getPlant());
                        nameLoop = false;
                    }
                    case "OLOF" -> {
                        sendPlantCareMessage(PlantsInHotel.OLOF.getPlant());
                        nameLoop = false;
                    }
                    case "LAURA" -> {
                        sendPlantCareMessage(PlantsInHotel.LAURA.getPlant());
                        nameLoop = false;
                    }
                    case "MEATLOAF" -> {
                        sendPlantCareMessage(PlantsInHotel.MEATLOAF.getPlant());
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
        popup.openInformationWindow(plantCareMessage);
    }

}
