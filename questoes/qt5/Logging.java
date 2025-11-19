package qt5;

public class Logging {

    private static Logging instancia;
    private String mensagem = "";

    private Logging(String mensagem){
        this.mensagem = mensagem;
    }

    public static Logging getInstance(String mensagem){
        if(instancia==null){
            instancia = new Logging(mensagem);
        }

        return instancia;
    }

    public String getMensagem(){
        return this.mensagem;
    }
    
}
