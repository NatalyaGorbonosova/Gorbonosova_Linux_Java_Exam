

public class Toys implements Comparable<Toys> {
    private int id;
    private String name;
    private  int count;
    private int frequency;
// конструктор
    public Toys(int id, String name, int count, int frequency) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.frequency = frequency;
    }

// перевод объекта в строку для вывода информации об игрушке
    public String toString(){
        StringBuilder info = new StringBuilder();

        info.append(this.id + ". " + this.name);
        info.append(" count: "+ this.count + " frequency: " + this.frequency);
        return  info.toString();
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
// сравнение игрушек по проценту выйгрыша, для добавления в очередь
    @Override
    public int compareTo(Toys o) {
        return  Integer.compare(o.frequency, this.frequency);
        //return name.compareTo(o.getName());
    }
}
