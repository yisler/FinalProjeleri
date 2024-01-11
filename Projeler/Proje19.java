// Proje 19 : Pazaryeri Sınıfı

public class Proje19 {
    public static class Pazaryeri {

        private String isim;
        private String renk;
        private String sahiplik;

        public Pazaryeri(String isim, String renk, String sahiplik) {
            this.isim = isim;
            this.renk = renk;
            this.sahiplik = sahiplik;
        }

        public void set(String isim, String renk, String sahiplik) {
            this.isim = isim;
            this.renk = renk;
            this.sahiplik = sahiplik;
        }

        public void set(String isim, String renk) {
            this.isim = isim;
            this.renk = renk;
        }

        public String getIsim() {
            return isim;
        }

        public String getRenk() {
            return renk;
        }

        public String getSahiplik() {
            return sahiplik;
        }

        public String PazaryeriTuru() {
            return "belirsiz";
        }
        public static void main(String[] args) {
            Pazaryeri pazaryeri = new Pazaryeri("Pazar 1", "Kırmızı", "Yerli");

            System.out.println(pazaryeri.getIsim());
            System.out.println(pazaryeri.getRenk());
            System.out.println(pazaryeri.getSahiplik());
            System.out.println(pazaryeri.PazaryeriTuru());

        }

    }
}
