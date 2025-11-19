package qt2;

public class Perfil {
    private State state;

    public Perfil(){
        this.state = new Conservador(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public void formula(){
        state.formula();
    }

    public void peso(){
        state.peso();
    }

    public void criterios(){
        state.criterios();
    }
    
}
