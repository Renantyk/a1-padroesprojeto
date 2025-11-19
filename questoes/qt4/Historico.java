package qt4;

public class Historico extends AbsHandler{

    @Override
    public void handleRequest(double hist) {
        if(this.canHandle(hist)){
            System.out.println("Verificacao autorizada para o historico");
        }else{
            nextHandler.handleRequest(hist);
        }
    }

    private boolean canHandle(double hist){
        return (hist <= 1000);
    }
    
}
