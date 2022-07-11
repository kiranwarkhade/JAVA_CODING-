package MeanMedianProgram;

public class MedianUsingCommandLine {
   
   public static void main(String args[]) 
    { 
	
	int n=Integer.parseInt(args[0]);
	double[] input=new double[n];
	
	double m=0;
	for(int i=0;i<n;i++) 
	{
		input[i]=Double.parseDouble(args[i+1]);
		
	}
	if(n%2==1)
	{
		m=input[(n+1)/2-1];
	}
	else
	{
		m=(input[n/2-1]+input[n/2])/2;
	}
	
       System.out.println("Median :"+m);  
   }
}


