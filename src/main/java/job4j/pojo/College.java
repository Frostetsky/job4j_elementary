package job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFIO("Нестеренко Никита Александрович");
        student1.setGroup(1);
        student1.setReceiptDate("08.08.2017");

        System.out.println(student1.getFIO() + " " + student1.getGroup() + " " + student1.getReceiptDate());
    }
}