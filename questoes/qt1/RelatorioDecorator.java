package qt1;

public class RelatorioDecorator implements Relatorio{

    protected Relatorio relatorio;

    public RelatorioDecorator(Relatorio relatorio){
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return relatorio.gerar();
    }
    
}
