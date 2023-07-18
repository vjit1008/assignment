package assignmentday1;

public class answer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=153;
     int a,b,c;
     
     a=num/100;
//     System.out.println(a);
      b=num/10%10;
//     System.out.println(b);
     c=num%10;
//     System.out.println(c);
     
     int arm=a*a*a+b*b*b+c*c*c;
//     System.out.println(arm);
     
     if(arm==num)
    	 System.out.println(arm+"it is armstrong no");
     else
    	 System.out.println(num+"it is not armstrong no");
	}

}
