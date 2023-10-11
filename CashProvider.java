import java.lang.ScopedValue.Carrier;

public class CashProvider {
    private long cardNumber;
    private boolean isAuthorized = false;
    private double balanceCard;

    public boolean buy(Ticket ticket) {
        if (isAuthorized) {
            //покупка
        }
        return false;
    }

    public void authorization(Customer client) {
        cardNumber = client.getCardNumber();
        isAuthorized = true;
    }

    public boolean isEnouthCash(double balanceCard, int price){
        //добавлено в рамказ дз
        //проверка остатка на карте - если баланс > цены билета - true
    }


}
