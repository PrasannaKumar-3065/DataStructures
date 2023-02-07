package pk;
import java.util.*;

abstract class calculator{
    int value;
    abstract int calculate(int a, int b);
    int getValue(){
        return this.value;
    }
}

class add extends calculator{
    int calculate(int a, int b){
        return a+b;
    }
}

class sub extends calculator{
    int calculate(int a, int b){
        return a-b;
    }
}

class mul extends calculator{
    int calculate(int a, int b){
        return a*b;
    }
}

class div extends calculator{
    int calculate(int a, int b){
        return a/b;
    }
}

public class CalculatorDs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    }
}
