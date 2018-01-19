public enum GuitarItem {

    YAM01(GuitarBrand.YAMAHA, 100.0),
    YAM02(GuitarBrand.YAMAHA, 200.0),
    MAP01(GuitarBrand.MAPEX,500.0),
    MAP02(GuitarBrand.YAMAHA,1000.0),
    PEA01(GuitarBrand.PEARL,50.0),
    PEA02(GuitarBrand.PEARL,75.0);

    private final GuitarBrand brand;
    private final double price;

    GuitarItem(GuitarBrand brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public GuitarBrand getBrand(){
        return this.brand;
    }


}
