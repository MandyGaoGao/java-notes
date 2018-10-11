import java.util.ArrayList;

//one that calls itself
//simpler solution to some problems that are difficult to solve by loops
//base case
//recursive step
class mathop{
    public static int factorial(int n){
        if (n==0){return 1;}
        else{
            return n*factorial(n-1);
        }//keeps calling until the base case
    }
//identify the sub-problems: same problem but smaller in size///
//palindrome--hui wen shu abba(yes)  abcd///////////////////
    public static boolean palindrome(String a){
            
            if(a.length()==2 && a.charAt(0)==a.charAt(1)){
                return true;
            }
            else if(a.length()==1){
                return true;
            }
            else{
                if(a.charAt(0)==a.charAt(a.length()-1)){
                    return palindrome(a.substring(1,a.length()-1));
                }
                else{
                    return false;
                }
            }
            
    }
}


public class Recursion{
    public static void main(String[] args) {
        String a="abcba";
        String b="aaabb";
        String c="aaacbbb";
        ArrayList<String> l=new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        for (String i:l){
            System.out.println(mathop.palindrome(i));   
        }
    }
}
