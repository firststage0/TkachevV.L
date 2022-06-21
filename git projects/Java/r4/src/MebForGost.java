public class MebForGost extends InternetShop{
    private String name;
    private int price;
    private String type;
    private String proizvoditel;

    public MebForGost(String NameShop, String NameTovar, String country, String oplata, int summa, String data, String FIO,
                      String name,int price, String type,String proizvoditel) {
        super(NameShop, NameTovar, country, oplata, summa, data, FIO);
        this.name = name;
        this.price = price;
        this.type = type;
        this.proizvoditel = proizvoditel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public String toString() {
        return "Название: " + name+
                ", Цена = " + price +
                ", Тип: " + type +
                ", Производитель: " + proizvoditel;
    }
}
