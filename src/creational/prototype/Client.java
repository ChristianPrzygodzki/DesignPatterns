package creational.prototype;

import sun.misc.Unsafe;

import java.util.concurrent.TimeUnit;

public class Client {

    private Some some;// could have been a private Cloneable some;

    public Client(Some some) {
        this.some = some;
    }

    public Some makeSome() {
        return (Some)some.clone();
    }

    public static void main(String[] args) {
        Some tempSome =  null;
        Some prot = new Something(13);
        Client client = new Client(prot);
        Some[] array = new Some[10];
        for (int i = 0; i < 10; i++) {
            array[i] = client.makeSome();
            System.out.println("Object " + (i+1) + ": hashcode - " + array[i].hashCode() +
                            ", identity hashcode - " +  System.identityHashCode(array[i]));
        }
    }
}

