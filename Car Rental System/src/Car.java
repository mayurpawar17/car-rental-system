public class Car {
   private String carId;
    private String model;
    private String brand;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String model, String brand, double basePricePerDay, boolean isAvailable) {
        this.carId = carId;
        this.model = model;
        this.brand = brand;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getBasePricePerDay() {
        return basePricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

   public double calculatePrice(int rentalDays){
        return basePricePerDay*rentalDays;
   }

   public void rent(){
        isAvailable=false;
   }

   public void returnCar(){
        isAvailable=true;
   }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carModel='" + model + '\'' +
                ", carBrand='" + brand + '\'' +
                ", basePricePerDay=" + basePricePerDay +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
