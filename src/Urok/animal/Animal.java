package Urok;

/**
 * Created by Pavlovan on 12.01.2017.
 */
public class Animal {
}{

protected String name;
protected String color;
protected float weight;

public void walk() {
        System.out.println("Животное " + name + " прогуливается...");
        }

public void run(float f) {
        System.out.println("Животное " + name + " пробежало " + f + " метров");
        }

public void jump() {
        System.out.println(name + " прыгает");
        }

public void printInfo() {
        System.out.println("Имя: " + name + " Цвет: " + color + " Вес: " + weight + " кг.");
        }

public abstract void voice();
        }

