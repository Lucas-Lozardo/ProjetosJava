package model.service;

public interface OnlinePaymentService {
	
	Double paymentFee(Double amount); 
	Double interest(Double amount, Integer months);

}

/*
 	Tradução:
		paymentFee - taxa de pagamento.
		interest -  juros.
*/