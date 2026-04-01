package DAY_5;

class Car {
    private String Brand;
    private String Model;
    private String Color;
    private int Price;

    Car(String Brand , String Model , String Color , int Price){
        this.Brand = Brand;
        this.Model = Model;
        this.Color = Color;
        this.Price = Price;
    }

    void display(){
        System.out.println("BRAND: " + Brand);
        System.out.println("MODEL: " + Model);
        System.out.println("COLOR: " + Color);
        System.out.println("PRICE: " + Price);
    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "M5" , "Carbon Black" , 25000000);

        c1.display();
        }
    }
    
