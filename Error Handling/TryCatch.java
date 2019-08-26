public class TryCatch {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int breaking = 0;
		
		try
		{
			for (int i = 0; i <= num.length; i++)
					{
				num[i] = num[i+1];
				
					}
			breaking = 5/0;
				}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException yeet)
		{
			yeet.printStackTrace();
		}
		finally
		{
			System.out.println("done");
		}
	}

}
