package qt4;

public class Dispositivo extends AbsHandler{

    @Override
    public void handleRequest(double valor) {
        System.out.println("Verificacao autorizada para o dispositivo");
    }

    private boolean canHandle(double valor){
        return true;
    }
    
}
