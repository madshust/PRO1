public abstract class FileSystemElement {
    private String name;
    private String type;

    public FileSystemElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
