package com.moulik.dsa.queue;

/**
 * 	A Queue is a linear DS which models real world queues by having 2 primary operations: enqueue and dequeue.
 * 
 * 		Dequeue
 * 			<--	node1 ----- node2 ----- node3 ----- node4 <--
 * 															Enqueue
 * 
 * 				queueFront							queueBack
 * 
 * 	Enqueue = Adding  = Offering
 * 	Dequeue = Polling = Removing
 * 
 * When and where are Queues used?
 * 1. Any waiting line models a queue, eg, a line up at a movie theatre or a restaurant
 * 2. Can be used to efficiently keep track of x most recently added elements.
 * 3. Web server request management where you want first-come-first-serve.
 * 4. Breadth-First Search Graph traversal
 * 
 * Complexity:
 * 		Enqueue		O(1)
 * 		Dequeue		O(1)
 * 		Peeking		O(1)
 * 		Searching	O(n)
 * 		Removal 	O(n)
 * 		isEmpty		O(1)
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		
	}

}
