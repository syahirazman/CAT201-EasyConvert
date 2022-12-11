import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFtoTXT {
    public static void main(String[] args) throws IOException {

        //Loading an existing document
        File pdfFile = new File("C:\\Users\\Afiq Naqiuddin\\PhpstormProjects\\CAT201Assignment1\\uploads\\test.pdf");
        PDDocument document = PDDocument.load(pdfFile);

        //Instantiate PDFTextStripper class
        PDFTextStripper pdfStripper = new PDFTextStripper();

        //Retrieving text from PDF document
        String text = pdfStripper.getText(document);

        File txtFile = new File("C:\\Users\\Afiq Naqiuddin\\PhpstormProjects\\CAT201Assignment1\\output\\test.txt");
        FileWriter fw = new FileWriter(txtFile);

        fw.write(text);
        fw.close();
        document.close();
    }
}
