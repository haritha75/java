import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

class TimerTaskEx {

  public static void main(String[] args) {
//    based on the schedule it will pass msg like wishes
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {

      int counter = 10;
      public void run() {
        if(counter>0) {
          System.out.println(counter+ "seconds");
          counter--;
        }
        else {
          System.out.println("Happy new year....");
          timer.cancel();
        }

      }
    };

    Calendar date = Calendar.getInstance();
    date.set(Calendar.YEAR,2024);
    date.set(Calendar.MONTH,Calendar.FEBRUARY);
    date.set(Calendar.DAY_OF_MONTH,19);
    date.set(Calendar.HOUR_OF_DAY,0);
    date.set(Calendar.MINUTE,0);
    date.set(Calendar.SECOND,0);
    date.set(Calendar.MILLISECOND,0);


   // timer.schedule(task,0);
   // timer.schedule(task,date.getTime());
    timer.scheduleAtFixedRate(task,0,1000); // it repeat every one seconds that why we putting 1000 millisec
    timer.scheduleAtFixedRate(task,date.getTime(),1000); //in above we are setting time repeatedly if you want set time on given date use like this

  }
  
}
