public class PaymentGateway {
    private CardDetail card = null;

    //add card details
    public PaymentGateway(CardDetail card){
        if(card == null){
            throw new IllegalArgumentException("Card cannot be null");
        }
        this.card = card;
    }

    //check if the card is valid with sufficient balance
    private boolean checkValidity(){
        if(this.card == null){
            return false;
        }else{
            return true;
        }
    }

    //return the validity of the card
    public boolean payment(){
        return checkValidity();
    }

    
}
