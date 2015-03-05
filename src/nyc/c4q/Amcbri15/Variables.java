package nyc.c4q.Amcbri15;

/**
 * Created by c4q-anthony-mcbride on 3/3/15.
 */
public class Variables {
    public static void main(String[] args) {

        //"int whatever" is called a variable declaration (You've declared your variable by pointing the type to something)

        //int favNum = 9;
        //char letter = '1';
        //String letters = "One";

        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        //declares the cars variable equal to 100
        cars = 100;
        //declares the space in each car
        space_in_a_car = 4;
        //declares number of drivers
        drivers = 30;
        //declares number of passengers
        passengers = 90;
        //calculates number of cars not driven
        cars_not_driven = cars - drivers;
        //number of cars currently being driven
        cars_driven = drivers;
        //calculates carpool capacity
        carpool_capacity = cars_driven * space_in_a_car;
        //calculates average passengers per car after being distributed among the drivers
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );


        //System.out.println("My favorite number is " + favNum);
        //System.out.println("My favorite number is " + 9);


    }
}
