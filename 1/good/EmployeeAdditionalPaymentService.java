package good;

public class EmployeeAdditionalPaymentService {
    private int valoare;

    public EmployeeAdditionalPaymentService(){

    }
    public EmployeeAdditionalPaymentService(int valoare) {
        this.valoare = valoare;
    }

    public int getValoare() {
        return valoare;
    }

    public void setValoare(int valoare) {
        this.valoare = valoare;
    }
}
