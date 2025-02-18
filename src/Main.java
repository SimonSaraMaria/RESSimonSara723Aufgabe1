import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String inputFileTSV = "marvel_konfrontationen.tsv";
        String outputFileTSV = "result.tsv";

        MarvelReaderTSV readerTSV = new MarvelReaderTSV(inputFileTSV, outputFileTSV);
    }
    public static void hoherenglobalenwert(List<MarvelLog> marvellog, Integer wert) {
        marvellog.stream()
                .filter(marvelLog -> marvelLog.getGlobalerEinfluss()>= wert)
                .forEach(marvelLog -> System.out.println(marvelLog.getHeld());

    }
}