public enum KeyboardItem {

    YAM01(KeyboardBrand.YAMAHA, 100.0),
    YAM02(KeyboardBrand.YAMAHA, 200.0),
    NOV01(KeyboardBrand.NOVATION,500.0),
    NOV02(KeyboardBrand.NOVATION,1000.0),
    ROL01(KeyboardBrand.ROLAND,50.0),
    ROL02(KeyboardBrand.ROLAND,75.0);

    private final KeyboardBrand brand;
    private final double price;

    KeyboardItem(KeyboardBrand brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public KeyboardBrand getBrand(){
        return this.brand;
    }


}
