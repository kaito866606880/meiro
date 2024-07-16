import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class frame extends MyFrame implements KeyListener
{   
	Random rand =new Random();
	int n;
	boolean aaa=true;
	int[][] matrix;
	public void run() 
	{
		runs();
		addKeyListener(this);
	}

		public void keyTyped(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
		}
 
		@Override
		public void keyPressed(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("e");
			if(e.getKeyCode()==KeyEvent.VK_SPACE) 
			{
				
				runs();
				aaa=false;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
		}
   

	public void runs()
	{
		
		clear();
		matrix = new int [15][];
		
		
		for(int i = 0; i < 15; i++)
		{
			matrix[i]= new int[15];
			
		}
		
		for(int i = 0; i < 15; i++ ) 
		{
			for(int  j = 0; j<15; j++) 
			{
				if(i==0 || i==14)
				{
					matrix[i][j] = 1;
				}
				else if(i >= 1 && i <= 13) {
					matrix[i][0]=1;
					matrix[i][14]=1;
					
					
				}
				else {
					matrix[i][j] = 0;
				}
				
				if(matrix[i][j]==1) {
					setColor(0,0,0);
					fillRect(50+i*10,50+j*10,10,10);
					sleep(0);
				}
				

			
			}
		
		}
		for(int a=2;a<14; a+=2) {
			for(int b=2;b<14;b+=2) {
				matrix[a][b]=1;
				
				if(matrix[a][b] == 1) {
					setColor(0,0,0);
					fillRect(a*10+50,b*10+50,10,10);
					sleep(0);
				}
			}
		}
	
		for(int a=2;a<14;a+=2)
		{
			for(int b=2;b<14;b+=2) 
			{
				swi(a,b);
			}
		}
		boolean c=false,d=false;
		while(d==false) {
			int x,y,j=0,k;
			x=rand.nextInt(15);
			y=rand.nextInt(15);
			if(x%2==1&&y%2==1&&matrix[x][y]!=1&&c==false&&x!=0&&y!=0) {
				j=x;
				k=y;
				setColor(0,0,255);
				fillRect(50+j*10,50+k*10,10,10);
				sleep(0);
				c=true;
			}
			int t;
			t=j-x;
			if(t<=0) 
			{
				t=t*-1;
			}
			
			if(c==true&&t>=5&&matrix[x][y]!=1&&x!=0&&y!=0)
			{
				
				setColor(255,29,0);
				fillRect(50+x*10,50+y*10,10,10);
				sleep(0);
				d=true;
			}

		}
		
	}
	
	public void swi(int i,int j)
	{
		boolean set=false;
		while(set==false) 
		{
			if(i==2) {n =rand.nextInt(4);}
			else     {n =rand.nextInt(3);}
			System.out.println(n);
			switch(n) 
			{
				case 0:
				j++;//下に伸ばす
				break;
				case 1://右に伸ばす
				i++;
				break;
				case 2://上に伸ばす
				j--;
				break;
				case 3://左に伸ばす
				i--;
				break;
			}
			
			if(matrix[i][j]==0) 
			{
				matrix[i][j]=1;
				if(matrix[i][j]==1)
				{
					setColor(0,0,0);
					fillRect(i*10+50,j*10+50,10,10);
					sleep(0.);
				}
				set=true;
			}
			
			switch(n) 
			{
				case 0:
				j++;
				break;
				case 1:
				i++;
				break;
				case 2:
				j--;
				break;
				case 3:
				i--;
				break;
		     }
	     }
     }
 }


















