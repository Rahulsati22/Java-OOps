package interfaces;

public interface Engine {
//    cannot do this because final and static variables are present inside this interfaces
//    int a;
    int val = 10;
    void start();
    void stop();
    void accelerate();
}
