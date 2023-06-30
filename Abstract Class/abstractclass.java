public class abstractclass {
    public static void main(String[] args) {
        son obj=new son();
        obj.name1();
        obj.name();
        obj.age();  
        obj.address();
        obj.phoneno();
    }
    
    

}
abstract class father{
    void name(){
        System.out.println("SO - sivasamy");
    }
    void age(){
        System.out.println("age - 54");
    }
    void address(){
        System.out.println("add - sirumugai");
    }
    void phoneno(){
        System.out.println("phoneno - 9360728854");
    }
}
class son extends father{
    void name1(){
        System.out.println("my name - karan");
    }
}