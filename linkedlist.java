public class linkedlist{
            class Node{
                       
                          int data;
                          Node next;
               Node(int data){
                       this.data=data;
                       this.next=null;
                                 
                             }                                          
            }
            
      public Node head=null;
       public Node tail=null; 
       public Node iterate=null; 
       
          public void  addlist(int data){                                
            Node newnode= new Node(data);
            
               if(head==null){
                    head= newnode;
                    tail=newnode;
               }else{
                  tail.next=newnode;
                  tail=newnode;
               }
                              }
                              
   public void addlist_start(int data) {
                  iterate=head;
        Node newnode=new Node(data);
        head=newnode;
        head.next=iterate;
        iterate=head;                      
                              
                              
                              }                                                    
                              
      public void addlist_anywhere(int position, int data){
     
      iterate=head;
      int count=1;
      Node newnode=new Node(data);
      while(count<position-1){
         iterate=iterate.next;
         count++;
      }
      newnode.next=iterate.next;
      iterate.next=newnode;
 
              }             
                              
                              
                              
   public void  show( ){
                                iterate=head;     
                               
                               if(head==null){
                                   System.out.println("list is empty");
                                   return;
                               }
                               
                System.out.println("nodes are: ")  ;               
              while(iterate!=null){
                                     
                 System.out.println(iterate.data+",  ")  ;                                                             
                                                                                                                                                                
                       iterate=  iterate.next;
                                                                                                                      
                                                                                                                                                                  
                   }              
                                                                                                                                                                                       
                     }        
                     
          public void search(int data){                                                                                                                                                                                                                                    
                               iterate=head;   
                                  int count =0;
                                while(iterate!=null){
                                              
                                                 count++;
                                               if( iterate.data==data){
                                                  
                                                 System.out.println("found at - "+count);
                                                  break;
                                                  }
                                                  iterate=iterate.next;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                         }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                       }    
                                       
            public void deleteAt_end(){
                        iterate = head;
                       while(iterate.next.next!=null){
                       
                    iterate   =iterate.next;
                       }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                     iterate.next=null;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                      tail=iterate;    
                               
                               } 
                               
                                                                                                                                                                                                                         
   public void deleteAt_start(){                                                                                                                                                                                                                                                                                                                                                                                                                
                 iterate =head;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
   head= iterate.next;
   iterate=head;
   
   
   }
   
   public void deleteAt_anywhere(int position){
       iterate=head;
       int count=2;
       while (count<position){
       
       iterate=iterate.next;
       
       count++;
               }
               
               iterate.next=iterate.next.next;
       
   }
   
   public int getSize(){
       iterate=head;
       int count=1;
       while(iterate.next!=null){
           iterate=iterate.next;
           count++;
       }
       return count;
   }
   
   
   
     
             public static void main (String []args){
            
                 
                 linkedlist list=new linkedlist ();
                 list.addlist(1);
                    list.addlist(2);
                    list.addlist(3);
                        list.addlist(4);
                         list.addlist(5);
                         
                         list.addlist(6);
                    list.addlist(7);
                    list.addlist(8);
                        list.addlist(9);
                         list.addlist(10);
                         
                             list.addlist(11);
                    list.addlist(12);
                    list.addlist(13);
                        list.addlist(14);
                         list.addlist(15);
                                list.addlist(16);
                    list.addlist(17);
                    list.addlist(18);
                        list.addlist(19);
                         list.addlist(20);
                       
                       
                       list.show();
                       
                        list.search(1) ;
                        
                       list.deleteAt_end();
                   list.show();
                   System.out.println();                                 
                   System.out.println (list.tail.data);         
                   
                     System.out.println();    
                   list.deleteAt_start();
                       list.show();
                   System.out.println();                                 
                   System.out.println (list.head.data);         
                     System.out.println();    
                   list.deleteAt_anywhere(4);
                   list.show();
                   list.deleteAt_anywhere(5);
                   list.show();
                    System.out.println();    
                   System.out.println( "list size "+ list.getSize());  
                      System.out.println();    
                     list.addlist_start(30);
                      System.out.println();    
                      list.show();
                       System.out.println(   list.head.data);
     list.addlist_start(38);
  list.show();
   System.out.println();    
   list.addlist_anywhere(8,33);
   list.show();
    System.out.println();    
    list.addlist_anywhere(9,66);
    list.show();
                           }     
            
    
}