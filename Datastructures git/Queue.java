import java.util.*;
class Queue{
	int a[]=new int[3];
	int front=0;
	int rear=-1;
	int MAX_SIZE=3;
	public void insert(int item){
		if(rear>=MAX_SIZE-1){
			System.out.println("queue full");
		}
		else{
			a[++rear]=item;	
		}
	}
	public void delete(){
		if(front>rear){
			System.out.println("queue empty");
		}
		else{
			int b=a[front++];	
		}
	}
	public void display(){
		for(int i=front;i<=rear;i++){
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String args[]){
		queue q=new queue();
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.display();
		q.insert(6);
		q.display();
		q.delete();
		q.display();
	}
}
