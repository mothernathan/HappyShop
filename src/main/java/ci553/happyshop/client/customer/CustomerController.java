package ci553.happyshop.client.customer;

public class CustomerController {
    public CustomerModel cusModel;

    public void doAction(String action) {
        switch (action) {
            case "Search":
                cusModel.search();
                break;
            case "Add to Trolley":
                cusModel.addToTrolley();
                break;
            case "Cancel":
                cusModel.cancel();
                break;
            case "Check Out":
                cusModel.checkOut();
                break;
            case "OK & Close":
                cusModel.closeReceipt();
                break;
        }
    }

    // New: row buttons need to pass a product ID, so they can't go through doAction(String)
    public void plusOne(String id) {
        cusModel.plusOne(id);
    }

    public void minusOne(String id) {
        cusModel.minusOne(id);
    }
}
