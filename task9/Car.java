package task9;

public class Car {

    String carName;

    Car(String carName) {
        this.carName = carName;
    }

   public class Engine { 

        String engineType;

        Engine(String engineType) {
            this.engineType = engineType;
        }

        void display() {
            System.out.println("Car name:"+carName); 
            System.out.println("Engine type:"+engineType);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("bmw");
        Car.Engine engine = car.new Engine("Petrol"); // inner object creation
        engine.display();
    }
}