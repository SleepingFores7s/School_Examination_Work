package Java_Utveckling.ExaminationWork_3.ExaminationWork_3_2.smallTasks;

import java.util.Random;

public class combatRandomizer {

    Random random = new Random();

    public int heal() {
        return random.nextInt(4, 16);
    }

    public int enemyAction() {
        return random.nextInt(0, 3);
    }

    public int flee() {
        return random.nextInt(0,2);
    }
}
