package DAY_5;

class Mobile {
    private String Brand;
    private String Model;
    private int Price;

    Mobile(String Brand , String Model , int Price){
        this.Brand = Brand;
        this.Model = Model;
        this.Price = Price;
    }

    void display(){
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Price: " + Price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "S21fe", 60000);

        m1.display();
    }


}


