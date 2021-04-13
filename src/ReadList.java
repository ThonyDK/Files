import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadList {
    public static void main(String[] args) throws FileNotFoundException {

        /*Scanner tager imod en file fra resource mappen. Resource mappe filen er hentet på computeren og lagt ind i
        resource mappen. Mappen Resource er lavet ved at højreklikke på Files2, New, Directory og så kaldet Resource.
        Throws vil sige at fejlen kastes ud i ingenmands land.*/
        Scanner input = new Scanner(new File("Resource/Opavebeskrivelse.csv"));


        int countWords = 0;
        /*While loopet køre når der er linjer at læse og stopper ved sidste linje i filen hasNext er metoden der ser
        om der er mere tekst som den skal læse next læser næste linje hvis der er en. hvis der ikke er en ny
        linje så hopper den ud af whileloopet.*/
        while (input.hasNext()) {
            input.next();
            //countWords++ ligger tal til int countWords på linje 13.
            countWords++;

        }
        //Printer ud tekst + det antal ord der er lagt sammen.
        System.out.println("Words " + countWords);
    }
}
