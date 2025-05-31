
public class Wordcount {

	public static void main(String[] args) {
		String ip="Java is java is world";
		String []r=ip.toLowerCase().split(" ");
		
		boolean[] visited=new boolean[r.length];
		for(int i=0;i<r.length;i++)
		{
	
			if(visited[i])
			{
			continue;
		    }
			
			int wordcount=1;
			for(int j=i+1;j<r.length;j++)
			{
				if(r[j].equals(r[i]))
				{
					wordcount++;
					visited[j]=true;
				}
			}
			
			if(wordcount>0)
			{
				System.out.println(r[i]+wordcount);
			}
			
			}

	}

}
