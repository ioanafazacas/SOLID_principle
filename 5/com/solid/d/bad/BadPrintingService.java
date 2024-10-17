package com.solid.d.bad;

import com.solid.i.Invoice;
import good.GoodInvoicePrinter5;

public class BadPrintingService {

	private GoodInvoicePrinter5 invoicePrinter; // notice the lack of an interface!

	public BadPrintingService() {
		this.invoicePrinter = new GoodInvoicePrinter5();
	}

	public void print(Invoice invoice) {
		invoicePrinter.print(invoice);
	}

}
