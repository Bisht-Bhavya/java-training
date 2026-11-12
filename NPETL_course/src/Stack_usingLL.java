public class Stack_usingLL <T> {
JLinkedList<T> top;
int l;
Stack_usingLL(){
    top = new JLinkedList<T>();
    l = 0;
}

void push(T a){
    l += 1;
    this.top.insertFront(a);
}

T pop(){
    T a = null;
    if(!isempty()){
        l -= 1;
        top.deleteFront();
    }else{
        System.out.println("Stack Underflow");
    }
   return a;
}

public boolean isempty(){
        if(this.top == null){
            return true;
        }else{
            return false;
        }
    }

void printstack(){
    if(isempty()){
        System.out.println("Stack is Empty");
    }else{
        this.top.printlist();
    }
}

}

class StackImplementation{
    public static void main(String[]args){
        Stack_usingLL<Integer> stack = new Stack_usingLL<Integer>();
        stack.push(20);
        stack.push(34);
        stack.push(534);
        stack.push(65);
        stack.push(74);
        stack.printstack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printstack();
    }
}

