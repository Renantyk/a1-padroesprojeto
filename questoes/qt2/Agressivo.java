package qt2;

public class Agressivo implements State{
    private Perfil perfil;

    public Agressivo(Perfil perfil){
        this.perfil = perfil;
    }


    @Override
    public void formula() {
        System.out.println("Formula Agressiva");
    }

    @Override
    public void peso() {
        System.out.println("Peso nao para perfil Agressivo");
        perfil.setState(new Conservador(perfil));
    }

    @Override
    public void criterios() {
        System.out.println("Criterios para perfil agressivo");
    }
    
}

