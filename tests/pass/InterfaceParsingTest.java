public interface Car {
    //    public class engine { ; }
    //    public interface check { ; }
    int plate = 123;
    String made = "Honda";
}
abstract interface OperateCar extends Car{
    int turn(int dir, int radius) throws IOException ;
    int drive(String carName, int key) throws IOException, SomeBadException;
    int stop(int howFast);
}

interface OperateCarBadly extends OperateCar {
    int crash(int intoWhat);
}
interface OperateCarNicely extends OperateCar {
    void avoidCollisions(String carName);
}

public class InterfaceParsingTest implements OperateCar {
    
}
