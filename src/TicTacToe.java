import java.util.Scanner;

class Position
{
	int row;
	int col;
	
	void rowCol(int a)
	{
		if(a==1)
			{
				row=0;
				col=0;
			}
		else if(a==2)
		{
			row=0;
			col=1;
		}
		else if(a==3)
		{
			row=0;
			col=2;
		}
		else if(a==4)
		{
			row=1;
			col=0;
		}
		else if(a==5)
		{
			row=1;
			col=1;
		}
		else if(a==6)
		{
			row=1;
			col=2;
		}
		else if(a==7)
		{
			row=2;
			col=0;
		}
		else if(a==8)
		{
			row=2;
			col=1;
		}
		else  if(a==9)
		{
			row=2;
			col=2;
		}
	}
}

public class TicTacToe 
{
	public static void main(String Args[])
	{
		char arr[][]=new char[3][3];
		Scanner scan=new Scanner(System.in);
		
		System.out.println("player1 choose 'x' or 'o'");
		char y=scan.next().charAt(0);//remember this how to take character input.
		char p1=y;
		char p2;
		if ( y=='o')
			p2='x';
		else
			p2='o';
		
		Position obj=new Position();
			
		for (int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				arr[row][col]='_';//string is shown in double inverted and char in single inverted
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();

		}
		
		System.out.println("imagine the grid as 1 to 9 keypad and choose the position");
		
		for(int i=0; i<9; i++)
		{
			System.out.println("player1 put your symbol "+p1);
			obj.rowCol(scan.nextInt());
			arr[obj.row][obj.col]=p1;
			
			for (int row=0; row<3; row++)
			{
				for(int col=0; col<3; col++)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();

			}
			
			if(arr[0][0]==arr[0][1] && arr[0][0]==arr[0][2] && arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[0][1]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2]&& arr[1][0]!='_')
			{
				if(arr[1][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[1][0]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2]&& arr[2][0]!='_')
			{
				if(arr[2][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[2][0]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0]&& arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[0][0]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][1]==arr[1][1] && arr[0][1]==arr[2][1]&& arr[0][1]!='_')
			{
				if(arr[2][1]==p1)
					System.out.println("............player 1 won............");
				if (arr[2][1]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2]&& arr[0][2]!='_')
			{
				if(arr[0][2]==p1)
					System.out.println("............player 1 won............");
				if (arr[0][2]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]&& arr[0][0]!='_')
			{
				if(arr[2][2]==p1)
					System.out.println("............player 1 won............");
				if (arr[2][2]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0]&& arr[0][2]!='_')
			{
				if(arr[2][0]==p1)
					System.out.println("............player 1 won..........");
				if (arr[2][0]==p2)
					System.out.println("............player 2 won..........");
				break;
			}
			
			
			System.out.println("player2 put your symbol "+p2);
			obj.rowCol(scan.nextInt());
			arr[obj.row][obj.col]=p2;
			
			for (int row=0; row<3; row++)
			{
				for(int col=0; col<3; col++)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();

			}
			
			if(arr[0][0]==arr[0][1] && arr[0][0]==arr[0][2] && arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[0][1]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2]&& arr[1][0]!='_')
			{
				if(arr[1][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[1][0]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2]&& arr[2][0]!='_')
			{
				if(arr[2][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[2][0]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0]&& arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
					System.out.println("............player 1 won............");
				if (arr[0][0]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][1]==arr[1][1] && arr[0][1]==arr[2][1]&& arr[0][1]!='_')
			{
				if(arr[2][1]==p1)
					System.out.println("............player 1 won............");
				if (arr[2][1]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2]&& arr[0][2]!='_')
			{
				if(arr[0][2]==p1)
					System.out.println("............player 1 won............");
				if (arr[0][2]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]&& arr[0][0]!='_')
			{
				if(arr[2][2]==p1)
					System.out.println("............player 1 won............");
				if (arr[2][2]==p2)
					System.out.println("............player 2 won............");
				break;
			}
			
			if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0]&& arr[0][2]!='_')
			{
				if(arr[2][0]==p1)
					System.out.println("............player 1 won..........");
				if (arr[2][0]==p2)
					System.out.println("............player 2 won..........");
				break;
			}
			
		}
	}
}
