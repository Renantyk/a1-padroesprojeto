package qt4;

public class Geolocalizacao extends AbsHandler{

    @Override
    public void handleRequest(double geo) {
        if(this.canHandle(geo)){
            System.out.println("Verificacao autorizada para a geolocalizacao");
        }else{
            nextHandler.handleRequest(geo);
        }
    }

    private boolean canHandle(double geo){
        return (geo <= 100);
    }
    
}
