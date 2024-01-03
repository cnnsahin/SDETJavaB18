package class21;

public class FileTester {

 public static void main(String[] args) {
        File[] arr = {new JavaFile("Notepad",15)
        ,new WordFile("Micresoft",10)
        ,new PdfFile("Pdf",5)};
        for(File f : arr){
            f.open();
            f.edit();
            f.close();
        }
 }
}

   /* public static void main(String[] args) {

    }
    JavaFile javaFile = new JavaFile("Example.java", 2150);
    WordFile wordFile = new WordFile("NewFile.doc", 1208);
    PdfFile pdfFile = new PdfFile("Example.pdf", 4120);


        javaFile.open();
        javaFile.edit();
        javaFile.close();

        wordFile.open();
        wordFile.edit();
        wordFile.close();

        pdfFile.open();
        pdfFile.edit();
        pdfFile.close();
        }*/



