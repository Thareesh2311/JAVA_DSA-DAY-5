package DAY_5;

class Rectange {
    private double l;
    private double b;

    Rectange(double l , double b){
        this.l = l;
        this.b = b;
    }

    double area(){
        return l * b;
    }

    void display(){
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
    }

    public static void main(String[] args) {
        Rectange r1 = new Rectange(23, 34);
        r1.display();
        System.out.println("Area of the rectangle: "+ r1.area());
    }
}
