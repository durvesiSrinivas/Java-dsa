import java.util.*;

public class linkedlist{
            static int countNode=0;
             Scanner sc=new Scanner(System.in);
		
            class Node{                   // create node class to make objects
                       
                          int data;
                          Node next;
                          
               Node(int data){           // create constructor to insert data and next in node while creating new node
                       this.data=data;
                       this.next=null;
                           countNode++;      //count length of list
                             }                                          
            }
            
      public Node head=null;             //start fixed variable
       public Node tail=null;               // end fixed variable 
       public Node iterate=null;           // moving variable 
       
          public void  addlist(int data){                                
            Node newnode= new Node(data);      //create obj and insert data and next to null
            
               if(head==null){                               // check if head is null
                    head= newnode;
                    tail=newnode;
                    
               }else{
                  tail.next=newnode;
                  tail=newnode;
                  tail.next=head;                 //connect last node with starting node
                  
               }
            System.out.println("inserted at end successfully");
                              }
                              
   public void addlist_start(int data) {
                  iterate=head;
        Node newnode=new Node(data);
        head=newnode;
        head.next=iterate;
        iterate=head;                      
         tail.next=head;               //connect last node to starting new node
                      System.out.println("inserted at start successfully");
                             
                              }                                                    
                              
      public void addlist_anywhere(int position, int data){
     
      iterate=head;
      int count=1;
      Node newnode=new Node(data);
      while(count<position-1){               // move iterate variable upto position - 1 index ex 6-1 = 5, count<5 =4                      
         iterate=iterate.next;                        
         count++;                             
      }
      newnode.next=iterate.next;               //store address of new node of  previous note
      iterate.next=newnode;
      
      
     System.out.println("inserted at pos successfully");
                 
              }             
                              
                              
                              
   public void  traverse( ){
                                iterate=head;     // bring iterate variable to starting of list
                               int count=0;
                               if(head==null){
                                   System.out.println("list is empty");
                                   return;
                               }
                               
                System.out.println("nodes are: ")  ;               
              while( count !=countNode){                   //loop until length of the node.
                           count++;          
                 System.out.println(iterate.data+",  ")  ;                                                             
                                                                                                                                                       
                       iterate=  iterate.next;                        // move iterate from one node to another
                     
                                                                                                                                                                                                                                                                                                                                                                                                                                    
                   }              
                                                                                                                                                                                       
                     }        
                     
                     
      public void  traverse_circle( ){
                                iterate=head;     // bring iterate variable to starting of list
                               int count=0;
                               char pause;
                               if(head==null){
                                   System.out.println("list is empty");
                                   return;
                               }
                               
                System.out.println("nodes are: ")  ;               
              while( iterate.next!=null){                      //loop forever because null does not exist in next
                          
                 System.out.println(iterate.data+",  ")  ;                                                             
                          if(iterate==tail){                                     //if iterate reaches the length of the list count laps
                           count++;    
            System.out.println("laps completed: "+count)  ;                                                             
             
                           }                                                                                                                                  
                       iterate=  iterate.next;                        // move iterate from one node to another
                  
                            System.out.println("enter any char to continue, press 0 to exit ") ;                                                             
            
                           pause  =  sc.next().charAt(0) ;          //read any character to pause the loop
                           if(pause=='0'){                               //if character input 0 exit the loop
                               break;
              }                                                                                                                                                                                                                                                                                                                                                                                                      
                   }              
                                                                                                                                                                                       
                     }        
                                     
                     
                     
                     
                     
                     
                     
                     
          public void search(int data){                                                                                                                                                                                                                                    
                               iterate=head;   
                                  int count =0;
                                while(count!=countNode){              // iterate until length of the list
                                              
                                                 count++;
                                               if( iterate.data==data){
                                                  
                                                 System.out.println("found "+ data +" at - "+count);
                                                  break;
                                                  }
                                                  iterate=iterate.next;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                         }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                       }    
                                       
            public void deleteAt_end(){
                        iterate = head;
                        int count =1;
                       while(count<countNode-1){            //loop untill last second node
                          count++;
                    iterate   =iterate.next;
                 
                       }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                     iterate.next=head;                       // make last second node.next to null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                      tail=iterate;   
                      
                         countNode--;     //decrease one length of the list because one node is  deleted
                               
              System.out.println("deleted at end successfully");
                   
                               } 
                               
                                                                                                                                                                                                                         
   public void deleteAt_start(){                                                                                                                                                                                                                                                                                                                                                                                                                
                 iterate =head;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
   head= iterate.next;                       // make 2nd node to head
   iterate=head;
   tail.next=head;
   countNode--;                       //decrease one length of the note 
       System.out.println("deleted at start successfully");
                 
   }
   
   public void deleteAt_anywhere(int position){
       int s=getSize();              // get size of list
       if(position>s){               //check if given pos is > size of list
           
           System.out.println("pos is greater than size of list");
           return;                         //  stop function by giving return 
           
       }else if(position==1){
           deleteAt_start();            // if it's 1 run delete at start method
           return ;
       }else if(position==s){          // if it's last node run delete at end 
           deleteAt_end();
           return;
       }
       
       iterate=head;                     // else now delete node by connecting before and after nodes of position node
      
      int count=1;
      
      
      
       while (count<position-1){                  // itereate upto before node of position node
       
       iterate=iterate.next;
       
       count++;
               }
        iterate.next=iterate.next.next;          // connect before and after nodes of pos node
      
           countNode--;                 //decrease one length of the node
       
           
      System.out.println("deleted node successfully");
                          
   }
   
   public int getSize(){
       
       return countNode;                     //return  length of list
   }
   
   
   
     
             public static void main (String []args){
      
                 linkedlist list=new linkedlist ();       // take obj of class to access it's methods and variables 
                Scanner sc=new Scanner(System.in);
				int ch=-1;      // choice
				
				do{
				      System.out.println();
				       System.out.println();
			
			
				    System.out.println("enter the choice");
				    System.out.println("1. add list at end");
				    System.out.println("2. add list at start");
				    System.out.println("3. add list at anywhere");
				    System.out.println("4. delete list at end");
				    System.out.println("5. delete list at start");
				    System.out.println("6. delete list at anywhere");
				    System.out.println("7. traverse list");
				    System.out.println("8. traverse circle");
			
				    System.out.println("9. search item in list");
				    System.out.println("10. size of list");
				    
				    System.out.println("0. ---enter 0 for exit-----");
				    int value, pos;	      //data and position variables
				    System.out.println();
			                          
				    ch=sc.nextInt();
				    
				switch (ch){
				    case 0: System.out.println("x-!!!!---exited---!!!!-x");
				                  break;
				    case 1: System.out.println("enter value to add at end: ");
				                  value=sc.nextInt();
		    	                  list.addlist(value);
		    	                  break;
				    case 2: System.out.println(" enter value to add at start ");
				                  value=sc.nextInt();
                                  list.addlist_start(value);
				                   break;
				                
				    case 3:  System.out.println(" enter position index and  value to add at any index starting from 1");
				                   pos= sc.nextInt();
				                   value=sc.nextInt();
				                   list.addlist_anywhere(pos,value) ;       
				                   break;
				    case 4:  list.deleteAt_end();
	                              break;
				    case 5: list.deleteAt_start();
				                  break;
				                
				    case 6: System.out.println("enter position index to delete starting from 1 ");
				                  pos= sc.nextInt();
				                  list.deleteAt_anywhere(pos);                 
				                 break;
				    case 7: list.traverse();
	                              break;
	                    
	                case 8: list.traverse_circle();
	                              break; 
	                 
				    case 9: System.out.println("enter value to search");
				                  value=sc.nextInt();
				                  list.search(value);
				                   break;  
				    case 10: System.out.println("size of list "+list.getSize() );
				                   break;                               
				    default : System.out.println("invalid choice");
				                   break;
			    	}
				}while (ch!=0);           //  if choice not equal 0 iterate continually 

                 
                    sc.close();                 //scanner is active close at end of program to stop memory leak error 
            
               
                           }     
            
        
}