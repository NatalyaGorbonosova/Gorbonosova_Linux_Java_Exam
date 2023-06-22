
import java.io.FileWriter;
public class FileHandler implements  Writeable{
    // Сохранение полученной игрушки в файл
    public boolean save(Toys toy, String path){
        try (FileWriter fw = new FileWriter(path, true)){
            fw.write(toy.toString());
            fw.append('\n');
            fw.flush();
            System.out.println("Игрушка добавлена в файл");
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
