package LogicalProgram;

public class Armstrong
{
	//num =153, 370
	public static void main(String[] args) 
	{
		int orgNum=153;
		
//	   int orgNUm = orgNum/10;  //153/10 = 15.3
//	   System.out.println(orgNum);// 15
//		
		int sum=0;
		
		for(int i=orgNum; i>0; i= i / 10)
		{
			int rem=i%10 ;
			sum=sum+(rem*rem*rem);
		}
		if(orgNum==sum)
		{
			System.out.println("given num " + orgNum + "is an Armstrong num");
		}
		else
		{
			System.out.println("given num" + orgNum + "is not an Armstrong num");
		}
	}

}
//   first get the last digit 3,  orgNum mod 10 reminder=3,  then cube of rem 3=27 is add in variable sum then next
//i=i%10 is that 153%10= 15.3 but i is integer it store only 15, then rem=i%10  ,{15 % 10 =rem is 5}then sum =27 &rem=5 then 5*5*5=125
//27+125=152 after that orgnum=1 , i%10= rem 1, it add in sum ,  sum =sum+(rem*rem*rem)===========>>153=152+1   