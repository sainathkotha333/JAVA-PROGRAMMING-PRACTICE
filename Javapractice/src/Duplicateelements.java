
public class Duplicateelements {

	public static void main(String[] args) 
	{
		int [] arr= {1,5,6,3,1,2,2,6,3,6};
		System.out.println("Duplicate elements are");

		for(int i=0;i<arr.length;i++)
		{
	
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				
			System.out.println(arr[i]);
		
			break;
			}
		}
				
		}
}
}