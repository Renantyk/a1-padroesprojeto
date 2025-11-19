package qt4;

public class Consumidor {
    public static void main(String[] args) {
        AprovarTransacao aprovar = new AprovarTransacao();

        aprovar.aprovar(10);
        aprovar.aprovar(100);
        aprovar.aprovar(1000);
        aprovar.aprovar(10000);
    }
    
}
