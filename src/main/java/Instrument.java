public abstract class Instrument implements IPlayable, ISell {

    protected Type type;
    protected Colour colour;
    protected Material material;
    protected double wholesalePrice;
    protected double sellPrice;

    public Instrument(Type type, Colour colour, Material material){
        this.type = type;
        this.colour = colour;
        this.material = material;

    }

    public Type getType() {
        return this.type;
    }

    public Colour getColour() {
        return this.colour;
    }

    public Material getMaterial() {
        return this.material;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public double getWholesalePrice(){
        return this.wholesalePrice;
    }

    public void setPrice(double markup){
        this.sellPrice = (this.wholesalePrice * markup);
    }




}
