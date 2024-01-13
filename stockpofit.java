import java.util.Scanner;

class profit{
      int max,min;

    int position(int arr[], int val,int n)
    {


        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == val) {
                return i;


            }
        }
        return -1;
    }






    void maxmin(int a[], int size)
    {
        int i=0;
        int pos;
        int j;

        for (i=0;i<=size;i++)
        {


            min=a[0];

            if (a[i]<min)
                min=a[i];



        }
        i=position(a,min,size);
        for (j=i;j<size;j++)
        {   max=a[j];
            if (a[j]>max);
            {
                max=a[j];
            }

        }
        j=position(a,max,size);


        System.out.println("the profit is");
        System.out.println("the day is "+ i+"and "+ j);
        System.out.println("the profit");
        System.out.println(max-min);

    }




}
  public class stockpofit {

    public static void main(String[] args) {

        System.out.println("------------------------ stock profit---------------------");
        profit p=new profit();
        int [] array=new int[4];
        Scanner inp=new Scanner(System.in);
        int k;
        System.out.println("enter tge array");
        for (k=0;k<4;k++)
        {
            array[k]=inp.nextInt();

        }
      p.maxmin(array,4);
    }

}
