// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Datum d = new Datum("23.03.2023");
        System.out.println(d.getTag() + "."+ d.getMonat() +"."+ d. getJahr());

        Datum d1 = new Datum(29, 3, 2023);
        System.out.println("Datum: " + d1.toString()); /* Ausgabe: Datum: 29.3.2023 12:00:00 */

        Datum d2 = new Datum("15.12.2022 14:30:00");
        System.out.println("Tag: " + d2.getTag()); // Ausgabe: Tag: 15
        System.out.println("Monat: " + d2.getMonat()); // Ausgabe: Monat: 12
        System.out.println("Jahr: " + d2.getJahr()); // Ausgabe: Jahr: 2022
        System.out.println("Zeitpunkt: " + d2.getZeitpunkt()); // Ausgabe: Zeitpunkt: 2022-12-15T14:30
        }
    }