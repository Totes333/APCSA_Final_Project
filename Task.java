import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;  

public class Task{

    private String tname;
    private Date treminder;
    private String tcontent;

    public Task(String name, String reminder, String content)throws Exception{
        tname = name;
        treminder = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(reminder);
        tcontent = content;
        
    }

    public String printTask(){
        return tname + ": " + tcontent + ", reminder on " + treminder;

    }


    public void setTask(String name, String reminder, String content)throws Exception{
        tname = name;
        treminder = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(reminder);
        tcontent = content;
        
    }

}