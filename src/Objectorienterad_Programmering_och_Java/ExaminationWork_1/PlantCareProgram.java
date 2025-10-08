package Objectorienterad_Programmering_och_Java.ExaminationWork_1;

import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Guests.PlantsInHotel;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare.Plant;
import Objectorienterad_Programmering_och_Java.ExaminationWork_1.Tools.Popups;

import javax.swing.*;
import java.text.DecimalFormat;

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
                        //polymorfism by using superclass and setting the subclass
                        plantInUse = PlantsInHotel.IGGE.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "OLOF" -> {
                        //polymorfism by using superclass and setting the subclass
                        plantInUse = PlantsInHotel.OLOF.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "LAURA" -> {
                        //polymorfism by using superclass and setting the subclass
                        plantInUse = PlantsInHotel.LAURA.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    case "MEATLOAF" -> {
                        //polymorfism by using superclass and setting the subclass
                        plantInUse = PlantsInHotel.MEATLOAF.getPlant();
                        sendPlantCareMessage(plantInUse);
                        nameLoop = false;
                    }
                    default -> {
                        String noValidInput = "Växten " + plantInput + " är inte en gäst här.";
                        popup.openInformationWindow(noValidInput);
                    }
                }



            } while (nameLoop);

        } while (workLoop);

    }

    public void sendPlantCareMessage(Plant plantInUse) {
        DecimalFormat df = new DecimalFormat("0.##");
        //polymorfism, because im getting the name, math formula & water type through the use of a superclass to call on its subclass's method's
        String plantCareMessage = plantInUse.getName() + " behöver: " + df.format(plantInUse.liquidMath()) + "l " + plantInUse.liquidType();
        popup.openInformationWindow(plantCareMessage);
    }

}
