import java.util.ArrayList;

public class Shop implements ISell {

    private ArrayList<Instrument> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public double calculateMarkup(){
        Instrument item = this.stock.get(0);
        return item.getSellPrice() / item.getWholesalePrice();
    }

    public int stockAmount(){
        return this.stock.size();
    }

    public void addItem(Instrument item, double markup){
        double newMarkUp = markUp(markup);
        item.setPrice(newMarkUp);
        this.stock.add(item);
    }

    public Instrument removeItem(ISell item) {
        Instrument object = null;
        for (int i = 0; i < this.stock.size(); i++) {
            if (item == this.stock.get(i)) {
                object = this.stock.remove(i);
            }
        }
        return object;
    }

    public double profit(){
        double total = 0.0;
        for(Instrument item: this.stock){
            double margin = item.getSellPrice() - item.getWholesalePrice();
            total += margin;
        }
        return total;
    }


    public double markUp(double markup){
        if(markup >= 100.0){
            return (markup / 100.0);
        } else if (markup >= 0.0 && markup < 10.0) {
            return markup;
        }
        return discount(markup);
    }


    public double discount(double markup) {
        if (markup >= 10.0 && markup < 100.0) {
            return (markup / 100.0);
        }
        return markup = 1.0;
    }
}


//    public void addItem(Instrument item, double markup){
//        item.
//        item.setSellPrice();
//        this.stock.add(item);
//    }




