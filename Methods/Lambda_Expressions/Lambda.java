import java.util.*;
interface BlazBlue
{
	void checkEven(int[] arr);
}

public class Lambda {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i : num)
		{
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		/*
			BlazBlue Nu12 = (int[] arr)->
			{
				for(int j : arr)
				{
					if(arr[j] % 2 == 0)
					{
						System.out.println("The even numbers are: " + arr[j]);
					}
				}
			};
				
				Nu12.checkEven(num);
				*/
	}
}
