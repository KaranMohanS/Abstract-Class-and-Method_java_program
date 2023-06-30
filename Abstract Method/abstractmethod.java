public class abstractmethod {
    public static void main(String[] args) {
        company ob=new company();
        ob.name();
        ob.salary();
        ob.idno();
        ob.phoneno();

    }
    
}
abstract class employe{
    abstract void name();
    abstract void salary();  //declaration 
    abstract void idno();
    void phoneno(){
        System.out.println("9360728854");
    }
}
class company extends employe{
    void name(){  //overriding
    System.out.println("karan"); //definition
    }
    void salary(){ //overriding
        System.out.println("25000");//definition
    }
    void idno(){ //overriding
        System.out.println("103");//defition
    }
}
