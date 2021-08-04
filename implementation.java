//Author: Nasim Faridnia
public class implementation {
	 public static void main(String[] args) {
		  Queue q=new Queue();
		  // a queue of 1 to 10
		  for( int i=1;i<=10;i++){
		  
		   q.Enqueue(new Node(i));
		  // System.out.println("now is:");//**
		   //q.print();//**
		   }
		  
		  //print queue
		   q.print();
		   //add11
		   q.Enqueue(new Node(11));
		   //print new queue
		   System.out.println("new queue is:");
		   q.print();
		   //delete 1
		   q.Dequeue();
		   //print new queue
		   System.out.println("new queue is:");
		   q.print();
		  }
}
