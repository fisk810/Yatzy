package com.company;

public class HandChecks{

    public HandChecks() {
    }

    public boolean checkYatzee(int[] numbers){
        for (int number:numbers) {
            if(number == 6){
                return true;
            }
        }
        return false;
    }

    public int checkPairAmount(int[] numbers){
        int pairAmount = 0;
        for (int number:numbers) {
            if(number >= 2){
                pairAmount = pairAmount + 1;
            }
        }
        return pairAmount;
    }

    public boolean checkFourEqual(int[] numbers){

        for (int number:numbers) {
            if(number >= 4){
                return true;
            }
        }
        return false;
    }

    public int checkThreeEqual(int[] numbers){
        int equalAmount = 0;
        for (int number:numbers) {
            if(number >= 3){
                equalAmount = equalAmount + 1;
            }
        }
        return equalAmount;
    }

    public boolean checkStraight(int[] numbers){
        int counter = 0;
        for(int number:numbers){
            if(number == 1){
                counter = counter + 1;
            }
        }
        if (counter == 5){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkRoyal(int[] numbers){
        int counter = 0;
        for (int number: numbers){
            if(number == 1){
                counter = counter + 1;
            }
        }
        if(counter == 6){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkFullHouse(boolean threeEqual, boolean pair){
        if(threeEqual && pair){
            return true;
        }
        else{
            return false;
        }
    }

}
