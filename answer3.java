package assignmentday1;

public class answer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int days=1020;
     int year=days/365;
//     System.out.print(year);
     int year1=year*365;
//     System.out.print(year1);
     int month=days-year1;
//     System.out.print(month);
     int month1=month/30;
//     System.out.print(month1);
     int week=(days-month-month1*30)/7;
//     System.out.print(week);
     int days1=month1*30;
     int days2=month-days1;
//     System.out.print(days2);
     int week1=days2/7;
     int days3=days2%7;
//     System.out.print(days3);
     System.out.print(year+"year :"+ month1+"month :"+week1+"week :" +days3+"days");
     
	}
	

}
