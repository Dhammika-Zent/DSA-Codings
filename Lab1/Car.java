public class Car {
    public String brand;
    public String transmission;
    

    public Car(String brand, String transmission) {
        this.brand = brand;
        this.transmission = transmission;
    }

    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Transmission: " + transmission);
    }
    
}
