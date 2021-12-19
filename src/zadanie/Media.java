package zadanie;

public class Media {
    private String name;
    private String region;
    private int audience;

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public int getAudience() {
        return audience;
    }
    public Media(){
        name="Без названия";
        region="-";
        audience=0;
    }
    public Media(String name, String region, int audience){ //конструктор класса (с параметрами)
        this.name=name;
        this.region=region;
        this.audience=audience;
    }
}
