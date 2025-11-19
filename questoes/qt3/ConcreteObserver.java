package qt3;

public class ConcreteObserver extends Observer{

    public ConcreteObserver(Sensor sensor){
        this.sensor = sensor;
        this.sensor.attach(this);
    }

    @Override
    public void update() {
        System.out.println("O observer recebeu uma att. Nova temperatura: " + sensor.getTemperatura());
        System.out.println("O observer recebeu uma att. Nova poluicao: " + sensor.getPoluicao());
        System.out.println("O observer recebeu uma att. Nova umidade: " + sensor.getUmidade());
    }
}
