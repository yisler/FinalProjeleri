// Proje 12 : Kaydırma Problemi

public class Proje12 {

    public static void main(String[] args) {
        String kelime = "Programlama";
        int kelimeuzunlugu = kelime.length();

        for (int i = 0; i < kelimeuzunlugu; i++) {
            for (int j = 0; j < kelimeuzunlugu; j++) {
                System.out.print(kelime.charAt((i + j) % kelimeuzunlugu));
            }
            System.out.println();
        }
    }
}
