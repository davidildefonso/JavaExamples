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

        //for (String animal : animals) {
           // System.out.println(animal + " ");
        //}


        /*
        hello("David");
        System.out.println(sumOfTwoNumbers(3.1413, 6.553));
        System.out.println(sumOfTwoNumbers(3,12));

        System.out.printf("This is a format string %s \n", "idiot");
        System.out.printf("hola numero: %d", 101);
        System.out.println();
        System.out.printf("boolean %b", true);
        System.out.println();
        System.out.printf("character: %c", 'X');
        System.out.println();
        System.out.printf("float number %f", 6.2232);
        System.out.println();
        System.out.printf("width example: %5d %5d", 23, 12);
        System.out.println();

        System.out.printf("precision example: %.2f", 6.442212);
        System.out.println();

        System.out.printf("flags example : %20.2f", 11200223.1415);
*/

        Car myCar = new Car();
        System.out.println(myCar.color);
        myCar.drive();
        myCar.brake();

        Car secondCar = new Car();
        System.out.println(myCar.model);
        secondCar.drive();
        secondCar.brake();




    }

    static double sumOfTwoNumbers(double num1, double num2){
        return num1 + num2;
    }

    static int sumOfTwoNumbers(int num1,int num2){
        return num1 + num2;
    }

    static void hello(String name){
        System.out.println("Hello "+ name +"! ");
    }
}
