package domain;

public class Employe extends Person {
    private int idEmploye;
    private double salary;
    private static int counter;

    public Employe(String nombre, double salary) {
        super(nombre);
        this.idEmploye = ++Employe.counter;
        this.salary = salary;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employe{idEmploye=").append(idEmploye);
        sb.append(", salary=").append(salary);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
