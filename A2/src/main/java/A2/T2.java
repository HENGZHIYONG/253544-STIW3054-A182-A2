package A2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class T2 extends Main implements Runnable {

	
	public T2(String[] lines) {
	}

	public void run() {
		
		LocalDate start = LocalDate.of(2019, Month.MAY, 25);
		LocalDate holidaystart = LocalDate.of(2019, Month.JUNE, 3);
		LocalDate holidayend = LocalDate.of(2019, Month.JUNE, 12);
        LocalDate end = LocalDate.of(2019, Month.JUNE, 21);
		
        long days =  (ChronoUnit.DAYS.between(start, end)) - (ChronoUnit.DAYS.between(holidaystart, holidayend));
                

		 try{
			 	System.out.println(Thread.currentThread().getName() +" Total number of days              = " + days +" days");
	            Thread.sleep(2000);
	        }catch(InterruptedException e){
	            e.printStackTrace();
	        }
		 
		// TODO Auto-generated method stub
		
	}
}
