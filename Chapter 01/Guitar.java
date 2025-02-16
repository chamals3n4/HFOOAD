public class Guitar {
    private String serialNumber;
    private double price;
    //private String model;
    //private Builder builder;
    //private Type type;
    //private Wood backWood,topWood;
    GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        //this.builder = builder;
        //this.model = model;
        //this.type = type;
        //this.backWood = backWood;
        //this.topWood = topWood;

        //this.spec = new GuitarSpec(model,builder,type,backWood,topWood); //v1
        this.spec= spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }

//    public Builder getBuilder() {
//        return builder;
//    }
//    public String getModel() {
//        return model;
//    }
//    public Type getType() {
//        return type;
//    }
//    public Wood getBackWood() {
//        return backWood;
//    }
//    public Wood getTopWood() {
//        return topWood;
//    }
    public GuitarSpec getSpec() {
        return spec;
    }
}