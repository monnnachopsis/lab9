package zadanie;
public class TVchannel extends Media{
    private String topic;
    private int numChannel;
    public TVchannel(){
        super();
        topic="";
        numChannel=0;
    }
    public TVchannel(String name, String region, int audience, String topic, int numChannel){
        super(name,region,audience);
        this.topic=topic;
        this.numChannel=numChannel;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setNumChannel(int numChannel) {
        this.numChannel = numChannel;
    }

    public String getTopic() {
        return topic;
    }

    public int getNumChannel() {
        return numChannel;
    }

    public String toString() {
        return "Название телеканала:"+getName()+".Регион: "+getRegion()+".Количество зрителей: "+getAudience()+".Тема: "+topic+".Номер канала: "+numChannel;
    }
}
