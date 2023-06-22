import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        // Формирование очереди из игрушек
        PriorityQueue <Toys> toys = Service.getToys();
        String path = "toyYouWin.out";
        // Добавление игрушки в очередь
        Service.putToy(toys);
        // Вызов метода получения игрушки и добавления в файл 10 раз
        for (int i = 0; i < 10; i++){
            Service.getToy(toys, path);
        }

    }
}