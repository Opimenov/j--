public interface Car {
    //    public class engine { ; }
    //    public interface check { ; }
    void run() {} //this must not be here
      ; //adding semi otherwise parser recovers too late
}

final interface OperateCarBadly extends Car { //final shouldn't be here'
    int crash(int intoWhat) throws ; //no qualifiedIdentifier
}

public interface BadInterface {
    int plate; // this should fail    
}


