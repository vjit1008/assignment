package assignmentday1;

public class answer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int time=2350;
      int hr =time/100;
//      System.out.println(hr);
      int min =time%100;
//      System.out.println(min);
      
      int finhr=hr%12;
//      System.out.println(finhr);
      
      
      if (hr>12)
    	  System.out.println((finhr)+":"+(min)+"pm");
      
      else 
    	  System.out.println((finhr)+":"+(min)+"am");
	}

}
