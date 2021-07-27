package com.exercises;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
      //  String name = JOptionPane.showInputDialog(
        //        "Enter your name: "
        //);
        //JOptionPane.showMessageDialog(null,
        //        "Hello " + name);
        //int age = Integer.parseInt(JOptionPane
           // .showInputDialog("Enter your age: "));
        //JOptionPane.showMessageDialog(null,
      //          "You are " + age + " years old.");
       // double height = Double.parseDouble(JOptionPane
         //   .showInputDialog("Enter your height: "));
        //JOptionPane.showMessageDialog(null,
    //            "You are " + height + " cm tall");

        Random random = new Random();
        int randomNumber = random.nextInt(60);
        //System.out.println(randomNumber);

        double randomY = random.nextDouble();
        //System.out.println(randomY);

        boolean randomBool = random.nextBoolean();
        //System.out.println(randomBool);

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String animal : animals) {
            System.out.println(animal + " ");
        }


    }
}
