package ASM3.example.ASM3_PhamVanThanh.model;

public class Enrollment {
    private Course course;
    private String name;
    private String email;
    private String phone;

    public Enrollment(){

    }
    public Enrollment(Course course, String name, String email, String phone) {
        this.course = course;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
