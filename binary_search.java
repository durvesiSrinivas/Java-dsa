import java.util.*;

public class Binary_search {
	
	
	
	public static void main(String[] args) {     
	                            
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n = sc.nextInt();                  // size of array
		int []arr= new int[n];
		
		System.out.println("enter elements of array: ");
	
		for(int i =0; i<n; i++){
		    arr[i]=sc.nextInt();                    // taking elements of array
		}
	
		System.out.println("enter element to find: ");
	int value = sc.nextInt();
				
	int lb=0,    ub=n-1  , mid=0;                     // initialise middle , lower boundary and upper boundry
		
	while (lb<=ub){                     //loop until lower and upper does not pass each other    
		
			mid=(lb +ub)/2;                     // set mid in between lb and ub
			if(arr[mid]==value){                         // check if value at mid index is equal to searching value 
	System.out.println("element found at index: "+mid  );                    
				   break;                                        // if element found exit
			  }else if( arr[mid]<value  ){                  //if mid index value is less than searching value
				         lb=mid +1;                            //search element from next of mid index.                                               
				                                                 // set lb after index mid index
				             
		      }  else{                                 //mid index values greater than searching value
				                    
				         ub=mid -1;            //search element from before of mid index
				    }                                 //set ub before mid index
				
					
			}	
		
		
		
		
		
		sc.close();                    //close scanner to stop memory leak error
	}
}