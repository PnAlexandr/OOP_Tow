package Urok;

/**
 * Created by Pavlovan on 12.01.2017.
 */
public class Cat {
}{

public Cat(String name, String color, float weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        }

@Override
public void run(float f) {
        System.out.println("Кот " + name + " пробежал " + f + " метров");
        }

@Override
public void voice() {
        System.out.println(name + " мяукает");
        }

public void justCatMethod() {
        System.out.println("Вызов кошачего метода");
        }
        }

