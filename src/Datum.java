import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;
    private LocalDate zeitpunkt;

    // Konstruktor
    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
        this.zeitpunkt = LocalDate.now();
    }

    public Datum(String input) {
        String[] parts = input.split(" ");
        String datumString = parts[0];
        //String zeitString = parts[1];
        tag = Integer.parseInt(datumString.split("\\.")[0]);
        monat = Integer.parseInt(datumString.split("\\.")[1]);
        jahr = Integer.parseInt(datumString.split("\\.")[2]);
//        int stunde = Integer.parseInt(zeitString.split(":")[0]);
//        int minute = Integer.parseInt(zeitString.split(":")[1]);
//        int sekunde = Integer.parseInt(zeitString.split(":")[2]);
//        LocalDateTime zeitpunkt = LocalDateTime.of(jahr, monat, tag, stunde, minute, sekunde);
        LocalDate date = LocalDate.of(jahr, monat, tag);
        this.setZeitpunkt(date);
    }
    // Getter-Methoden
    public int getTag() {
        return this.tag;
    }

    public int getMonat() {
        return this.monat;
    }

    public int getJahr() {
        return this.jahr;
    }

    public LocalDate getZeitpunkt() {
        return this.zeitpunkt;
    }

    // Setter-Methoden
    public void setTag(int tag) {
        this.tag = tag;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public void setZeitpunkt(LocalDate zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    // Formatierungsmethoden
    @Override
    public String toString() {
        return tag + "." + monat + "." + jahr;
    }

}

//Die toString()-Methode verwendet die Klasse DateTimeFormatter, um das Datum und den Zeitpunkt in einem bestimmten Format zu formatieren. In diesem Beispiel wird das Format "dd.MM.yyyy HH:mm:ss" verwendet, was den Tag, Monat und Jahr im Format "TT.MM.JJJJ" und die Uhrzeit im Format "HH:mm:ss" anzeigt.
//
//Die parse()-Methode akzeptiert einen String als Eingabe, der das Datum und den Zeitpunkt im Format "TT.MM.JJJJ HH:mm:ss" enthält. Der String wird zuerst in Datum- und Zeit-Strings aufgeteilt und dann in die entsprechenden numerischen Werte für Tag, Monat, Jahr, Stunde, Minute und Sekunde umgewandelt. Anschließend wird ein neues Datum-Objekt erstellt und der Zeitpunkt wird mit den geparsten Werten gesetzt.
