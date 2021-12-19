package primer;

public class Auto {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    private int gosNomer;
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public void setGosNomer(int nomer){ //открытая функция (метод класса) для задания
        gosNomer=nomer; //значения максимальной скорости автомобиля
    }
    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public int getGosNomer() {
        return gosNomer;
    }
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
    }
    public Auto(String firma, int speed){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
    }
    public static void main(String[] args) {
        Auto myAuto1=new Auto("Ford",180); // создаем объект типа нашего класса
        System.out.println(myAuto1.getFirm()+" "+myAuto1.getMaxSpeed());//вывод сведений в
    }
}