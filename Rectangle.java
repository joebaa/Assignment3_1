
public class Rectangle {
    double width, height;
   
   
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
   
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
   
    public static void main(String[] args) {
        
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter");
        
        Rectangle rect1 = new Rectangle(40,4);
       
        Rectangle rect2 = new Rectangle(5,3.5);
        
        System.out.printf("Rectangle 1: height = %.2f width = %.2f area = %.2f perimeter = %.2f ",rect1.getHeight(),rect1.getWidth(), rect1.getArea(), rect1.getPerimeter());
        System.out.printf("Rectangle 2: height = %.2f width = %.2f area = %.2f perimeter = %.2f ",rect2.getHeight(),rect2.getWidth(), rect2.getArea(), rect2.getPerimeter());
        System.out.print("Goodbye");
    }
 
 }
 
 