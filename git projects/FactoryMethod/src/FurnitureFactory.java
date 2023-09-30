import java.util.HashMap;

public class FurnitureFactory implements IFurnitureFactory{

    @Override
    public IFurniture create(FurnitureTypes furnitureTypes) {

        switch (furnitureTypes){
            case BED -> {
                System.out.println("������� �������");
                return new Bed();
            }
            case CHAIR -> {
                System.out.println("���� ������");
                return new Chair();
            }
            case TABLE -> {
                System.out.println("���� ������");
                return new Table();
            }
            default -> {
                System.out.println("������ ���� ������ �� ����������");
                return null;
            }
        }
    }
}
