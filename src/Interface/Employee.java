package Interface;

public class Employee extends Person
        implements Artist, Player, Doable {

    int empId;

    public Employee() {}

    @Override
    public void doArt() {
        System.out.println("Employee is doing art");
    }

    @Override
    public void doPlay() {
        System.out.println("Employee is playing");
    }

    @Override
    public void do1() {
        System.out.println("Employee is doing task");
    }
}
