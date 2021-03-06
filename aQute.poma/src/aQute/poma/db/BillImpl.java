package aQute.poma.db;

import java.math.*;

import aQute.poma.domain.*;

public class BillImpl implements Bill {
	BigDecimal		amount;
	Payment			paid	= Payment.UNPAID;
	final String	id;
	final Customer	customer;

	public BillImpl(Customer customer, String id, BigDecimal amount) {
		this.amount = amount;
		this.id = id;
		this.customer = customer;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public Customer getCustomer() {
		return customer;
	}

	public void setPaid(Payment p) {
		this.paid = p;
	}

	@Override
	public Payment getPaid() {
		return paid;
	}

}
