
package pkg1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number - "+biggerNumber(2,6,1)+" is bigger");
        
    }
    public static int biggerNumber(int number1, int number2, int number3){
        if (number1 > number2 && number1>number3) {
        return(number1);
        }
        if (number2> number1&&number2>number3) {
            return(number2);
        }
        else {
        return(number3);    
        }
    }
    
}
