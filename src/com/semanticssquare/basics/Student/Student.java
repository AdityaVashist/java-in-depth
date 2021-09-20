public class Student {
    int id;

    void printId() {
        id = 1000;
        int nextId = id + 1;
        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
    }

    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.printId();
    }
}
