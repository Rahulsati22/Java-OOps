package interfaces;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.start();
        toyota.accelerate();
        toyota.brake();
        toyota.stop();

        System.out.println();


        Engine eng = new Car();
        eng.start();
        eng.stop();
        eng.accelerate();

        Media carMedia = new Car();

        carMedia.start();
        carMedia.stop();

        /*
        * I start engine like a normal car
        * I stop engine like a normal car
        * we don't want this output for our car media so how can we fix it
        */
        electricEngine engine = new electricEngine();
        NiceCar newCar = new NiceCar();
        newCar.startCar();
        newCar.stopCar();
        newCar.startMusic();
        newCar.stopMusic();
        newCar.accelerate();
        newCar.changeEngine(engine);
        newCar.startCar();
        newCar.stopCar();
        newCar.startMusic();
        newCar.stopMusic();
        newCar.accelerate();
    }
 }
