
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();	
		
		for (int l = 0; l < 10; l++)
			list.add(l);
		Collections.shuffle(list);
		
		int com[] = {list.get(0), list.get(1), list.get(2)};
		
		//System.out.println(com[0] + com[1] + com[2]); // ����
		
		System.out.println(" ���� �߱�����  (�⺻������ 1���� 9���� ���� �ٸ� ���� �̷���� 3�ڸ��� ���� ���ߴ� �����̴�.)");		
		System.out.println("  ��) 1 2 3  :  1 ��Ʈ����ũ 1��");
		
		Scanner scanner = new Scanner(System.in);
		
		int st = 0;
		int ba = 0;
		int my[] = {0, 0, 0};
		
		while (true)
		{
			System.out.print("���� �ٸ� 0 ~ 9 ���� �Է��ϼ���  : ");
			String text = scanner.nextLine();
			String arr[] = text.split(" ");
			my[0] = Integer.parseInt(arr[0]);
			my[1] = Integer.parseInt(arr[1]);
			my[2] = Integer.parseInt(arr[2]);
			
			st = 0;
			ba = 0;
			
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					if (my[i] == com[j] && i == j)
						st++;
			
					else if (my[i] == com[j] && i != j)
						ba++;
				}
			}
			if (st==3)
			{
				System.out.println("������ �������ϴ�.");
				return;
			}
			else if (st == 0 && ba == 0)
				System.out.println(" nothing!! ");
			else 
				System.out.println(" " + st + " ��Ʈ����ũ \t " + ba + " �� ");
		}
	}
}