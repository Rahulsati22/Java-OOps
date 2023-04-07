package interfaces;

public class electricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start like a normal electric engine car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal electric engine car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal electric engine car");
    }
}
