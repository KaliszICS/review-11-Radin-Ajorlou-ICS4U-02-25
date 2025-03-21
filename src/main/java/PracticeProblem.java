public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray()
	{
		int[] nums = new int[5];

		for (int i = 0; i<5; i++)
		{
			nums[i]=(i+1);
		}
		return nums;
	}

	public static String[] createArray(String str1, String str2, String str3, String str4)
	{
		String[] strArray = {str1, str2, str3, str4};
		return strArray;
	}

	public static int findValue(int num, int[] list)
	{
		int dig = 0;
		for (int i = 0; i<list.length; i++)
		{
			if (list[i]==num)
			{
				return dig;
			}
			dig++;
		}

		return -1;
	}


	public static int findThirdValue(String line, String[] list)
	{
		int occurence=0;
		for (int i=0; i<list.length; i++)
		{
			if (list[i]==line)
			{
				occurence++;
			}
			if (occurence==3)
			{
				return i;
			}
		}
		return -1;
	}


}
