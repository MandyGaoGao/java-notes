//2D design a software using recurssion
//handle exception or the program terminates abnoramlly e.g. mod zero
//Exceptions are objects
//root class is throwable
//checked exception:compileer will tell( enforced try-catch) VS unchecked runtime error
//put error( and its subclasses),runtime error in try-and-catch
//one try---many catches
import java.util.*;
class Exception{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("input 1:");
            int num1=input.nextInt();
            System.out.println("input 2:");
            int num2=input.nextInt();
            double re=Mycompute(num1,num2);
            System.out.println("result"+re);
           
        }
    }
    public static int Mycompute2(int i,int j) throws FileNotFoundException){
        try{Scanner scfile =new Scanner (new File("hello.txt"));}//to check unchecked runtime error
        catch (FileNotFoundException ex){return -100086;}

    public static int Mycompute(int i,int j){
        try{int result =i/j;
            return result;

        }
        catch(ArithmeticException ex){
            System.out.println("error");
            return -1000;
        }
        catch(RuntimeException ex){
            System.out.println("error2");
            return -741;
        }//dunt put superclass(Runtime) of exception above subclass(Arith)
        //because error is catched, subclass catch will not happen
        finally{System.out.println("end operations");}//statement will always be executed,clean up the system
    }
}

//either method handles excpetion itself, or caller handles

