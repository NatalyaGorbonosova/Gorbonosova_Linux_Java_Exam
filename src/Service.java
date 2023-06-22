import java.io.Serializable;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Service {
    // Формирование очереди из игрушек
    public static PriorityQueue<Toys> getToys(){
        Toys bear = new Toys(1,"Bear", 3, 30);
        Toys doll = new Toys(2, "Doll", 2, 20);
        Toys car = new Toys(3, "Car", 4, 40);
        Toys robot = new Toys(4, "Robot", 3, 10);
        Toys rabbit = new Toys(5, "Rabbit", 2, 50);

        PriorityQueue<Toys> toys = new PriorityQueue<>();

        toys.add(doll);
        toys.add(car);
        toys.add(bear);
        toys.add(robot);
        toys.add(rabbit);

        return toys;
    }
    // Добавление игрушки в очередь
    public static void putToy(PriorityQueue<Toys> toys){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные по игрушки через пробел, например 7 Кукла 10 30, где 7 - это индекс, далее название, количество игрушек и процент выпадания при розыгрыше");
        String newToyStr = sc.nextLine();
        try {
            String[] infoList = newToyStr.split(" ");
            Toys newToy = new Toys(Integer.valueOf(infoList[0]), infoList[1], Integer.valueOf(infoList[2]), Integer.valueOf(infoList[3]));
            toys.add(newToy);
            System.out.println("Игрушка добавлена");

        }
        catch (Exception e){
            System.out.println("Что-то пошло не так");
        }
    }
    // Получение игрушки из очереди
    public static void getToy(PriorityQueue<Toys> toys, String path){
        Toys toyWin = toys.poll();
        Toys toyWin2 = new Toys(toyWin.getId(), toyWin.getName(), 1, toyWin.getFrequency());
        if (toyWin.getCount() > 1) {
            int oldCount = toyWin.getCount();
            toyWin.setCount(oldCount-1);
            toys.add(toyWin);
        }
        FileHandler fileHandler = new FileHandler();
        fileHandler.save(toyWin2, path);


    }
}
