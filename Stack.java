import java.util.*;
public class  Stack{
	public  int top=-1, size=0;
	int arr[];
	Scanner sc= new  Scanner (System.in);           //scanner is in stack class make obj to access in main method 
		
	 
	 
	 	public void createStack(int n){
            arr=new int[n ];
	        size=n;                  // n is local so making size value of stack as global  'size' variable
	 	    	System.out.println("enter  stack elements");
			for(int i=0; i<n; i++){
				top++;                // increment top as input goes on
				arr[top]=sc.nextInt();
				
	
			}
	 	}
	 	
	 	
	 	
	public  void push(int data){
	    
	
	    if(top>=(size-1)){       // last index  of stack is 4 as it starts with 0
	        System.out.println("stack is full ");
	        
	        }else{
	            top++;
	            arr[top]=data;
	            System.out.println("sucess");                 
	        }
	    
	}
	public  int  pop(){
	    int item=0;
	    if (top<=-1){              // if top is below 0 index in array stack
	        
	        System.out.println(" stack is empty");                 
	        
	        
	    }else{
	        item=arr[top];
	        top--;
	        
	    }
	    
	    
	    return item;           // returning to call function 
	}
	
	public int peek(){
	    int item=0;
	    if(top<=-1){
	        System.out.println("stack empty");       
	    }else{
	        item = arr[top];       
	    }
	    
	    
	    return item;       //returning top value of stack
	}
	
	public  void traverse(){
	    for(int i=top;i>=0;i--){                        // iterate from top nth value to bottom 0th value of stack
	        System.out.println(arr[i]+" , ");
	        
	    }
	    
	}
	public  int size(){
	    int i;
	    for(i=0;i<=top;i++);           // iterate i value upto top value index  for size
	   
	       
	    return i;
	}
	
	
	
	
	
	public static void main(String[] args) {                                      
Stack Stk=new Stack();               // create obj of class Stack to access it's methods and variables else static - non static error
				int n=0;          // size of stack array
				int ch=-1;      // choice
				System.out.println("enter size of stack");
				n=Stk.sc.nextInt();         // scanner is in stack class using obj to access it
				Stk.createStack(n);       //accessing create stack method in class stack 
				
				do{
				    System.out.println("enter the choice");
				    System.out.println("1. push");
				    System.out.println("2. pop");
				    System.out.println("3. peek");
				    System.out.println("4. traverse");
				    System.out.println("5. size");
				    
				    System.out.println("enter 0 for exit");
				    	
				    ch=Stk.sc.nextInt();
				    int a=0;
				switch (ch){
				    case 0: System.out.println("exiting");
				                  break;
				    case 1: System.out.println("enter value: ");
				                  a=Stk.sc.nextInt();
		    	                  Stk.push(a);
		    	                  break;
				    case 2: System.out.println(" value poped "+ Stk.pop());
				                  break;
				                
				    case 3: System.out.println("peek value "+Stk.peek());                    
				                 break;
				    case 4:System.out.println("elements in stack are: ");
	                              Stk.traverse();
	                              break;
				    case 5: System.out.println("size of stack "+Stk.size());
				                   break;
				    default : System.out.println("invalid choice");
				                   break;
			    	}
				}while (ch!=0);           // choice not equal 0 iterate continually 

	}
				
}