public class ServiceStationTransport implements ServiceStation {
    @Override
    public void check(Bicycle bicycle) {
        baseCheck(bicycle);
    }

    @Override
    public void check(Car car) {
        baseCheck(car);
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        baseCheck(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    private void baseCheck(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}
