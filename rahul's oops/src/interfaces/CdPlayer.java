package interfaces;

public class CdPlayer implements Media{

    @Override
    public void start() {
        System.out.println("I start music like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop music like a normal car");
    }
}
