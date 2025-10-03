package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Inlamningsuppgift_3_1 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        Elevator elevator1 = new Elevator();
        Elevator elevator2 = new Elevator();
        Elevator elevator3 = new Elevator();

        elevator1.konstructor(-2, 1);
        elevator2.konstructor(10, 2);
        elevator3.konstructor(3, 3);

        boolean loop = true;
        do {

            System.out.println("Input a number for what elevator to use.\n" +
                    "   Elevator nr: 1\n" +
                    "   Elevator nr: 2\n" +
                    "   Elevator nr: 3\n" +
                    "   EXIT: 4");

            Elevator selectedElevator = null;
            int switchInput = 0;

            try{
                switchInput = sc.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Invalid input, try again.");
                sc.next();
            }

            if(switchInput != 0) {
                switch (switchInput) {
                    case 1:
                        selectedElevator = elevator1;
                        break;
                    case 2:
                        selectedElevator = elevator2;
                        break;
                    case 3:
                        selectedElevator = elevator3;
                        break;
                    case 4: //EXIT
                        System.out.println("Shutting of the program");
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid elevator, try again.");
                }
            }

            if(selectedElevator != null) {
                System.out.println("What floor do you want to go to using elevator " + selectedElevator.whatElevatorNr());
                selectedElevator.where();
                try {
                    selectedElevator.goTo(sc.nextInt());
                }catch(InputMismatchException e) {
                    System.out.println("Invalid floor, please try again.");
                    sc.next();
                }
            }
        } while (loop);
    }
}
