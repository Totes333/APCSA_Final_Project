import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;  
public class Main {

    public static void main(String[] args)throws Exception {
        Note chores = new Note("To Do List", "Clean room, wash clothes, go gym, make dinner");
        //System.out.println(chores.printNote());

        Event run = new Event("Running", "2023-05-27T15:00", "2023-05-27T15:45" ,"Go on a 30-35 minute easy recovery run with stretches before and after", true);
        //System.out.println(run.printEvent());

        Event newRun = run.addRepeat("Another Run","2023-05-31T15:00", "2023-05-31T15:45");
        //System.out.println(newRun.printEvent());

        Task hw = new Task("Homework", "2023-05-30T19:00","Work on Quantum research project, expand simulator and make it more accurate");
        //System.out.println(hw.printTask());

        Schedule life = new Schedule(chores, run, hw);
        life.addEvent(newRun);
        System.out.println(life.printSchedule());

    }

}
