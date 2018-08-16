import java.util.Arrays;
 
interface list{
	int get(int a);
	void add(int a);
	int remove(int a);
	int size();
	void increaseListSize();
	
}
//Class arraylist
public class ArrayList2 implements list {
 
    private int[] myStore;
    private int actSize = 0;
     
    public arraylist2(){
        myStore = new int[10];
    }
     
    public int get(int index){
        if(index < actSize){
            return myStore[index];
        } 
	else{
		throw new ArrayIndexOutOfBoundsException();
	} 
    }
     
    public void add(int obj){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }
     
    public int remove(int index){
        if(index < actSize){
            int obj = myStore[index];
            myStore[index] = -1;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = -1;
                tmp++;
            }
            actSize--;
            return obj;
        }else{
		throw new ArrayIndexOutOfBoundsException();
	} 
    }
     
    public int size(){
        return actSize;
    }
     
    public void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
     
    public static void main(String a[]){
        arraylist2 mal = new arraylist2();
        mal.add(2);
        mal.add(5);
        mal.add(1);
        mal.add(5);
        mal.add(16);
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(3);
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
	
    }
}





















//get remove
