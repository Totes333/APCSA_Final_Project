import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;

public class Schedule{

    private ArrayList<Note> noteList = new ArrayList<Note>();
    private ArrayList<Event> eventList = new ArrayList<Event>();
    private ArrayList<Task> taskList = new ArrayList<Task>();

    public Schedule(Note nname, Event ename, Task tname){
        noteList.add(nname);
        eventList.add(ename);
        taskList.add(tname);
        
    }

    public void addNote(Note nname){
        noteList.add(nname);
    }
    
    public void addEvent(Event ename){
        eventList.add(ename);
    }
    
    public void addTask(Task tname){
        taskList.add(tname);
    }

    public String printSchedule(){
        String noteStrings = "";
        
        for (int i = 0; i < noteList.size(); i++){
            noteStrings += noteList.get(i).printNote() + ", ";
        }
        
        String eventStrings = "";
        
        for (int i = 0; i < eventList.size(); i++){
            eventStrings += eventList.get(i).printEvent() + ", ";
        }
        
        String taskStrings = "";
        
        for (int i = 0; i < taskList.size(); i++){
            taskStrings += taskList.get(i).printTask() + ", ";
        }

        return "Notes: " + noteStrings + "\nEvents: " + eventStrings + "\nTasks: " + taskStrings;

    }


}