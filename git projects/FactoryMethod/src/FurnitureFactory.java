import java.util.HashMap;

public class FurnitureFactory implements IFurnitureFactory{

    @Override
    public IFurniture create(FurnitureTypes furnitureTypes) {

        switch (furnitureTypes){
            case BED -> {
                System.out.println("Кровать собрана");
                return new Bed();
            }
            case CHAIR -> {
                System.out.println("Стул собран");
                return new Chair();
            }
            case TABLE -> {
                System.out.println("Стол собран");
                return new Table();
            }
            default -> {
                System.out.println("Такого вида мебели не существует");
                return null;
            }
        }
    }
}
