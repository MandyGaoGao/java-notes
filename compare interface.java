import java.util.*;
// import java.ArrayList;
// import java.Collections;

//comparator: a class seperate form the class of object we use
//comparable: a method implemented on the class of the object---like giving an characteristics to the object

class OctSideComp implements Comparator <Octagon>{
    //over write compare in comparator
    public int compare(Octagon a, Octagon b){
        double sidea=a.getSide();
        double sideb=a.getSide();
        if(sidea>sideb){return 1;}
        else if (sidea==sideb){return 0;}
        else{return -1;}
    }
}

class Octagon implements Comparable<Octagon> {
    private double side;
    // public static void main(String[] args) {
    //     System.out.println( (new Octagon(5)).getSide());
    // }
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public int compareTo(Octagon r){
                if (this.getSide()>r.getSide()){return 1;}//more than 0
                else if(this.getSide()==r.getSide()){return 0;}//0
                else{return -1;}//sth smaller than 0
                }

}
public class compare{
    public static void main(String[] args){
        ArrayList<Octagon> l=new ArrayList<>();
            l.add(new Octagon(10));
            l.add(new Octagon(2));
            l.add(new Octagon (20));

            Collections.sort(l,new OctSideComp());
            System.out.println(l);
            System.out.println(l.get(0).compareTo(l.get(1)));
    }
}

// public class Rect Extends GeoObject implements Comparable<Rect>{
//     //compareTo()
//     public int compareTo(Rect r){
//         if (this.getArea()>r.getArea()){return 1;}//more than 0
//         else if(this.getArea()==r.getArea()){return 0;}//0
//         else{return -1;}//sth smaller than 0
//         }
// }