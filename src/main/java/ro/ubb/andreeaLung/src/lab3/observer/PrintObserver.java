package lab3.observer;

public class PrintObserver implements Observer {
    @Override
    public void update() {
        System.out.println("----------- New attack!! ----------");
    }
}
