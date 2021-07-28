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

/*
        Car myCar = new Car();
        System.out.println(myCar.toString());

        /*
        System.out.println(myCar.color);
        myCar.drive();
        myCar.brake();

        Car secondCar = new Car();
        System.out.println(myCar.model);
        secondCar.drive();
        secondCar.brake();*/

        /*
        Human humanOne = new Human(
                "David",
                31,
                70.5
        );

        Human humanTwo = new Human(
                "Sebastian",
                10,
                40.3
        );
*/
        //humanOne.drink();
        //humanTwo.eat();

       // DiceRoller dice = new DiceRoller();
       // dice.rollWithGlobalVariables();

/*
        Pizza americanPizza = new Pizza(
                "thin",
                "tomato",
                "mozzarella",
                "jam"
        );

        Pizza cheesePizza = new Pizza(
                "thick",
                "tomato",
                "cheese"
        );
*/

        /*
        Food[] refrigerator = new Food[3];
        refrigerator[0] = new Food("milk bottle"
                , 3);
        refrigerator[1] = new Food(
                "hamburguer",
                12
        );
        refrigerator[2] = new Food(
                "lettuce",
                3
        );
*/
        //for (Food food : refrigerator) {
         //   System.out.println(food.name);
        //}


        /*
        Garage garage = new Garage();
        Car car1 = new Car("volvo");
        Car car2 = new Car("tesla");
        Car car3 = new Car("BMW");

        garage.park(car1);
        garage.park(car2);
        garage.park(car3);

         */

        /*
        Friend friend1 = new Friend("Amy");
        Friend friend2 = new Friend("Bob");
        Friend friend3 = new Friend(
                "Goolkuv");
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

         */

        /*
        Bicycle bike = new Bicycle();
        bike.go();
        System.out.println(bike.speed);
        Car car = new Car(
                "Volvo"
        );
        car.stop();
        System.out.println(car.speed);
*/
/*
        Animal animal1 = new Animal();
        animal1.speak();
        Dog dog1 = new Dog();
        dog1.speak();
*/
/*
        Hero batman = new Hero("batman",
                42,
                "money");
        Hero superman = new Hero(
                "Superman",
                9900,
                "strength"
        );
        Person person1 = new Person(
                "David",
                31
        );

        System.out.println(person1.toString());
        System.out.println(batman.toString());
       */

        //Vehicle vehicle = new Vehicle();
       // Car car = new Car("toyota");

        PrivateCar car = new PrivateCar(
                "tesla",
                "v10",
                2021
        );

        System.out.println(car.getMake());
        car.setYear(2022);
        System.out.println(car.year());

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
