//mock 9oct 10-1030am tmr after cs.TT24/25
//2 NOv 2-4 the tuesday after recess week(Friday)(w1 to w6 materials)
//(2d might be covered in midterm)
//hw ps-2 due:31/Oct
// 1D by Wed
// Next week Tuesday:presentation of ideas--10 min (5min presentation, 5min qand A feedbacks)


// interface I1 extends I1_1,I1_2{

// }
// class c1 implements I1{}//it takes all the abstrcact methods under I1,I1-1,I1_2
// class c2 extends c1{} implements T2-2// 
Circle c1=new Circle();
Circle c2=new Circle();

diff software caretes same instance--refer to the same instance--thus can complie in the centralized log file
how to design software so that one signle class is created
ensure a class has only one instance and can provide a global point of access to interface


class Logfile{
    private static int count=0;
    Logfile(){
        count++;
        if (count>1){}//detection:more than one instance created!
    }//keep track of the instance created
}

public class Singleton{
    private static Singleton instance=null;
    private Singleton(){}//not accessible from outside
    public static Singleton getInstance(){
        if (instance==null;){instance=new Singleton();}
        return instance;
    }
}
/*---------------create only one instance--------------------------- */

public class LogFile{
    private LogFile instance=null;//default: no instances created
    private LogFile(){}//disable constructor
    public static LogFile getInstance(){
        if(instance==null){instance=new LogFile();}
        return instance;
    }
}

public class MyClass{
    public static void main(String[] agrs){
        LogFile a=LogFile.getInstance();
        LogFile b=LogFile.getInstance();
        System.out.println(a);
        System.out.println(b);
        //a and b return to the same address,refer to same instance
    }
}
/*---------------observer design pattern--------------------------- */
//all observers be notified if anything of the subject(publisher) has changed,e.g. stock watcher
//coupling(subject and observer)
//one object to many dependents
//a behavioural pattern at execution running time
subject(interface)
    register(observer)
    un-re (observer)
    notify(observer)

observer (interface)
    update()//this is up to observer to decide whether to be notified,and handle updates//can be in subject too

Concretesubject(class) //this is implement subject interface
    observerList(list) //keep track of registered observers
    notifyObservers(){for(observer o:observerList){
        o.update();// update for all the observers
            }
        }

ConcreteObserver(class)//to implement the Observer
    ConcreteObserver(Subjects){}//arg: Subject is teh argument for seeting which is the oberserve watching, sub in ****constructor***
    Subject.register(this)//put this to the observer list of this subject

//................................................................
import jav.until.ArrayList;
public interface Subject{
    void register(Observer o);
    void unregister(Observer o);

}
public class Topic implements Subject{
    private ArrayList<Observer> observerList=null;
    public Topic(){
        observerList=new ArrayList<Observer>();
    }
    public void register(observer o){
        observerList.add(o);
    }
    public void unregister(observer o){
        observerList.remove(o);
    }
    public void notifyObservers(){
        for(Observer o:observerList){
            o.update(this.message);
        }
    }
    public void addMessage(String msg){
        this.message=msg;
        notifyObservers();
    }
}
//..............................................
public interface Observer{
    void update();

}
public class Subscriber implements Observer{   
    private String id;
    private Subject s;
    public Subscriber(Subject s, String id){
        this.id=id;
        this.s=s;
        s.register(this);
    }
    public void update(String msg){
        System.out.println(this.id+'receive this message:'+msg);
    }
}
//----------------------------------------------------
public class MyClass {
    public static void main(STring[] args){
        Subject topic50001=new Topic();
        Subscriber  man=new sub (topic50001,'man');
        Subscriber norman=new Subscriber(topic50001,'norman');
        topic50001.addMessage('mocttest');
    }
}




