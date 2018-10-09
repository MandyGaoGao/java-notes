public class 

interface Interface_1_1{
    int p1();
}

interface Interface_1_2{
    int p2();
}
//one interface can be extented from multiple super-interfaces
interface Interface_1 extends Interface_1_1,Interface_1_2{
    int p3();

}


// Interface_1 inheirted all the interface 1-1 1-2, all the abstract methods under the two super interface could be used
class class_1 implements Interface_1{
    public int p1(){return 0;}
    public int p2(){return 0;}
    public int p3(){return 0;}
}

abstract class class_1

class class_2 extends class_1 implements Interface_1;
//super interface-sub interface-abstarct super class-sub concrete class