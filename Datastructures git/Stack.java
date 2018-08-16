class Stack{
	int a[]=new int[10];
	int top=-1;
	static final int MAX_SIZE=2;
	public void push(int b){
		if(top>=MAX_SIZE){
			System.out.println("stack full");
		}
		else{
			a[++top]=b;
		}
	}
	public void pop(){
		if(top==-1){
			System.out.println("stack empty");
		}
		else{
			int c=a[top--];
		}
	}
	public static void main(String args[]){
		Stack s=new Stack();
		s.push(3);
		s.push(6);
		s.push(6);
		s.push(7);
		s.pop();
	
	}
}
	
