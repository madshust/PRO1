public class Main {
    public static void main(String[] args) {
        Folder home = new Folder("Home");
        Folder users = home.addFolder("Users");
        Folder søren = users.addFolder("Søren");
        Folder svend = users.addFolder("Svend");
        Folder work = home.addFolder("Work");
        Folder word = work.addFolder("Word");
        File homework = new File("Homework_SU9_Benn","docx",400);
        word.addFile(new File("Homework_SU9_Mads","docx",900));
        word.addFile(homework);
        home.contains();
        users.contains();
        work.contains();
        word.contains();


    }
}
