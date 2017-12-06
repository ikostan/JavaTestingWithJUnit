package Calculator;


public class Sum {
	
    public int summation(int[] nums)
	{
		int sum=0;
		for(int num:nums)
			sum +=num;
		return sum;
	} 
    
    public static int add(int a, int b)
    {
        return a+b;
    }
}
