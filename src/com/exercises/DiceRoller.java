package com.exercises;
import java.util.Random;

public class DiceRoller {

    Random globalRandom;
    int globalNum;

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        rollWithArgs(random, number);
        rollWithGlobalVariables();
    }

    void rollWithArgs(Random rand, int num){
        num = rand.nextInt(6) + 1;
        System.out.println(num);
    }

    void rollWithGlobalVariables(){
        globalRandom = new Random();
        globalNum = globalRandom.nextInt(6) + 1;
        System.out.println(globalNum);
    }
}
