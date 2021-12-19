package zadanie;
public class Main {
    public static void main(String[] args){
        Holding myHolding=new Holding();
        TVchannel TV1=new TVchannel("Первый","Россия",19999,"Новости",1);
        myHolding.addMedia(TV1);
        TVchannel TV2=new TVchannel("НТВ","Россия",199989,"Фильмы",3);
        myHolding.addMedia(TV2);
        TVchannel TV3=new TVchannel("Якутия14","Якутия",192999,"Новости, телешоу",140);
        myHolding.addMedia(TV3);
        Newspaper News1 = new Newspaper("Кыым","Якутия",1322,"Новости",32);
        myHolding.addMedia(News1);
        myHolding.printMedia();
        myHolding.countTV();
        myHolding.countNewspaper();
    }
}
