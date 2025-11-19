package qt4;

public class Valor extends AbsHandler{

    @Override
    public void handleRequest(double valor) {
        if(this.canHandle(valor)){
            System.out.println("Verificacao autorizada para o valor");
        }else{
            nextHandler.handleRequest(valor);
        }
    }

    private boolean canHandle(double valor){
        return (valor <= 10);
    }

    
}
