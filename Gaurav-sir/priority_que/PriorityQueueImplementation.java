import java.math.*;
interface IntegerComparitor{
    boolean compare(int a , int b);
}
class PriorityQueue{

    private Integer arr[];
    private Integer n = 1;
    private Integer capacity = 0;
    private IntegerComparitor cmp_fnc;
    public PriorityQueue(Integer size , IntegerComparitor cmp_fnc){
        arr = new Integer[size+1];
        this.capacity = size+1;
        this.cmp_fnc = cmp_fnc;
    }
    public Boolean isEmpty(){
        return n == 1 ;
    }
    public void add(Integer value){
        if(n == capacity) return;
        arr[n] = value;
        Integer k = n;
        while(k>1 && cmp_fnc.compare(arr[k/2], arr[k])){
            swap(k/2 , k , arr);
            k = k/2;
        }
        n++;
    }
    public void swap(int i , int j  , Integer arr[]){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
    public Integer pop(){
        if(n == 1) return -1;
        n--;
        Integer ans = arr[1];
        arr[1] = arr[n];
        arr[n] = null;
        
        Integer k = 1;
        while( k < capacity && arr[k]!=null){
            int j = 2*k;
            
            if(j>=capacity || arr[j] == null) break;
            if(j+1<capacity && arr[j+1]!=null && cmp_fnc.compare(arr[j] , arr[j+1])) j++;
            if( cmp_fnc.compare(arr[j], arr[k])) break;
            
            swap(k , j , arr );
            k = j;
            
        }
        return ans;

    }
}
public class PriorityQueueImplementation {
    public static int getRandomInteger(int max , int min ){
        return (int) ((Math.random()*(max-min)) + min);
    }
    public static void main(String[] args) {
       PriorityQueue pr = new PriorityQueue(20 , (a,b)->a<b);
        for(int i = 0 ; i <20 ; i++){
            pr.add(getRandomInteger(0 , 10));
        }
        while(!pr.isEmpty()){
            System.out.print( pr.pop()+" ");
        }
    }
}