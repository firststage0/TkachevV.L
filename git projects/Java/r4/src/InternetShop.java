public class InternetShop {
    private String NameShop;
    private String NameTovar;
    private String country;
    private String oplata;
    private int summa;
    private String data;
    private String FIO;

    public InternetShop(String NameShop, String NameTovar, String country, String oplata, int summa, String data, String FIO){
        this.NameShop = NameShop;
        this.NameTovar = NameTovar;
        this.country = country;
        this.oplata = oplata;
        this.summa = summa;
        this.data = data;
        this.FIO = FIO;
    }

    public void setNameShop(String nameShop) {
        this.NameShop = nameShop;
    }

    public String getNameShop() {
        return NameShop;
    }

    public void setNameTovar(String nameTovar) {
        this.NameTovar = nameTovar;
    }

    public String getNameTovar() {
        return NameTovar;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public int getSumma() {
        return summa;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setOplata(String oplata) {
        this.oplata = oplata;
    }

    public String getOplata() {
        return oplata;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public String toString() {
        return
                "Название Магазина: " + NameShop +
                ", Имя товара: " + NameTovar +
                ", Страна производитель " + country +
                ", оплата: " + oplata +
                ", сумма = " + summa +
                ", дата: " + data +
                ", ФИО: " + FIO ;
    }
}
