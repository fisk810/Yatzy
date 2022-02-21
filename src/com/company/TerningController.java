package com.company;

import java.util.ArrayList;

public class TerningController {
    private Raflebaeger r;
    private ArrayList<Terning> diceArr;
    private int[] numbers = {0, 0, 0, 0, 0, 0};

    public TerningController(){
        r = new Raflebaeger();
        for (int i = 0; i < 5; i++) {
            r.tilfoej(new Terning());
        }
        r.ryst();
        diceArr = r.getArray();
    }

    public int[] checkAmountOfNumber() {
        for (Terning t : diceArr) {
            if (t.getVaerdi() == 1) {
                numbers[0] = numbers[0] + 1;
            } else if (t.getVaerdi() == 2) {
                numbers[1] = numbers[1] + 1;
            } else if (t.getVaerdi() == 3) {
                numbers[2] = numbers[2] + 1;
            } else if (t.getVaerdi() == 4) {
                numbers[3] = numbers[3] + 1;
            } else if (t.getVaerdi() == 5) {
                numbers[4] = numbers[4] + 1;
            } else if (t.getVaerdi() == 6) {
                numbers[5] = numbers[5] + 1;
            }
        }
        return numbers;
    }
}

