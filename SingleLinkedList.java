/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class SingleLinkedList {
     Node head;
int size=0;
//constructor
public SingleLinkedList(){
    this.head=null;
    this.size=0;
}
//
public Node search(int k){
  Node x=this.head;
  while((x.next!=null) && (x.data!=k)){
    x=x.next;
  }
  return x;
}
//
public void addfirst(Node x){
  x.next=this.head;
  head=x;
  this.size+=1;
}
//
public void addlast(Node x){
Node temp =head;
while(temp.next!=null){
  temp=temp.next;
}
temp.next=x;
x.next=null;
this.size+=1;  
}

//
//add x after y
public void addafter(Node y,Node x){
x.next=y.next;
y.next=x;
this.size+=1;
}
//
public void delete(Node x){
//delete x
//first search for the entity before x
Node temp=this.head;
try{
while(temp.next  !=null){
    if(head==x)
        head=x.next;
    if(temp.next==x){
        temp.next=x.next;
        
    }
    
  temp=temp.next;
}
}catch(Exception e){
    //TODO
}
  
  this.size-=1;
}
//
public void print(){
Node temp=head;
System.out.println("list is:");
  while(temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
  }
}
public int getsize(){
  return this.size;
}
    
}
