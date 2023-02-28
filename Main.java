public class Main {
    public static void main(String[] args) {
        Tivi t1 = new Tivi("TV1", "LG", 55, 15000.000);
        Tivi t2 = new Tivi("TV2", "Panasonic", 10, 20000.000);

        TiviTM tm1 = new TiviTM("TVTM", "Samsung", 55, 30000.000, 10, "4K");
        TiviTM tm2 = new TiviTM("TVTM", "Samsung", 10, 40000.000, 32, "8K");

        System.out.println(t1.toString());
        System.out.println("-----------------");
        System.out.println(t2.toString());
        System.out.println("-----------------");
        System.out.println(tm1.toString());
        System.out.println("-----------------");
        System.out.println(tm2.toString());
        System.out.println("-----------------");
    }
}
