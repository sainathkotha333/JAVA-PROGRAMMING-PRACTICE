
public class Duplicatewords {

	public static void main(String[] args) 
	{
		
				String [] words= {"hh","kk","mm","hh","kk","mm","jj","nk"};
				System.out.println("Duplicate elements are");

				for(int i=0;i<words.length;i++)
				{
			
				for(int j=i+1;j<words.length;j++)
				{
					if(words[i]==words[j])
					{
						
					System.out.println(words[i]);
				
					break;
		
		}
		}// TODO Auto-generated method stub

	}

	}
}
