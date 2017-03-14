package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceCreator {
	public Invoice createInvoice(ClientData clientData) {
		
		Id id = Id.generate();
				 
		return new Invoice(id, clientData);	
	}
}
