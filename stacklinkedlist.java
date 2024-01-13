class node{
    int data;
    node link;


    node(int data)
    {
        this.data=data;
        this.link=null;


    }

}

class Stack{
    node top;

    Stack()
    {
        this.top=null;


    }

    public void push( int data)
    {
        node n=new node(0);
        n.data=data;
        n.link=top;
        top=n;



    }
   public void pop()
   {
       if(top==null)
       {
           System.out.println("the linked list stack is empty you cant pop");
       }
       else {
           System.out.println("the poped value is" + top.data);
           top=top.link;
       }



   }
  public int peek()
  {
      return top.data;

  }


  public void display(){
        node temp=top;
        while (temp.link!=null)
        {
            System.out.println("the stack value is "+ temp.data);
            temp=temp.link;
            System.out.println();

        }


  }

}
public class stacklinkedlist {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.pop();
        s.display();
        System.out.println("the peeked value is " + s.peek());
    }
}
