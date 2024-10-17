package good;

import com.solid.i.ComplexInvoice;
import com.solid.i.Invoice;

public interface GoodInvoicePrinter_I {
    public void print(Invoice invoice) ;

    public void printComplexInvoice(ComplexInvoice complexInvoice) ;
}
