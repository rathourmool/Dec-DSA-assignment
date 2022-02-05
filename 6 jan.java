//Q.remove adjacent character from string
const removeDuplicates = str => {
    let lastChar = str[0];
    let finalT = str[0];
    for (const char of str.slice(1)) {
      if (lastChar !== char) finalT += char;
      lastChar = char;
    }
    return finalT;
  };
  console.log(removeDuplicates('jjjavvvaaassscript'));



//Q.Reverse only words in string 

function reverse(str) 
{ 
    // get size of string 
    let n = (str).length;
    let i; 
    let arr = str.split('');
    for (i = 0; i < n/2; i++)
    {
        let temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }
    return arr.join('');
} 

// Driver program to test above functions 
let str = "abc"; 
str = reverse(str); 
console.log("Reversed string is-> " +str); 


// "1. Create a myStack Class which has the following methods:
//      1. Push(x) : inserts the data into the stack 
//      2. Pop(): Removes the top element.
//      3. Peek() : Displays the top element.
// Performs Postfix Evaluation on a given exp


// Javascript program to Implement a stack
// using singly linked list
// import package

// A linked list node

// Javascript program to Implement a stack
// using singly linked list
// import package

// A linked list node
class Node
{
	constructor()
	{
		this.data=0;
		this.link=null;
	}
}

// Create Stack Using Linked list
class StackUsingLinkedlist
{
	constructor()
	{
		this.top=null;
	}
	
	// Utility function to add an element x in the stack
	push(x)
	{
		// create new node temp and allocate memory
		let temp = new Node();

		// check if stack (heap) is full. Then inserting an
		// element would lead to stack overflow
		if (temp == null) {
			console.log("Heap Overflow");
			return;
		}

		// initialize data into temp data field
		temp.data = x;

		// put top reference into temp link
		temp.link = this.top;

		// update top reference
		this.top = temp;
	}
	
	// Utility function to check if the stack is empty or not
	isEmpty()
	{
		return this.top == null;
	}
	
	// Utility function to return top element in a stack
	peek()
	{
		// check for empty stack
		if (!this.isEmpty()) {
			return this.top.data;
		}
		else {
			console.log("Stack is empty");
			return -1;
		}
	}
	
	// Utility function to pop top element from the stack
	pop() // remove at the beginning
	{
		// check for stack underflow
		if (this.top == null) {
			console.log("Stack Underflow");
			return;
		}

		// update the top pointer to point to the next node
		this.top = this.top.link;
	}
	
	display()
	{
		// check for stack underflow
		if (this.top == null) {
			console.log("Stack Underflow");
			
		}
		else {
			let temp = this.top;
			while (temp != null) {

				// print node data
				console.log(temp.data+"->");

				// assign temp link to temp
				temp = temp.link;
			}
		}
	}
}

// main class

// create Object of Implementing class
let obj = new StackUsingLinkedlist();
// insert Stack value
obj.push(11);
obj.push(22);
obj.push(33);
obj.push(44);

// print Stack elements
obj.display();

// print Top element of Stack
console.log("Top element is ", obj.peek());

// Delete top element of Stack
obj.pop();
obj.pop();

// print Stack elements
obj.display();

// print Top element of Stack
console.log("Top element is ", obj.peek());

// This code is contributed by rag2127
