import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;  
public class Event{
    private String ename;
    private String econtent;
    private Date estart;
    private Date eend;
    private long duration;
    private Boolean repeating;


    public Event(String name, String initstart, String initend, String content, Boolean initrepeating)throws Exception{
        ename = name;
        econtent = content;
        estart = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(initstart);  
        eend = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(initend); 
        duration = (eend.getTime() - estart.getTime())/60000;
        repeating = initrepeating;
    }

    public String printEvent(){
        return ename + ": " + estart + " to " + eend + " duration (" + duration + " minutes): " + econtent + ", repeating? " + repeating;

    }

    public void setEvent(String name, String initstart, String initend, String content, Boolean initrepeating)throws Exception{
        ename = name;
        econtent = content;
        estart = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(initstart);  
        eend = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(initend); 
        duration = (eend.getTime() - estart.getTime())/60000;
        repeating = initrepeating;
    }

    public Event addRepeat(String newName, String newStart, String newEnd)throws Exception{
        if (repeating == true){
            return new Event(newName, newStart, newEnd, econtent, true);
        }
        else{
            return null;



        }
    }

}
