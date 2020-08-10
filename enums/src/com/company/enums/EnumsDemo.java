package com.company.enums;

public class EnumsDemo {

	public enum Day{Mon,Tue,Wed,Thur,Fri,Sat,Sun};
	
	public static void main(String[] args) {
		Day[] day=Day.values();
		
		for(Day d:day)
		{
			switch(d)
				{
					case Mon:
							System.out.println("Monday");
							break;
							
					case Tue:
						System.out.println("Tuesday");
						break;
						
					case Wed:
						System.out.println("Wednesday");
						break;
						
					case Thur:
						System.out.println("Thursday");
						break;
						
					case Fri:
						System.out.println("Friday");
						break;
						
					case Sat:
						System.out.println("Saturday");
						break;
						
					case Sun:
						System.out.println("Sunday");
						break;
				}
	}
	}
}
