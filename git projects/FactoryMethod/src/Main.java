public class Main {
    public static void main(String[] args){
        FurnitureFactory furnitureFactory = new FurnitureFactory();

        furnitureFactory.create(FurnitureTypes.BED);
        furnitureFactory.create(FurnitureTypes.CHAIR);
        furnitureFactory.create(FurnitureTypes.TABLE);

        

    }
}
