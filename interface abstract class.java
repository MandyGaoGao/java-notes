//1st class
//interface class notes
//interface only have constant and abstract method
//abstract class can have (concrete mthod,abstract method,variable and constant)
//an sbstract class may not necessary contains abstract methods
//an abstract clas can be a data type,can also define its constructor
//abstract superclass-concrete subclass1-abstract subclass2 of(subclass1)-concrete sub3 of sub2
//subclass dont need to implements all the abstract methods in superclass
import java.ArrayList;
import java.Collections;

Animal a=new Animal();//this is wrong because abstract class can be data type but not an instance
Animal a=new chicken();


public interface Eatable{
    public static final int k=1;
    //can include final: constant
    public abstract String howToEat(){}
}
public interface cute{
    public abstract String p(){}
}
class Animal {}
class chicken extends Animal implements Eatable,cute{
    @Override
    public String howToEat(){
        return "how to eat";
    }
    public String p(){
        return 'p';
    }
}
//many classes can have same interface. one class can have many interface
class Dog extends Animal{

}
class Chocolate implements Eatable{
    public String howToEat(){
        return "chew";
    }
}
//interface can be a datatype as well
Eatable e=new chicken();
Cute a=new Dog();//this is wrong because dog has not implement Cute()
e.howToEat();

//list in the same idea,implement the generic
List<Integer> a= new List<>();

//comparable interface(alr provided by java system)...like this below:
public interface Comparable<E>{
    public abstract int compareTo(E o);
}//E is for all kinds of datatype/objects

/*......................................... */
public class Rect Extends GeoObject implements Comparable<Rect>{
    //compareTo()
    public int compareTo(Rect r){
        if (this.getArea()>r.getArea()){return 1;}//more than 0
        else if(this.getArea()==r.getArea()){return 0;}//0
        else{return -1;}//sth smaller than 0
        }
}

ArrayList<Rect> l=new ArrayList<>();
l.add(new Rect(10,2));
l.add(new Rect(2,5));
l.add(new Rect(20,1));



Collections.sort(l);//sort based on the Comparable<Rect>,if Comparable not defined, unable to sort these new datatypes
Comparable<Object> a=new Rect();
Comparable<Object> b=new Circle();//this is what happens in collection.sort

System.out.println(l);//this return sort in increasing order of the getArea() of each

a.compareTo(b)// result>0: a bigger than b.....result=0:a equal to b...<0:a smaller than b

//2nd class
//Interface: abstract method,construct
//similar characteristics
//inheritance superclass-subclass relationship a is a type of b;
//specify the characteristics 
Comparable x=l.get(0);
Comparable y=l.get(1);
int compareresult=x.compareTo(y);//not to compare a list of items but items in certain positions

//generic/declared type a =new actual type(args)
Rect k=new Rect();//all
GeoObject k1=new Rect();//only the super class ones
Comparable k2=new Rect();//only compareTo
k2.getArea()//this will not work!!!!
//this is to limit the usage of the methods, to ensure that ur code works for specified function,and will confirm work,static checking

//////////////////////
(interface)(abstract class)
Comparable compareTo
Comparator compare
/*--------------------------------------------integer abs comparator---------------------------------------------------------------*/
import java.util.Comparator;
public class IntegerAbsComp implements Comparator <Integer>{
    //over write compare in comparator
    public int compare(Integer a, Integer b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a>b){return 1;}
        else if (a==b){return 0;}
        else{return -1;}
    }
}

List<Integer> k=new ArrayList<>=()
k.add(100);
k.add(-10);
Collections.sort(w,new IntegerAbsComp());//use the comparator as the standard in collections.sort
//hw set2


//////////////////////////////////////////////////////////////
all calss share same root class: objects
VS interfaces do not share same class
///interface---super interface VS sub-interface, inheritance
