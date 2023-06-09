
public class Palindrome {

	public static void main(String[] args) {
		
int p=366;
int r,k=0;
int v;
 v=p;

while (p>0)
{
r=p%10;
k=(k*10)+r;
p=p/10;
}
if(k==p)

	System.out.println("the given no is palindrome");
	else
	System.out.println(" the given no is not palindrome");
		


	}

}
