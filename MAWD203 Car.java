Here is the code for car.java
  public class Car {

    public static final String MAKE = "Toyota";
    public static int numCars = 0;

    private String chassisNo;
    private String model;

    public Car(String model) {
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("Car manufactured");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    @Override
    public String toString() {
        return "The car is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }
}

here is the code for TestCar.java
  public class TestCar {
    public static void main(String[] args) {

        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);


        Car car1 = new Car("Camry");
        System.out.println(car1);


        Car car2 = new Car("Veloz");
        System.out.println(car2);


        System.out.println("Number of cars manufactured: " + Car.numCars);
    }
}
