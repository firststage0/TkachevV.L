public class MebForKuh extends InternetShop{
    private String Name;
    private int gprice;
    private int dl;
    private int vis;
    private int shir;
    private String mat;

    public MebForKuh(String NameShop, String NameTovar, String country, String oplata, int summa, String data, String FIO,
                     String Name, int gprice, int dl, int vis, int shir, String mat) {
        super(NameShop, NameTovar, country, oplata, summa, data, FIO);
        this.Name = Name;
        this.gprice = gprice;
        this.dl = dl;
        this.vis = vis;
        this.shir = shir;
        this.mat = mat;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setGprice(int gprice) {
        this.gprice = gprice;
    }

    public int getGprice() {
        return gprice;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public int getDl() {
        return dl;
    }

    public void setVis(int vis) {
        this.vis = vis;
    }

    public int getVis() {
        return vis;
    }
    public void setShir(int shir) {
        this.shir = shir;
    }

    public int getShir() {
        return shir;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getMat() {
        return mat;
    }

    public String toString() {
        return "Мебель для кухни:" +
                "Название:'" + Name +
                ", Цена =" + gprice +
                ", Динна:'" + dl +
                ", Высота:'" + vis  +
                ", Ширина:" + shir  +
                ", Материал:" + mat;
    }
}
