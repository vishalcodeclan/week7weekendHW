public class Guitar extends Instrument {

    protected GuitarItem item;

    public Guitar(Colour colour, Material material, GuitarItem item){
        super(Type.STRING, colour, material);
        this.item = item;
        setWholesalePrice();
    }

    public GuitarItem getItem(){
        return this.item;
    }

    public GuitarBrand getBrand(){
        return getItem().getBrand();
    }

    public double getItemPrice(){
        return getItem().getPrice();
    }

    public String sound(){
        return "I am a guitar";
    }

    public void setWholesalePrice(){
        super.wholesalePrice = getItemPrice();
    }

    public double calculateMarkup(){
        return getSellPrice() / getWholesalePrice();
    }



}
