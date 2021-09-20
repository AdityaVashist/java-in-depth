public class Student {
    int id = 1000;
    int nextId = id + 1;

    void printId() {
        System.out.println(id);
        System.out.println(nextId);
    }

    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.printId();
    }
}
