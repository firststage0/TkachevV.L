import java.util.ArrayList;

public class Main {

    private final ArrayList<InternetShop> fileOfInternetShop;
    public Main(ArrayList<InternetShop> ListOfInternetShop){
        this.fileOfInternetShop = ListOfInternetShop;
    }

    public void newInternetShop(InternetShop iTshop) {
    fileOfInternetShop.add(iTshop);
    }
    public ArrayList<InternetShop> PrinInternetshop(){
        return fileOfInternetShop;
    }

}
