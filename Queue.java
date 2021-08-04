
//Queue
//Author: Nasim Faridnia
public class Queue {
	public Node front;
	public Node rear;
	public int size ;
	//constructor#1
	public Queue(){
	  this.front=null ;
	  this.rear=null;
	  this.size=0;
	}
	//constructor#2
	public Queue(Node front,Node rear){
	  this.front=front;
	  this.rear=rear;
	  size=2;
	}

	//methods:
	public boolean isEmpty(Queue q){
	  if (front==null) {
	     
	      return true;
	  }
	  return false;
	}
	//
	public void Enqueue(Node x){
		//check to see if queue is empty
	if (isEmpty(this)) {
		this.rear=x;
		this.front=x;
		x.next=null;
	}
	else {
	  this.rear.next=x;
	  this.rear=x;
	  this.size+=1;
	}
	}
	//
	public void Dequeue(){
	//front exits
	  front=front.next;
	}
	public int getSize(){
	  return this.size;
	}

	//print queue
	public void print() {
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
