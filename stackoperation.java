
class stack{

    private  int [] a;
    private int top;
    private int max;

    stack( int n)
    {
        max=n;
        a=new int[max];
        top=-1;
    }
    public void push(int data)
    {
        if(top>max-1)
        {
            System.out.println("stack is overflowing ");

        }

        else
        {

            a[++top]=data;
        }




    }

    public void pop()
    {

        if (top<0)
        {
            System.out.println("your stack is empty");

         }
        else {

            top--;
        }



}
     public int peek()
     {
        return a[top];

     }

     public void display()
     {
         int i=0;
         for(i=top;i>=0;i--)
         {
             System.out.println("the stack value are "+  a[i]);

         }


     }
}
public class stackoperation {

    public static void main(String[] args) {
        stack s=new stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();// 10 20 30
        s.pop();//30 poped
        s.pop();//20 poped
        s.display();//10 displayed
        System.out.println("the last peeked value is " + s.peek());//10 displayed
    }

}
