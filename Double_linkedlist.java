import java.util.*;


public class Double_list {
	
          class Node{                   //create node class with prev and next node datatypes variables                
              Node prev;                 //holds node class reference and its variables
              int ndata;                   // linked list data to hold
              Node next;
              
                   public Node(int data)  {                 // constructor of node class for loading data while creating object                                this.prev=null;
                                this.ndata= data;
                             this.next= null;
                                            
                   }      
          }
	
	Node head=null;              //create three variables to hold node object reference 
	Node tail=null;
	Node iterate=null;
	
	
	public void Create_node(int data){                     //create node at end
	   Node newnode= new Node(data);  
	        if(head==null){                                //on first node in list hold newnode reference in head
	          head= newnode;	
	          tail=newnode;
	                                                                                                    
	        }else{                                  // if node is not first in list
	           
	            tail.next=newnode;
	            newnode.prev=tail;
	            tail=newnode;
	           System.out.println("sucess") ;
	        }
	}
	
	public void CreateAt_start(int value){               //insert  node at first of the list
	    
	      
	      Node newnode=new Node(value);
	      newnode.next=head;
	      newnode.prev=null;
	      head.prev=newnode;
	      head=newnode;
	     System.out.println("sucess") ;
	  
	}
	
	
		public void CreateAt_anywhere(int pos,int value){              //insert node at any given index
	    int size =Sizeof_list();
	    int count=1;
	   if( count==pos  ){                             //if insert pos is at first of list simply run create at start method
	    CreateAt_start(value);
	     System.out.println("sucess") ;
	  
	   }else if( pos>size){                         //if insert pos is greater than size of list (end of list ) simply run create node method
	    Create_node(value);
	     System.out.println("sucess") ;
	  
	   }else{                                                    //if insert pos is  between first and last
	    iterate=head;
	    while (  iterate.next!=null  ){             //move iterate  to given pos index
	         
	         iterate= iterate.next;
	         count++;
	         if(count==pos){                                                      
	             break;      
	         }     
	    }
	    Node newnode=new Node(value);        // create new node
	     
	    newnode.prev= iterate.prev;
	    iterate.prev.next=newnode;
	     
	     newnode.next=iterate;
	     iterate.prev= newnode;
	      
	      System.out.println("sucess") ;
	  
	     
	   }
	    
	}
	
	public void deleteAt_start(){            //delete node at. start of list
	    
	    head=head.next;
	    head.prev=null;
	    
	     System.out.println("sucess") ;
	  
	}
	
	
		public void deleteAt_end(){               //delete node at end of list
	    
	    tail=tail.prev;
	    tail.next=null;
	    
	     System.out.println("sucess") ;
	  
	}
	
	
		public void deleteAt_anywhere(int pos){                    //delete node at given pos index
	    
	      int size =Sizeof_list();
	    int count=1;
	   if( count==pos  ){                           //if delete at start of list simply run delete at start method
	    deleteAt_start();
	     System.out.println("sucess") ;
	  
	   }else if( pos==size){                      //if delete is end of list simply run delete at end method
	    deleteAt_end();
	     System.out.println("sucess") ;
	  
	   }else{                      // if delete is between start and end of list
	    iterate=head;
	    while (  iterate.next!=null  ){                        //move iterate at given pos index
	         
	         iterate= iterate.next;
	         count++;
	         if(count==pos){                                                      
	             break;      
	         }     
	    }
	   
	   iterate.prev.next=iterate.next;
	   iterate.next.prev=iterate.prev.next;
	    iterate=iterate.prev; 
	    System.out.println("sucess") ;
	  
	   }
	    
	    
	    
	}
	
	
	
	public void traverse_start ( ){                         //travels forward from start of list
	    
	    iterate=head;
	    
	    while(iterate!=null){
	        
	        System.out.println(iterate.ndata+" ,");
	        iterate=iterate.next;
	    }
	    
	     System.out.println("sucess") ;
	  
	    
	}
	
		public void traverse_end ( ){                 //travels backwards from end of list
	    
	    iterate=tail;
	    
	    while(iterate!=null){
	        
	        System.out.println(iterate.ndata+" ,");
	        iterate=iterate.prev;
	    }
	     System.out.println("sucess") ;
	  
	}
	
	public void Search_list( int value){               //search given value in a list
	int size=Sizeof_list();                         
	    int  c1=1,c2=size, mid=(size/2);               //create size, count and mid variables
       iterate=head;            
	   Node iterate2=tail;                                    //create another iterate2 variable at tail
	     
	    while( c1<=mid ){                        //loop until the middle of the list
	        
	    
	        if( iterate.ndata==value){                          //check iterate value equal to given value from both sides of the list until middle of the list
	            
	            System.out.println("found at :"+c1);   
	             System.out.println("sucess") ;
	                           
	            break;
	        }
	          if(iterate2.ndata==value){
	           System.out.println("found at "+ c2);
	            System.out.println("sucess") ;
	  
	           break;
	            
	        }
	       
	         iterate=iterate.next;               //move iterate  and count variables
	        iterate2=iterate2.prev;
	        c1++;
	        c2--;
	        
	    }
	            	
	}
		
		public int Sizeof_list( ){                      //check size with count variable
	    
	    iterate=head;
	    int count=1;
	    while(iterate.next!=null){
	  
	        iterate=iterate.next;
	        count++;
	    }
	    
	    return count;
	}
	

	public static void main(String[] args) {
	
		Double_list  D_list=new Double_list();      // take obj of class to access it's methods and variables 
                Scanner sc=new Scanner(System.in);
				
				int ch=-1;              // choice variable 
	
		    
		    do{
				      System.out.println();
				      
				    System.out.println("enter the choice");
				    System.out.println("1. add list at end");
				    System.out.println("2. add list at start");
				    System.out.println("3. add list at anywhere");
				    System.out.println("4. delete list at end");
				    System.out.println("5. delete list at start");
				    System.out.println("6. delete list at anywhere");
				    System.out.println("7. traverse list from start");
				    System.out.println("8. traverse list from end");
		            System.out.println("9. search item in list");
				    System.out.println("10. size of list");
				    
				    System.out.println("0. ---enter 0 for exit-----");
				    int value, pos;	      //data and position variables
				    
			       System.out.println();                   
				    ch=sc.nextInt();                  //read choice 
				    
				    
				switch (ch){
				    case 0: System.out.println("x-!!!!---exited---!!!!-x");
				                  break;
				    case 1: System.out.println("enter value to add at end: ");
				                  value=sc.nextInt();
		    	                  D_list.Create_node(value);
		    	                  break;
				    case 2: System.out.println(" enter value to add at start ");
				                  value=sc.nextInt();
				                  D_list.CreateAt_start(value);                                                
				                   break;
				                
				    case 3:  System.out.println(" enter position index and  value to add at any index starting from 1");
				                   pos= sc.nextInt();
				                   value=sc.nextInt();
				                    D_list.CreateAt_anywhere(pos,value) ;
				                   break;
				    case 4:  D_list.deleteAt_end();
	                              break;
				    case 5: D_list.deleteAt_start();
				                  break;
				                
				    case 6: System.out.println("enter position index to delete starting from 1 ");
				                  pos= sc.nextInt();
				                  D_list.deleteAt_anywhere(pos);           
				                 break;
				    case 7: System.out.println("elements in list from start are :");
				                  D_list.traverse_start();
	                              break;
	                case 8: System.out.println("elements in list from end are:");
	                              D_list.traverse_end();
	                              break;              
				    case 9: System.out.println("enter value to search");
				                  value=sc.nextInt();
				                  D_list.Search_list(value);
				                   break;  
				    case 10: System.out.println("size of list:  " + D_list.Sizeof_list());
				                   break;                               
				    default : System.out.println("invalid choice");
				                   break;
			    	}
				}while (ch!=0);         //loop  until choice not equals to zero, exit on zero 
		    
		    
		    
		    
		    
		    
		
		
		

		sc.close();              //close scanner for memory leak error
       }
}
