public class Keyboard extends Instrument {

    protected KeyboardItem item;

    public Keyboard(Colour colour, Material material, KeyboardItem item){
        super(Type.KEYBOARD, colour, material);
        this.item = item;
        setWholesalePrice();
    }

    public KeyboardItem getItem(){
        return this.item;
    }

    public KeyboardBrand getBrand(){
        return getItem().getBrand();
    }

    public double getItemPrice(){
        return getItem().getPrice();
    }

    public String sound(){
        return "I am a keyboard";
    }

    public void setWholesalePrice(){
        super.wholesalePrice = getItemPrice();
    }

    public double calculateMarkup(){
        return getSellPrice() / getWholesalePrice();
    }
}
