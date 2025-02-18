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
                .forEach(marvelLog -> System.out.println(marvelLog.getHeld()));

    }

    public static void galakkonfrontationen(List<MarvelLog> marvellog, Konfrontation konfrontation)
    {
        System.out.println("Tasks of the Space group sorted by difficulty from tsv file:");
        marvellog.stream()
                .filter(log -> log.getKonfrontation() == Konfrontation.GALAKTISCH)
                .sorted(Comparator.comparing(MarvelLog::getKonfrontation))
                .map(MarvelLog::getKonfrontation)
                .forEach(System.out::println);

        System.out.println();
    }
}


