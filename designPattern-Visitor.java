//why observer
//reduce coupling
//visitor harder
//for dataprocessing one/more operations on a set of objects
//e.eg total cost of postages--diff type items(diff single price) to diff places
1st method:pass all data from diff items to same operation
2nd method:processing(operation) goes to diff cd book1 book2 (items,visit one item by item) 
//visitor design pattern/////////////////
visotor
visitable
concretevisitor
item1
item2
//----------------------------
visitor(interface)//operations,one specific operation for each item, like visitor1-book;visitor2-item2
    visit(book a)//package of method
    visit(CD b)
    visit(clothing c)

    e.g. 
packageCalculator(concrete class)//to implement visitor interface
    visit(book a){concrete method}
//----------------------
visitable(interface)//enable an item to be processed by visitor
    accept(visitor)
book(concrete class)//implemets visitable-item1
    weight(data field)
    accept(visitor k)//implement the abstract class from interface
        k.visit(this)//after accpet--be processed by visitor
cd(concrete class)//implement visitable-item2
    artist
    accept(visitor k)
        k.visit(this)
////////////////////////////////////////////////////
public interface Visitable{
    void accept(visitor v);
}
class book implements Visitable {
    private double weight;
    public void accept(visiotr v){
        v.visit(this);
    }
}
class CD implements Visitable {
    private double size;
    public void accept(visiotr v){
        v.visit(this);
    }
}
//--------------------------
public interface visitor{
    void visit();
}
public class PstageCalculator implements visitor{
    private double totalPostage=0;
    public void visit(Book b){
        totalPostage+=b.getsWeight()*20;
    }
    public void visit(CD c){
        totalPostage+=1000;
    }
    public void visit(clothing c){
        totalPostage+=c.getSize()*10;
    }
    public double getTotalPostage(){
        return totalPostage;
    }
}

/////////////////diff type of calculating-name visitor interface -diff concrete class of viistor///////////////////
public class PostageCal2 implements visiotr{
    private double totalPostage=0;
    public void visit(Book b){
        totalPostage+=b.getsWeight()*200;
    }
    public void visit(CD c){
        totalPostage+=10;
    }
    public void visit(clothing c){
        totalPostage+=c.getSize()*1;
    }
    public double getTotalPostage(){
        return totalPostage;
    }

}


public class MyClass{
    public static void main(String[] args) {
        ArrayList<Visitable> l=new ArrayList<>();
        PostageCal v=new PostageCal();
        PostageCal2 v2=new PostageCal();
        l.add(new book(2));
        l.add(new CD('man'));
        l.add(new book(10));

        for (Visitable item:l){
            item.accept(v);
        }
        System.out.println(v.getTotalPostage();
        )

        for (Visitable item:l){
            item.accept(v2);
        }
        System.out.println(v.getTotalPostage();
        )
       
        
    }




