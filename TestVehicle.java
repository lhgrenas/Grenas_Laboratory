import java.util.Scanner;

class Vehicle {
    private String brand;
    private double speed;
    private String fuelType;

    public Vehicle(String brand, double speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, double speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private String hasSideCar;

    public Motorcycle(String brand, double speed, String fuelType, String hasSideCar) {
        super(brand, speed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Side Car: " + hasSideCar);
    }
}

class TestVehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the details of the car.");
        System.out.println("Brand: ");
        String carBrand = input.nextLine();
        System.out.println("Speed: ");
        double carSpeed = input.nextDouble();
        System.out.println("Fuel Type: ");
        String carFuelType = input.nextLine();
        input.nextLine();
        System.out.println("Number of Doors: ");
        int numDoors = input.nextInt();
        
        
        input.nextLine();
        System.out.println("Enter the details of the motorcycle.");
        System.out.println("Brand: ");
        String motorBrand = input.nextLine();
        System.out.println("Speed: ");
        double motorSpeed = input.nextDouble();
        System.out.println("Fuel Type: ");
        String motorFuelType = input.nextLine();
        input.nextLine();
        System.out.println("Has a Side Car? ");
        String hasSideCar = input.nextLine();

        Car car = new Car(carBrand, carSpeed, carFuelType, numDoors);
        System.out.println("\nDetails of Car:");
        car.displayInfo();
        Motorcycle motor = new Motorcycle(motorBrand, motorSpeed, motorFuelType, hasSideCar);
        System.out.println("\nDetails of the Motorcycle:");
        motor.displayInfo();

        System.out.println();

        input.close();
    }
}