public class Truck extends EngineTransport {
    @Override
    public void check() {
        baseCheck(this);
        checkEngine();
        System.out.println("Проверяем прицеп");
    }
}
