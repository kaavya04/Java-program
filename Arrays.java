// ----------------Arrays with methods--------------------//


// to add a prime number present inside the array//

import java.util.*;
import java.util.Arrays;
class Prime
{
	public static void main(String[] args) 
	{
		int []a={4,5,6,7,8,9,10,11};
		System.out.println(Arrays.toString(a));
		int res=addprime(a);
		System.out.println(res);
	}
	
	public static int addprime(int [] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if (isprime(a[i]))
			{
				System.out.println(a[i]);
				sum+=a[i];
			}
		}
		return sum;
	}
	public static boolean isprime(int number)
	{
		if(number==0 || number==1)
		{
			return false;
		}
		for (int i=2;i<number ;i++ )
			
		
		{
			if(number%i==0)
			return false;
		}
		return true;

	}
}


 // Missing numbers in the given arrays in natural no series //
class Missing
{
	public static void main(String [] args)
	{
		int []a={1,3,4,5,9};
		System.out.println(Arrays.toString(a));
		missnum(a);
		
	}
	public static void missnum(int [] a)
	{
		int j=1;
		for (int i=0;i<a.length ; i++,j++)
		{
			if(a[i]!=j)
			{
				System.out.print(j+" ");
				i--;
			}
			
		}
	
	}
}

// decrement of arrays //
class sum
{
	public static void main(String [] args)
	{
		int [] a={1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(i);
		}
	}
}


//add a2 arryas first array in incremrnt order 2nd array in decrement order //
class Incdecarray
{
	public static void main(String [] args)
	{
		int []a={10,20,30,40};
		System.out.println(Arrays.toString(a));
		int []b={50,60,70,80};
		System.out.println(Arrays.toString(b));
		int [] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		int j=a.length;
		for(int i=b.length-1;i>=0;i--)
			{
			c[j]=b[i];
			j++;
			}
		System.out.println(Arrays.toString(c));
			
	}
	
}



// add the 2 array zigzag manner //
class Zigzag
{
	public static void main(String [] args)
	{
		int []a={10,20,30,40};
		System.out.println(Arrays.toString(a));
		int []b={50,60,70,80};
		System.out.println(Arrays.toString(b));
		zigzag(a,b);
		System.out.println(Arrays.toString(zigzag(a,b)));
	}
	public static int[] zigzag(int [] a,int []b)
	{
		int [] c=new int[a.length+b.length];
		
		for(int i=0,x=0,y=0;i<c.length;i++)	
		{
			if(i%2==0)
				c[i]=a[x++];
			else
				c[i]=b[y++];
		}
		return c;
	}
}

// add a integer of character in the array using methos //
class charr
{
	public static void main(String [] agrs)
	{
		int []a={'t','a','4','b','5','r','1','e','2'};
		System.out.println(Arrays.toString(a));
		int res=inte(a);
		System.out.println(res);
	}
	public static int inte(int [] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>='0' &&  a[i]<='9')
			sum+=a[i]-48;
		}
	
	return sum;
	}
	
}



// find the largest element in side the array //
class Largest
{
	public static void main(String [] args)
	{
		int [] a={7,4,13,41,2,6};
		System.out.println(Arrays.toString(a));
		large(a);
		System.out.println(large(a));
	}
	public static int large(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}


// find the Smallest element in side the array //
class Smallest
{
	public static void main(String [] args)
	{
		int [] a={7,4,13,41,2,6};
		System.out.println(Arrays.toString(a));
		large(a);
		System.out.println(large(a));
	}
	public static int large(int a[])
	{
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		return smallest;
	}
}


//lead cout proble sunrice is visible //
class Sun
{
	public static void main(String [] args)
	{
		int [] a={4,3,5,1,3,6,9,1};
		System.out.println(Arrays.toString(a));
		int res=sunrise(a);
		System.out.println(sunrise(a));
	}
	public static int sunrise(int [] a)
	{
		int count=1;
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				
				count++;
				max=a[i];
			}
		}
		return count;
	}
}


//lead cout proble sunrice is invisible //
class Suninvisible
{
	public static void main(String [] args)
	{
		int [] a={4,3,5,1,3,6,9,1};
		System.out.println(Arrays.toString(a));
		int res=sunrise(a);
		System.out.println(sunrise(a));
	}
	public static int sunrise(int [] a)
	{
		int count=0;
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<=min)
			{
				min=a[i];
			}
			else
			{
				count++;
			}
		}
		return count;
	}
}



//arrange binarys in //
class Bin
{
	public static void main(String[] args)
	{
		int [] a={0,1,0,0,1,1,0,1};
		System.out.println(Arrays.toString(a));
		int [] res=arrange(a);
		System.out.println(Arrays.toString(arrange(a)));
	}
	public static int[] arrange(int [] a)
	{
		
		int temp=0;
		for (int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if (a[i] == 0 && a[j] == 1)
				{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
			}
		}
		return a;
	}
}



//to rotate the array n number of time //
 class Rotate
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] a={10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.print("enter the number of times:");
		int n=sc.nextInt();
		rotat(a,n);
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotat(int [] a,int n)
	{
		for(int k=1;k<=n;k++)
		{
			int first=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=first;
		
		}
	}
}



//lead code waterfall problem//


//leadcode 121 profit or loss problem//
class Profit
{
	public static void main(String[] agrs)
	{
		int [] a={7,1,5,3,6,4};
		System.out.println(Arrays.toString(a));
		profitloss(a);
		System.out.println(profitloss(a));
	}
	public static int profitloss(int [] a)
	{
		int maxprofit=0;
		int cp=a[0];
		for(int i=1;i<a.length;i++)
		{
			int sp=a[i];
			int profit=sp-cp;
			maxprofit=Math.max(profit,maxprofit);
			if(sp<cp)
				cp=sp;
		
			
		}
		return maxprofit;
	}
}


//container which have more water by using nagaraj & seekar //

//its only show the greater value of building only (own program) //
//completely wrong program//
class Containerwithwater
{
	public static void main(String [] args)
	{
		int a[]={1,8,6,2,5,14,8,3,7};
		System.out.println(Arrays.toString(a));
		int res=withwater(a);
		System.out.println(res);
	}
	public static int withwater(int [] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				if(a[i]>a[j])
				{
					count=a[i];
						count++;
				}
		}
		}
		return count;
	}
}

//corect program//
class Containerwithwater2
{
	public static void main(String [] args)
	{
		int a[]={1,8,6,2,5,4,8,3,7};
		System.out.println(Arrays.toString(a));
		int res=withwater(a);
		System.out.println(res);
	}
	public static int withwater(int [] a)
	{
		int max_area=0;
		int l=0,r=a.length-1;
		while(l<r)
		{
			int area=Math.min(a[l],a[r])*(r-l);
			max_area=Math.max(area,max_area);
			if(a[l]<a[r])
			{
				l++;
			}
			else
			{
				r--;
		}
		}
		return max_area;
	}
}


//shorting a array by using buildin function//
class Buildin
{
	public static void main(String [] args)
	{
		int a[]={1,8,6,2,5,4,8,3,7};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}



//find the give array is mountain or unvalida mountain //
class Mountain
{
	public static void main(String[] args)
	{
		int a[]={0,2,3,4,5,2,1,0};
		System.out.println(Arrays.toString(a));
		findvalid(a);
		System.out.println(findvalid(a));
	}
	public static boolean findvalid(int [] a)
	{
		int peak=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				return false;
			}
			if(a[i]>a[i+1])
			{
				peak=i;
				break;
			}
		}
		if (peak==0)
		{
			return false;
		}
		for (int i=peak;i<a.length-1 ;i++ )
		{
			if(a[i]==a[i+1])
			{
				return false;
			}
			if(a[i]<a[i+1])
			{
			     return false;
			}
		}
		return true;
	}
}






//if nunber present in array is deuplicate true//

class Duplicate
{
	public static void main(String[] args)
	{
		int a[]={8,4,7,6,0,3};
		System.out.println(Arrays.toString(a));
		method1(a);
		System.out.println(method1(a));
		method2(a);
		System.out.println(method2(a));
	}
	public static boolean method1(int [] a)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				return true;
			}
		}
		return false;
	}
	public static boolean method2(int [] a)
	{
	
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
			{
				return true;
			}
			}
		}
		return false;
	}
}

