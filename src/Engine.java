public interface Engine {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
