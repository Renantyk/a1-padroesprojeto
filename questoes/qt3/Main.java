package qt3;

public class Main {
    public static void main(String[] args) {
        Sensor observado = new Sensor();
        ConcreteObserver temp = new ConcreteObserver(observado);
        ConcreteObserver umidade = new ConcreteObserver(observado);
        ConcreteObserver poluicao = new ConcreteObserver(observado);

        System.out.println("Antes de atualizar o estado");
        observado.setPoluicao(10);
        observado.setTemperatura(10);
        observado.setUmidade(10);

        
    }
    
}
