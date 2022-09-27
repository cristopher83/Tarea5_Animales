public class Pato extends Animal implements AnimalQueCamina,AnimalQueNada,AnimalQueVuela{
    public String toString(){
        return "Pato";
    }
    //Contract methods
    public void nadar(){}
    public void caminar(){}
    public void volar(){}
}
