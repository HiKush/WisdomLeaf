package wisdom;

import java.time.LocalDateTime;

public class TransformMidDay {
public static void main(String[] args) {
	LocalDateTime time=ClockSupplier.creatTime24HrFormat();
	int hour=time.getHour();
	int minute=time.getMinute();
	if(minute==0)
	switch(hour){
		case 12:
			System.out.println("its midday");
			break;
		case 24:
			System.out.println("its midnight");
		default:
			System.out.println("its sunny or dark");
			
	}
}
}
