package zadanie;

public class Newspaper extends Media {
    private String topic;
    private int pages;
    public Newspaper(){
        super();
        topic="";
        pages=0;
    }
    public Newspaper(String name, String region, int audience, String topic, int pages){
        super(name,region,audience);
        this.topic=topic;
        this.pages=pages;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTopic() {
        return topic;
    }

    public int getPages() {
        return pages;
    }
    public String toString() {
        return "Название газеты:"+getName()+".Регион: "+getRegion()+".Количество читателей: "+getAudience()+".Тема: "+topic+".Кол-во страниц: "+pages;

    }
}
