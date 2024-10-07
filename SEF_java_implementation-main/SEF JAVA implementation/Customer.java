public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerEmail;
    protected ShoppingCart cart = null;
    protected CardDetail card = null;

    
    public void confirmAppointment(Appointment appointment){
        Appointment customerAppointment;
        customerAppointment = appointment;
        
    }

    public void updateInformation(){
        System.out.println(customerID);
        System.out.println(customerName);
        System.out.println(customerEmail);
    }

     //assosiating a cart with the customer
    public void initialise(){       
        cart = new ShoppingCart(); 
        Product product = new Product();
        //updating cart with the products
        cart.updateCart(product);
        //see the products in the cart products
        cart.showProducts();    
    }

    

    //customer makes a paymet
    public void makePayment(CardDetail card){
        this.card = card;

        //recieve total rice from the cart
        cart.showTotalPrice();

        //proceed with the payment
        cart.proceedToCheckout(card);
        cart.paymentSuccess();
    }
    


}
