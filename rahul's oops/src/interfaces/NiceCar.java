package interfaces;

public class NiceCar {
     Engine engine;
    final Media player;
    public NiceCar(){
        engine = new PowerEngine();
        player = new CdPlayer();
    }
    void startCar(){
        engine.start();
    }
    void stopCar(){
        engine.stop();
    }
    void accelerate(){
        engine.accelerate();
    }
    void startMusic(){
        player.start();
    }
    void stopMusic(){
        player.stop();
    }

    void changeEngine(Engine engine){
        this.engine = engine;
    }
}

/*
* firslty we have created power engine and electric engine class using interface engine
* then we have created music player class using media interface
* then we have used this class inside the nice car class to give functionalities
* */