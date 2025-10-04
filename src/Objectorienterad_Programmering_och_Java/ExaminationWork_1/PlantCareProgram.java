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

        //Program loop
        boolean workLoop = true;
        do {

            //Checks if the plant is in the hotel
            boolean nameLoop = true;
            do {

                //retrieves a plant through User Input
                plantInput = popup.getPlantInput();

                //checks which plant the user want
                switch (plantInput.toUpperCase()) {
                    case "IGGE" -> {
                        //polymorfism
                        plantInUse = PlantsInHotel.IGGE.getPlant();
                        //TODO - Make a call to popups information window with liquidMath & liquidType
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "OLOF" -> {
                        //polymorfism
                        plantInUse = PlantsInHotel.OLOF.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "LAURA" -> {
                        //polymorfism
                        plantInUse = PlantsInHotel.LAURA.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "MEATLOAF" -> {
                        //polymorfism
                        plantInUse = PlantsInHotel.MEATLOAF.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    default -> {
                        String noValidInput = "The plant " + plantInput + " is not a guest here.";
                        popup.openInformationWindow(noValidInput);
                    }

                }

            }while(nameLoop);

        } while (workLoop);

    }

    public void sendPlantCareMessage(Plant plantInUse) {
        String plantCareMessage = plantInUse.getName() + " needs: " + plantInUse.liquidMath() + "l " + plantInUse.liquidType();
        popup.openInformationWindow(plantCareMessage);
    }

}
