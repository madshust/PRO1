import java.lang.reflect.Type;
import java.util.ArrayList;

public class Folder extends FileSystemElement{
    private ArrayList<FileSystemElement> fileSystemElements = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addFile(File file){
        fileSystemElements.add(file);
    }

    public Folder addFolder(String name){
        Folder newFolder = new Folder(name);
        fileSystemElements.add(newFolder);
        return newFolder;

    }

    public void contains(){
        System.out.println(getName() + " contains " + fileSystemElements.size() + " elements: ");
        for (int i = 0; i<fileSystemElements.size();i++)
            System.out.println(i + ": " + fileSystemElements.get(i));
    }

    @Override
    public String toString() {
        return getName();
    }
}
