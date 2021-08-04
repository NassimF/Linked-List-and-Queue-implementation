/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class test {
    public static void main(String[] args) {
        SingleLinkedList l=new SingleLinkedList();
  Node n1=new Node(5) ;
  l.addfirst(n1);
  Node n2=new Node(7);
  l.addlast(n2);
  Node n3 = new Node(10);
  l.addlast(n3);
  l.print();

  //delete 7
  //first find where 7 is
  Node x =l.search(7);
  l.delete(n3);
  l.print();

  //find size
System.out.print("size is=");
System.out.print(l.getsize());

//delete the first entity
Node temp=l.head;
l.delete(temp);
l.print();

//print list
l.print();
    }
    
}
