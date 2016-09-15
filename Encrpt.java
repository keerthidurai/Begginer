import java.util.Scanner;
public class Encrp 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[]r=str.split(" ");
		String output=" ";
		for(int i=0;i<r.length;i++)
		{
			char[]c=r[i].toCharArray();
			char[]f=new char[26];
			int p=0;
			for(char d='a';d<='z';d++)
			{
				f[p]=d;
				p++;
			}
			int size=c.length;
			for(int m=0;m<=size-2;m++)
			{
			int x=0;	
			for(char b='a';b<=c[size-1];b++)
			{
				x++;
			}
			int y=0;
			for(char e='a';e<=c[m];e++)
			{
				y++;
			}
			int z=y-x;
			if(z>0)
			{
				output=output+f[z-1];
			}
			else
			{
				output=output+f[25-z];
			}
			}
			System.out.println(output+c[size-1]+" ");
		}
	}
}
