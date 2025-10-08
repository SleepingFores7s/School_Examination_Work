package Objectorienterad_Programmering_och_Java.ExaminationWork_1.PlantTypeCare;

import org.junit.jupiter.api.Test;

class PalmTest {

    Plant palm = new Palm("Bertil", 2, "Vatten");

    @Test
    void liquidMath() {
        assert(palm.liquidMath() == 1);
        assert(palm.liquidMath() != 0.5);
    }
    @Test
    void liquidType() {
        assert(palm.liquidType().equals("Vatten"));
        assert (!palm.liquidType().equals("Katt"));
    }
}