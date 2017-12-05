import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Parameters:
		 * 
		 * field - the calendar field.
		 * 
		 * Returns:
		 * 
		 * the highest minimum value for the given calendar field.
		 */
		int greatestMinimum = cal.getGreatestMinimum(Calendar.YEAR);
		System.out.println("greatestMinimum = " + greatestMinimum);
		
		int leastMaximum = cal.getLeastMaximum(Calendar.YEAR);
		System.out.println("leastMaximum = " + leastMaximum);

	}

}
