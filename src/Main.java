import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*

            Class / Object
            - A data type that defines a set of
            variables and methods for a declared object
            - A blueprint or template that defines the data
            behavior for a type

                Type - class name
                Properties - variables
                Behavior - methods

            Generating Methods
                - Right-click --> Generate --> Getter and Setter -->
                  Select all variables in list --> Click OK

            Encapsulation
                - Organization of code
                - Controls how data is accessed

                1) public - can be accessed from anywhere within your
                program scope
                2) private - can only be accessed within the class
                3) protected - can be accessed within the class and all subclasses

                Constructors - methods that are the same name as the class, needed
                to create an object of that class type
                Default constructors - no parameters

         */

        // Instantiation - declaring an object of a class type
        Car car1 = new Car();
            // Type: Car
            // Object name: car1

        car1.setColor("red");
        car1.setModel("Honda");

        // Overloaded constructor
        Car car3 = new Car("Mazda", "silver");

        String color = car1.getColor(); // return "red"
        String model = car1.getModel();

        System.out.println(color);
        System.out.println(model);

        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        System.out.println(input);

        Car car2 = new Car();
        car2.setColor("blue");
        car2.setModel("Toyota");

    }
}
