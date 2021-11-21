class Pattern
{
	public static void main(String[] arg)
	{
		int r=5;
		int c=5;
		
		for(int i=1;i<=r;i++)
		{
		 for(int j=1;j<=c;j++)
		  {
			System.out.print(i+ " "); 
		
		  }
		 System.out.println(" ");
		}
	}
}


/* o|p: D:\Ankita\Java>java Pattern
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5 */


class Pattern1
{
	public static void main(String[] arg)
	{
		int r=5;
		int c=5;
		
		for(int i=1;i<=r;i++)
		{
		 for(int j=1;j<=c;j++)
		  {
			System.out.print(j+ " "); 
		
		  }
		 System.out.println(" ");
		}
	}
}

/* o|p: D:\Ankita\Java>java Pattern1
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 */

class Pattern2
{
	public static void main(String[] arg)
	{
		int r=4;
		int c=5;
		
		for(int i=1;i<=r;i++)
		{
		 for(int j=1;j<=c;j++)
		  {
			System.out.print((i*2)+ " "); 
		
		  }
		 System.out.println(" ");
		}
	}
}

/* o|p: D:\Ankita\Java>java Pattern2
2 2 2 2 2
4 4 4 4 4
6 6 6 6 6
8 8 8 8 8 */

class Pattern3
{
	public static void main(String[] arg)
	{
		int r=5;
		int c=5;
				
		for(int i=r;i > 0;i--) //row 
		{
		 for(int j=r;j > 0;j--)
		  {
			System.out.print(i+ " "); 
		
		  }
		 System.out.println("");
		}
	}
}

/* o|p: D:\Ankita\Java>java Pattern3
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1 */