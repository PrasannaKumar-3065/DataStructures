package pk;
import java.util.*;
import java.util.logging.Logger;

public class Ds {
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            LOGGER.info("1.LinkedList 2.Array");
            int choice = sc.nextInt();
            if(choice == 1){
                List l = new List();
                l.accessList();
            }
            else if(choice == 2){
                Array arr = new Array();
                arr.accessArray();
            }
        }while(n == 0);
        

    }
}
