package wisdom;

import java.time.LocalDateTime;
import java.util.function.Predicate;

import wisdom.model.Pair;

public class ConvertClock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime lt = ClockSupplier.creatTime24HrFormat();
		int hour=lt.getHour();
		checkLiteral(hour);
	}

	private static void checkLiteral(int hour) {
		// TODO Auto-generated method stub
		HourPair hourPair=new HourPair();
		//check if input is in hourPair and return the corresponding string
		hourPair.getHourPairList().stream().filter((p)->p.getHour()==hour).map((e)->e.getStrHour()).
		forEach((fe)->System.out.println(fe));
	}

}
