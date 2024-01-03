package class21;

abstract class File {
    protected String name;
    protected int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public abstract void open();

    public void edit() {
        System.out.println(" File will be edited" + name);

    }

    public void close() {
        System.out.println(" File is closed" + name);
    }
}
 class JavaFile extends File {
     public JavaFile(String name, int size) {
         super(name, size);
     }

    @Override
    public void open() {
        System.out.println(" opening the java file" + name+ "that is the " +size);
    }
}
 class WordFile extends File{
     public WordFile(String name, int size) {
         super(name, size);
     }


    @Override
    public void open() {
        System.out.println("Opening .doc file '" + name + "' with Microsoft Word");
    }


}
 class PdfFile extends File {
     public PdfFile(String name, int size) {
         super(name, size);
     }

     @Override
     public void open() {
         System.out.println("Opening .pdf file '" + name + "' with a PDF viewer");
     }
 }

