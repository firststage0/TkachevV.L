import java.util.ArrayList;


public class List {
    public static void main(String[] args) {
        ArrayList<InternetShop> fileOfInternetShop = new ArrayList<>();
        Main shop = new Main(fileOfInternetShop);

        String NameShop = "DNS";
        String NameTovar = "Phone";
        String country = "China";
        String oplata = "Cash";
        int summa = 20000;
        String data = "19.06.2022";
        String FIO = "Рыбин Александр Петрович";

        InternetShop ITshop = new InternetShop(NameShop, NameTovar, country, oplata, summa, data, FIO);
        shop.newInternetShop(ITshop);

        String name = "Диван";
        int price = 12000;
        String type = "двухместный";
        String proizvoditel = "ВсеДомой";

        MebForGost gost = new MebForGost(NameShop, NameTovar, country, oplata, summa, data, FIO, name, price, type, proizvoditel);
        shop.newInternetShop(gost);

        String Name = "Стол";
        int gprice = 13000;
        int dl = 200;
        int vis = 120;
        int shir = 130;
        String mat = " дерево ";

        MebForKuh kuh = new MebForKuh(NameShop, NameTovar, country, oplata, summa, data, FIO, Name, gprice, dl, vis, shir, mat);
        shop.newInternetShop(kuh);

        String vname = " Ванная";
        int vprice = 6000;

        MebForVan van = new MebForVan(NameShop, NameTovar, country, oplata, summa, data, FIO, vname, vprice);
        shop.newInternetShop(van);


        System.out.println(shop.PrinInternetshop());
    }


}
