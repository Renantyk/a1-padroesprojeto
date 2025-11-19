package qt2;

public class Conservador implements State {
    private Perfil perfil;

    public Conservador(Perfil perfil){
        this.perfil = perfil;
    }


    @Override
    public void formula() {
        System.out.println("Formula conservadora");
    }

    @Override
    public void peso() {
        System.out.println("Peso nao para perfil conservador");
        perfil.setState(new Moderado(perfil));
    }

    @Override
    public void criterios() {
        System.out.println("Criterios nao para perfil conservador");
        perfil.setState(new Moderado(perfil));
    }
    
}
