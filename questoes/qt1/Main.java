package qt1;

public class Main {
    public static void main(String[] args) {
        Relatorio relatorio1 = new RelatorioDiario();
        Relatorio relatorio2 = new RelatorioSemanal();
        System.out.println(relatorio1.gerar());
        System.out.println(relatorio2.gerar());

        System.out.println("Gerando outros relatorios");

        relatorio1 = new RelatorioTeste1(relatorio1);
        System.out.println(relatorio1.gerar());

        relatorio2 = new RelatorioTeste1(relatorio2);
        System.out.println(relatorio2.gerar());
    }
    
}
