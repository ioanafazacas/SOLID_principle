package good;

import com.solid.i.Invoice;

public class GoodPrintingService {
    private GoodInvoicePrinter5 invoicePrinter;
    private HtmlInvoicePrinter html;
    public GoodPrintingService(GoodInvoicePrinter5 invoicePrinter)
    {
        this.invoicePrinter=invoicePrinter;
    }
    public GoodPrintingService(HtmlInvoicePrinter html)
    {
      this.html=html;
    }
    public void print(Invoice invoice) {
        System.out.println(invoice);
    }
}
