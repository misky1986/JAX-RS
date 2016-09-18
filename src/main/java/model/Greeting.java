package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
