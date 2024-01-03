package class21;
// Created by microsoft

interface FileReader{
   void read();//you dont need write abstract or public at interface
}
public class ExcelFile implements FileReader{
    public void read(){
        System.out.println("Reading an Excel file");
    }

}
// created by NotePad++
class TxtFile implements FileReader{
   public void read(){// it will be public
       System.out.println("Reading Text File");
    }


}
