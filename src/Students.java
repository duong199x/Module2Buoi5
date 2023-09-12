public class Students {
    private String name = "John";
    private String classes = "C02";

    public Students() {
    }

    public void setName(String names) {
        this.name = names;
    }

    public void setClasses(String classess) {
        this.classes = classess;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

}
class Test{
    public static void main(String[] args) {
        Students std1 = new Students();
        std1.setName("Johan");
        std1.setClasses("c02");
        System.out.println(std1);
    }
}
