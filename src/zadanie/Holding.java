package zadanie;
import java.util.ArrayList;
public class Holding {
    private ArrayList<Media> masMedia=new ArrayList<Media>();
    public void addMedia(Media m){
        masMedia.add(m);
    }
    public Holding(){
    }
    public Boolean findMedia(Media m){
        return masMedia.contains(m);
    }
    public void printMedia() { //для вывода на экран списка машин в гараже
        System.out.println("В холдинге: ");
        for (Media a:masMedia){ //
            System.out.println("\t"+a.toString());
        }
    }
    public void countTV(){
        int countT=0;
        for(Media a:masMedia){
            if(a instanceof TVchannel){
                countT++;
            }
        }
        System.out.println("В холдинге телеканалов: "+countT);
    }
    public void countNewspaper(){
        int countN=0;
        for(Media a:masMedia){
            if(a instanceof Newspaper){
                countN++;
            }
        }
        System.out.println("В холдинге газет: "+countN);
    }
}
