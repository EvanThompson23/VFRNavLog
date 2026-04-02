public class Visual_Ref {
    String name;
    String type;
    double longitude;
    double latitude;
    int radius;
    String notes;

    public Visual_Ref(String name, String type, double longitude, double latitude, int radius, String notes){
        this.name = name;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
        this.radius = radius;
        this.notes = notes;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    
    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }
}
