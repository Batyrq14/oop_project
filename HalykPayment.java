package proj;

public class HalykPayment implements paymentStrategy {
    
    private String cardNumber;
    
    private String getCardNumber() {
        return this.cardNumber;
    }
    
    private void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int sum) {

    }
}
