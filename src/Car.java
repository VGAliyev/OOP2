public class Car extends EngineTransport {
    @Override
    public void check() {
        baseCheck(this);
        checkEngine();
    }
}
