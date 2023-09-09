import java.util.Scanner;
class minmax
{
	void divide(int a[],int start,int end)
	{
		if(start==end)
		{
			min=a[start];
			max=a[start];
		}
		else
		{
			int m1,m2;
			mid=(start+end)/2;
			divide(a,start,mid)
			m1=min;
			m2=max;
			divide(a,mid+1,end)
				if(m1<min)
				m1=min;
				if(m2>max)
				m2=max;
		}
		System.out.println("Minimum value in the given Array elements is:"+min);		System.out.println("Maximum value in the given Array elements is:"+max);
	}
}
class Dd
{
	public static void main(String y[])
	{
		Scanner s=new Scanner(System.in);
		minmax mm=new minmax();
		int a[]=new int[50];
		System.out.println("Enter the Total:");
		int n=s.nextInt();
		System.out.println("Enter the Array elements:");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		mm.divide(a,0,n-1);
	}
}