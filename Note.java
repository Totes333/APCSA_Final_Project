public class Note{

    private String nname;
    private String ncontent;

    public Note(String name, String content){
        nname = name;
        ncontent = content;

    }

    public String printNote(){
        return nname + ": " + ncontent;

    }

    public void setNote(String name, String content){
        nname = name;
        ncontent = content;
    }


    
}