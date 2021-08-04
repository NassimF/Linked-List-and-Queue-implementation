# Linked-List-and-Queue-implementation
A simple implementation of a Single Linked List and a Queue in Java
## Node
Nodes are the building blocks of both Linked List and Queue.

They have a 'data' and a 'next' property.

Three constructors are included in the file 'Node.java'; One is for when only data is given, one for when both data and the next node are given, and one with no input arguments.

The methods 'getData' and 'setData' are used for getting and setting the node data respectively. 'getNext' and 'setNext' have the same functionality for the 'next' property of the node.


## Single Linked List
A Single Linked List only includes a 'head' and not a 'rear' node. Therefore, there's a one-way connection between the nodes.

There are various methods included in the 'Single Linked List' file such as:

* A method for finding and returning a node with a particular data.
* A method for adding a node as the 'head'.
* A method that adds a new node as the last one in the list.
* A method that adds the new node after a particular node in the list
* A method that can delete a certain node.
* A 'print' method.
* And lastly, a method for returning the list size.

** The file 'test.java' involves an example of how all these methods work.

## Queue
* A queue is like a list that follows the FIFO(First In, First Out) rule.

* It includes two nodes that point to the front and rear of the queue.

* Two different constructors exist for this data structure in the file 'Queue.java'.

* The method 'isEmpty' checks to see if the queue is empty.

* 'Enqueue' adds a new node to the end of the queue.

* On the other hand, 'Dequeue' removes the front node.

* Finally, the size of the queue can be retrieved using the 'getSize' method.

** The example of how all these work can be found in 'implementation.java'

