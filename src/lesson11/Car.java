package lesson11;

public class Car {

    String color;
    String engine;
    int count_doors;

    Car(String color, String engine, int count_doors) {
        this.color = color;
        this.engine = engine;
        this.count_doors = count_doors;
    }

    void show_attr() {
        System.out.println("Color = " + color);
        System.out.println("Engine = " + engine);
        System.out.println("Count doors = " + count_doors);
    }
}

class CatTest {

    void change_doors(Car car1, int new_count_doors) {
        car1.count_doors = new_count_doors;
    }

    void swap_color(Car car1, Car car2) {
        String env_color = car1.color;
        car1.color = car2.color;
        car2.color = env_color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("RED", "V6", 3);
        Car car2 = new Car("WHITE", "V12", 5);

        car1.show_attr();
        System.out.println();
        car2.show_attr();
        System.out.println();

        CatTest carTest = new CatTest();
        carTest.change_doors(car1, 5);
        car1.show_attr();
        System.out.println();

        carTest.swap_color(car1, car2);
        System.out.println("#############################");
        car1.show_attr();
        System.out.println();
        car2.show_attr();
        System.out.println();
    }

}
