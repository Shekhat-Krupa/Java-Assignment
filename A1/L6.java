
public class L6 {//logic of Practical 6
	 public void wordsWithout(String x[],String y)
	    {   int count=0;
	        for(int i=0;i<x.length;i++)
	        {
	            if(x[i].equals(y))
	            {
	                count++;
	            }
	        }
	        String[] d=new String[x.length-count];
	        int j=0;
	        for(int i=0;i<x.length;i++)//setting the new array  
	        {
	            if(!x[i].equals(y))
	            {
	                d[j]=x[i];
	                j++;
	            }
	        }
	        System.out.print("New Array is : ");
	        for(String element:d)//printing the new array
	        {
	            System.out.print(element+" ");
	        }

	    }
}
