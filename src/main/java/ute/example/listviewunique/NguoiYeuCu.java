package ute.example.listviewunique;

public class NguoiYeuCu {
    private String name;
    private int age;
    private String timeTogether;
    private int img;

    public NguoiYeuCu(String name, int age, String timeTogether, int img) {
        this.name = name;
        this.age = age;
        this.timeTogether = timeTogether;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTimeTogether() {
        return timeTogether;
    }

    public void setTimeTogether(String timeTogether) {
        this.timeTogether = timeTogether;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
