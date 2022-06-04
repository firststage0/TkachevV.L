package ElectronicShopping;

public class ElectronicShopping {
    private String name_shop;
    private String name_product;
    private String country;
    private String oplata;
    private int sum;
    private String data;
    private String FIO;
    public ElectronicShopping(String name_shop, String name_product, String country, String oplata, int sum,
                              String data, String FIO){
        this.name_shop = name_shop;
        this.name_product = name_product;
        this.country = country;
        this.oplata = oplata;
        this.sum = sum;
        this.data = data;
        this.FIO = FIO;
    }
    public String getName_shop(){
        return name_shop;
    }

    public void setName_shop(String name_shop){
        this.name_shop = name_shop;
    }

    public String getName_product(){
        return name_product;
    }

    public void setName_product(String name_product){
        this.name_product = name_product;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOplata() {
        return oplata;
    }

    public void setOplata(String oplata) {
        this.oplata = oplata;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String toString() {
        return "Магазин " + name_shop + "." + " Товар " + name_product + "." + " Страна производитель: " + country + "."
                + "\n Вид оплаты " + oplata + "," + " на сумму " + sum + " рублей" + "\n Дата продажи " + data + "." +
                "\n Покупатель " + FIO + ".";
    }

    public class TestElectronicShopping{
    public static void main(String[] args){
        ElectronicShopping electronicShopping = new ElectronicShopping("ДНС", "Наушники", "Германия",
                " Наличные", 14000, "01.06.2022","Соловьев Денис Олегович");
        System.out.println(electronicShopping.toString());
    }
    }
}

