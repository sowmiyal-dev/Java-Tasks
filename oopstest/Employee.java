package oopstest;

public class Employee {
    int employeeId;
    String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "sowmiya", 5);
        Developer d = new Developer(2, "loganathan", "Java");
        m.displayDetails();
        d.displayDetails();
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(int employeeId, String name, int teamSize) {
        super(employeeId, name);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String language;

    Developer(int employeeId, String name, String language) {
        super(employeeId, name);
        this.language = language;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}