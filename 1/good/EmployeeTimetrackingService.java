package good;

public class EmployeeTimetrackingService {
    public void reportHours(GoodEmployee employee) {
        System.out.println(employee.getName()+" cu statutul "+employee.getStatus()+ ", a lucrat "+
                employee.getHours()+ " de ore");
    }
}
