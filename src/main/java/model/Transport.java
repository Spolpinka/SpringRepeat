package model;

public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    void start() {
        System.out.println("Запуск " + model);
    }

    void stop() {
        System.out.println("Стоп " + model);
    }

    @Override
    public String toString() {
        return "Transport class - " + getClass().toString() +
                ", model = " + model;
    }
}
