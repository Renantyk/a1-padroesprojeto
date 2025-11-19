package qt1;

public class RelatorioTeste1 extends RelatorioDecorator{

    public RelatorioTeste1(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public String gerar(){
        return relatorio.gerar() + "teste1";
    }
    
}
