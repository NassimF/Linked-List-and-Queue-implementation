//Author: Nasim Faridnia
public class Node {
	public int data;
	public Node next;

	public Node(){
	  this.data=0;
	  this.next=null;
	}
	public Node(int data,Node next){
	  this.data=data;
	  this.next=next;
	}
	public Node(int data){
	  this.data=data;
	  this.next=null;
	}
	public int getData(){
	  return this.data;
	}

	public Node getnext(){
	  return this.next;
	}

	public void setdata(int k){
	  this.data=k;
	}
	public void setnext(Node next){
	  this.next=next;
	}
}
