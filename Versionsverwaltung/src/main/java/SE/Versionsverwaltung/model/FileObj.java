package SE.Versionsverwaltung.model;
public class FileObj {
    private final String fileID;
    private final String fileName;
    private final String fileText;
    private final String fileVersion;
    private final String fileParent;
    private final String fileEditor;
    private Boolean fileBlocked;
    public FileObj(String fileID, String fileName, String fileText, String fileVersion, String fileParent, String fileEditor, Boolean fileBlocked){
        this.fileID = fileID;
        this.fileName = fileName;
        this.fileText = fileText;
        this.fileVersion = fileVersion;
        this.fileParent = fileParent;
        this.fileEditor = fileEditor;
        this.fileBlocked = fileBlocked;
    }
    public String getFileID(){return fileID;}
    public String getFileName(){return fileName;}
    public String getFileText() {return fileText;}
    public String getFileVersion(){return fileVersion;}
    public String getFileParent(){return fileParent;}
    public String getFileEditor(){return fileEditor;}
    public Boolean isBlocked(){return fileBlocked;}
}