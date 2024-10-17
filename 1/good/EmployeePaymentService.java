package good;

public class EmployeePaymentService {
    private EmployeeAdditionalPaymentService additionalPaymentService;
    private int sumaFinala;
    private int hourPay;
    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService)
    {
        this.additionalPaymentService=additionalPaymentService;
        this.sumaFinala=0;
        this.hourPay=30;
    }
    public void calculatePay(GoodEmployee employee) {
        sumaFinala=employee.getHours()*hourPay+additionalPaymentService.getValoare();
    }
}
