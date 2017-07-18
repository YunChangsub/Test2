
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
		
		//System.out.println(com[0] + com[1] + com[2]); // 정답
		
		System.out.println(" 숫자 야구게임  (기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.)");		
		System.out.println("  예) 1 2 3  :  1 스트라이크 1볼");
		
		Scanner scanner = new Scanner(System.in);
		
		int st = 0;
		int ba = 0;
		int my[] = {0, 0, 0};
		
		while (true)
		{
			System.out.print("서로 다른 0 ~ 9 수를 입력하세요  : ");
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
				System.out.println("게임이 끝났습니다.");
				return;
			}
			else if (st == 0 && ba == 0)
				System.out.println(" nothing!! ");
			else 
				System.out.println(" " + st + " 스트라이크 \t " + ba + " 볼 ");
		}
	}
}