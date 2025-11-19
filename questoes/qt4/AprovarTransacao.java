package qt4;

public class AprovarTransacao {

    private AbsHandler handler;

    public AprovarTransacao(){
        AbsHandler valor = new Valor();
        AbsHandler geo = new Geolocalizacao();
        AbsHandler hist = new Historico();
        AbsHandler dispositivo = new Dispositivo();

        valor.setNextHandler(geo);
        geo.setNextHandler(hist);
        hist.setNextHandler(dispositivo);

        this.handler = valor;
    }

    public void aprovar(double valor){
        handler.handleRequest(valor);
    }

    
    
}
