package pk;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

class Dynamic{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    int arr[];
    int size = 0;
    int count = 0;

    void increase(){
        if(size == 0){
            arr = new int[1];
        }
        else{
            int[] temp = new int[size+1];
            for(int i=0; i<size; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
        size++;
    }
    void add(int element){
        increase();
        arr[size-1] = element;
    }

    void sort(){
        Arrays.sort(arr);
    }
    void add(int index, int element){
        if(index>size){
            String s = size+" is the size of the array";
            LOGGER.info(s);
        }
        else{
            increase();
            for(int i=size-1; i>index; i--){
                arr[i] = arr[i-1];
            }
            arr[index] = element;
        }
        
    }
    void remove(){
        int[] temp = new int[size-1];
        for(int i=0; i<size-1; i++){
            temp[i] = arr[i];
        } 
        arr = temp;
        size--;
    }

    void remove(int element){
        for(int i=0; i<size; i++){
            if(arr[i] == element){
                for(int j=i; j<size-1; j++){
                    arr[j] = arr[j+1];
                }
            }
        }
        remove();
    }
    void print(){
        for(int i=0; i<size; i++){
            LOGGER.info(arr[i]);
        }
    }

}


public class Array {
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main(String[] args){
        Dynamic array = new Dynamic();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            LOGGER.info("1.Add 2.Remove. 3.exit");
            int m = sc.nextInt();
            if(m == 1){
                LOGGER.info("Enter element to insert: ");
                int element  = sc.nextInt();
                LOGGER.info("1.Add at last 2.add at index");
                int ch = sc.nextInt();
                if(ch == 1){
                    array.add(element);
                }
                else if(ch == 2){
                    LOGGER.info("Enter index to insert: ");
                    int index = sc.nextInt();
                    array.add(index, element);
                }
            }
            else if(m == 2){
                LOGGER.info("1.Remove at last 2.search element and remove");
                int ch = sc.nextInt();
                if(ch == 1){
                    array.remove();
                }
                else if(ch == 2){
                    LOGGER.info("Enter element to remove: ");
                    int index = sc.nextInt();
                    array.remove(index);
                }
            }
            else if(m ==3){
                n=1;
            }
        }while(n == 0);
        
    }
}
