import java.util.*;
class Entry
{
	int i,n,p=0;
	String fname[]=new String[20];
	String lname[]=new String[20];
	String add[]=new String[20];
	String sex[]=new String[20];
	int age[]=new int[20];
	int reg[]=new int[20];
	
	void entry()
	{	p=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people involved:");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the details of the "+(i+1)+" people in the record book:");
			reg[i]=i+1;
			System.out.println("Enter the first name:");
			fname[i]=sc.next();
			System.out.println("Enter the last name:");
			lname[i]=sc.next();
			System.out.println("Enter the address:");
			add[i]=sc.next();
			System.out.println("Enter the sex:");
			sex[i]=sc.next();
			System.out.println("Enter the age:");
			age[i]=sc.nextInt();
		}
	}
}


class Check extends Entry
{
	void verify()
	{
		Scanner sc=new Scanner(System.in);
		int x,r,q;
		System.out.println("Check whether the data entered above is correct or not?..Press '1' for 'yes' and '0' for 'no':");
		q=sc.nextInt();
		if(q==0)
		{
			System.out.println("How many person's data is entered wrong:");
			r=sc.nextInt();
			for(i=0;i<r;i++)
			{
			
				System.out.println("Enter the entry number of the person:");
				x=sc.nextInt();
				System.out.println("Re-enter the data of that person:");
				System.out.println("Enter the first name:");
				fname[x-1]=sc.next();
				System.out.println("Enter the last name:");
				lname[x-1]=sc.next();
				System.out.println("Enter the address:");
				add[x-1]=sc.next();
				System.out.println("Enter the sex:");
				sex[x-1]=sc.next();
				System.out.println("Enter the age:");
				age[x-1]=sc.nextInt();
			}
		}

	}
	
	void checknum()
	{
		if(p==1)
		{
			verify();
			int c=0;
			for(i=0;i<n;i++)
     			{
				if(age[i]>=18)
				c++;
			}
			System.out.println("The number of votter votted is :"+c);
			System.out.println("The remaining number of votter is :"+(n-c));
		}
		else
  			System.out.println("Please First Enter The Details.....No Information Is Recorded.....");
	}
}

class Show extends Check
{
	void display()
	{
		if(p==1)
		{
			int m=1;
			System.out.println("The information of the votter are:");
			for(i=0;i<n;i++)
			{	
				if(age[i]>=18)
				{
					System.out.println("Registered number :"+m);
					System.out.println("Name :"+fname[i]+" "+lname[i]);
					System.out.println("Address :"+add[i]);
					System.out.println("Gender :"+sex[i]);
					System.out.println("Age :"+age[i]);
					System.out.println("\n");
				}
				m++;
			}
		}
		else
			System.out.println("Please First Enter The Details.....No Information Is Recorded.....");
	}
}


class Result
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Show k=new Show();
		int ch;
		do
		{
			System.out.println("----------------------------");
			System.out.println("\t****MENU****");
			System.out.println("\n\t1.ENTRY\n\t2.CHECK\n\t3.DISPLAY\n\t4.EXIT");
			System.out.println("----------------------------");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:k.entry();break;
				case 2:k.checknum();break;
				case 3:k.display();break;
				case 4:System.out.println("Exit");
				default: System.out.println("Invalid Option");
			}
		}while(ch!=4);
	}
}
		 		