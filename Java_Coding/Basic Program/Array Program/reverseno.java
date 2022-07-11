public class reverseno
{
static void number(int a[], int n)
{
int[] b=new int[n];
int j=n;
for(int i=0;i<n;i++)
{
b[j-1]=a[i];
j=j-1;

}

for(int k=0;k<n;k++)
{
System.out.print(b[k]);
}
}
public static void main(String[] ar)
{
    int[] arr0={1,2,3,4,5};
int[] arr={4,3,2,1,5};
int[] arr1={3,2,1,5,4};
int[] arr2={2,1,5,4,3};
int[] arr3={1,5,4,3,2};
int[] arr4={5,4,3,2,1};

number(arr0, arr0.length);
System.out.println("_______");
number(arr, arr.length);
System.out.println();
number(arr1, arr.length);
System.out.println();
number(arr2, arr.length);
System.out.println();
number(arr3, arr.length);
System.out.println();
number(arr4, arr.length);




}
}
