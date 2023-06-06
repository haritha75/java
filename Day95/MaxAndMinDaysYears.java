import java.util.Calendar;

public class MaxAndMinDaysYears {

    public static void main(String[] args) {


                // creating calendar object
                Calendar calendar = Calendar.getInstance();

                int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
                System.out.println("Maximum number of days in a week: " + max);

                max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
                System.out.println("Maximum number of weeks in a year: " + max);

                int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);
                System.out.println("Minmum number of days in a week: " + min);

                 min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
                  System.out.println("Minmum number of weeks in a year: " + min);


            }
        }
