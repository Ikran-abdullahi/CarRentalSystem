public class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    public static final String companyName = "JUST Rentals";
    public static int totalCars = 0;

    public Car() {
        plateNumber = "Unknown";
        carModel = "Unknown";
        dailyRate = 0.0;
        rent = false;

        totalCars++;
    }

    public Car(String plateNumber, String model, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = model;
        this.dailyRate = dailyRate >= 0 ? dailyRate : 0.0;

        rent = false;

        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rent;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setModel(String model) {
        this.carModel = model;
    }

    public void setDailyRate(double rate) {
        this.dailyRate = rate >= 0 ? rate : this.dailyRate;
    }

    public void setRented(boolean rent) {
        this.rent = rent;
    }

    public void rent() {

        System.out.println(
                rent
                        ? "Sorry, " + carModel + " (" + plateNumber + ") is already rented."
                        : carModel + " (" + plateNumber + ") has been rented successfully."
        );

        rent = true;
    }
    public void returnCar() {

        System.out.println(
                rent
                        ? carModel + " (" + plateNumber + ") has been returned."
                        : carModel + " (" + plateNumber + ") was not rented."
        );

        rent = false;
    }



    public void displayInfo() {

        System.out.println("Plate Number : " + plateNumber);
        System.out.println("Model        : " + carModel);
        System.out.println("Daily Rate   : $" + dailyRate);
        System.out.println("Status       : " + (rent ? "Rented" : "Available"));
        System.out.println();
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }


    public static void displayTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }



    public static void main(String[] args) {

        System.out.println("Creating cars:");

        Car car1 = new Car("A-1001", "Toyota Corolla", 40.0);
        Car car2 = new Car();

        System.out.println("car1 and car2 created.");
        System.out.println();



        Car.displayCompanyName();

        System.out.println();



        System.out.println("Car information:");

        car1.displayInfo();
        car2.displayInfo();


        System.out.println("Getters:");

        System.out.println("car1 plate: " + car1.getPlateNumber());
        System.out.println("car1 model: " + car1.getModel());
        System.out.println("car1 rate : $" + car1.getDailyRate());
        System.out.println("car1 rented? " + car1.isRented());

        System.out.println();



        System.out.println("Renting cars:");

        car1.rent();
        car1.rent();

        System.out.println();



        System.out.println("Changing daily rate:");

        car2.setDailyRate(55.5);
        car2.setDailyRate(-20);

        car1.setDailyRate(45.0);

        car1.displayInfo();
        car2.displayInfo();



        System.out.println("Returning a car:");

        car1.returnCar();
        car1.returnCar();

        car1.displayInfo();



        Car.displayTotalCars();
    }
}
