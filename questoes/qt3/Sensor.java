package qt3;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Observer> observers = new ArrayList();
    private int temperatura;
    private int umidade;
    private int poluicao;

    public int getTemperatura() {
        return temperatura;
    }

    public int getUmidade() {
        return umidade;
    }

    public int getPoluicao() {
        return poluicao;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        notifyAllObservers();
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
        notifyAllObservers();
    }

    public void setPoluicao(int poluicao) {
        this.poluicao = poluicao;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
}
