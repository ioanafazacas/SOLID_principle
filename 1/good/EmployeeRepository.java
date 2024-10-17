package good;

public class EmployeeRepository {
    public void save(GoodEmployee employee) {
        System.out.println(employee.getName()+ " a fost salvat in baza de date");
    }
}
