package qt2;

public class Moderado implements State{
    private Perfil perfil;

    public Moderado(Perfil perfil){
        this.perfil = perfil;
    }

    @Override
    public void formula() {
        System.out.println("Formula Moderada");
    }

    @Override
    public void peso() {
        System.out.println("Peso moderado");
    }

    @Override
    public void criterios() {
        System.out.println("Criterios nao para perfil conservador");
        perfil.setState(new Agressivo(perfil));
    }
    
}
    
