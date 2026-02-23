public class FactoryDemo {

    public static void main(String[] args) {

        // Create factory object
        ShapeFactory factory = new ShapeFactory();

        // Get Circle object
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        // Get Rectangle object
        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();
    }
}