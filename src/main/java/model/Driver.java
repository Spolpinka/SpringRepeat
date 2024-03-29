package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Driver {

    private String name;

    private Transport transport;

    public Driver (String name,Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public Driver(String name) {
        this.name = name;
    }

    //@Autowired
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver " +
                "name: " + name +
                ", transportType: " + transport;
    }
}
