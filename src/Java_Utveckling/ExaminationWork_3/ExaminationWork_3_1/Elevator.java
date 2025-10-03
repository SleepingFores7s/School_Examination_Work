package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_1;

public class Elevator {

    private int level;
    private int elevatorNr;

    public void konstructor(int decidedLevel, int elevatorNr) {
        if(decidedLevel < -2 || decidedLevel > 10) {
            System.out.println("Invalid starting floor.");
            return;
        }
        this.level = decidedLevel;
        this.elevatorNr = elevatorNr;
    }

    public void goTo(int goToLevel) {
        if (goToLevel < -2 || goToLevel > 10) {
            System.out.println("Invalid floor picked, please try again.");
        } else if(goToLevel == level) {
            System.out.println("The elevator is at the chosen floor");
            return;
        }else if(level > goToLevel) {
            System.out.println("Elevator is going down.");
            this.level = goToLevel;
        }else if (level < goToLevel) {
            System.out.println("Elevator is going up.");
            this.level = goToLevel;
        }

    }

    public void where() {
        System.out.println("Elevator nr: " + elevatorNr + " is at floor nr: " + level);
    }

    public int whatElevatorNr() {
        return elevatorNr;
    }

}
