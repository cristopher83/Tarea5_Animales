import java.util.HashMap;

public class Halcon extends Animal implements AnimalQueVuela {
    //String Method with Polymorphism
    public String toString(){
        return "Halcon";
    }
    //Contract method
    public void volar(){}
}
