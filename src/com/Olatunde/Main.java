package com.Olatunde;


class Car {
    private int cylinder;
    private boolean engine;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.engine = true;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Engine Started";
    }

    public String accelerate() {
        return "Car -> Accelerate()";
    }

    public String brake() {
        return "Car =-> brake ()";
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> Engine Started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> Accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake ()";
    }
}

 class Holden extends Car {
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> Engine Started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> Accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake ()";
    }
}

 class Ford extends Car {
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> Engine Started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> Accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake ()";
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
       Car car = new Car(8,"New Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());

        Mitsubishi galant = new Mitsubishi(6,"Galant");
        System.out.println(galant.startEngine());
        System.out.println(galant.accelerate());
        System.out.println(galant.brake());

        Ford ford = new Ford(6,"Fusion");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6,"Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


}
