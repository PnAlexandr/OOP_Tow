package Urok;

/**
 * Created by Pavlovan on 12.01.2017.
 */
public class Dog {

    public Dog(String name, String color, float weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println(name + " гавкает");
    }

}


