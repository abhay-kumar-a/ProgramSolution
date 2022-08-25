package newAssignments.projects.designpattern;

public class FileUtil {
    static FileUtil fileUtil = null;
    private FileUtil(){
        readFile();
    }
    public static FileUtil getInstance()
    {
        if(fileUtil==null)
        {
            synchronized (FileUtil.class) {
                if (fileUtil == null){
                    fileUtil = new FileUtil();
                }
            }
        }
        return fileUtil;
    }
    public void readFile()
    {
        System.out.println("Created Instance of File Util");
    }
}
