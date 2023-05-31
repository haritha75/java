package electronics;

import javax.annotation.processing.Processor;

public class Laptops extends Electronics{

OS os;
Processors processor;

private int storage;


    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Processors getProcessor() {
        return processor;
    }

    public void setProcessor(Processors processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "os=" + os +
                ", processor=" + processor +
                ", storage=" + storage +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", inches=" + inches +
                ", weight=" + weight +
                '}';
    }
}
