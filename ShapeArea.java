import java.util.Scanner; 
abstract class Shape{ 
protected int a; 
protected int b; 
abstract void printArea(); 
} 
class Rectangle extends Shape{ 
Scanner input=new Scanner(System.in); 
@Override 
void printArea() { 
System.out.println("Enter the length and breadth of the rectangle: "); 
a=input.nextInt(); 
b=input.nextInt(); 
int area=a*b; 
System.out.println("Area of rectangle with length "+a+" and breadth "+b+" is "+area); 
} 
} 
class Triangle extends Shape{ 
int c; 
Scanner input=new Scanner(System.in); 
@Override 
void printArea() { 
System.out.println("Enter the three sides of the triangle:"); 
a= input.nextInt(); 
b= input.nextInt(); 
c= input.nextInt(); 
double s=(a+b+c)/2; 
double area=Math.pow(s*(s-a)*(s-b)*(s-c),0.5); 
System.out.println("Area of the triangle is "+area); 
} 
} 
class Circle extends Shape{ 
Scanner input=new Scanner(System.in); 
@Override 
void printArea() { 
System.out.println("Enter the radius of the circle: "); 
a= input.nextInt(); 
double area=3.14*a*a; 
System.out.println("Area of circle is "+area); 
} }
public class ShapeArea { 
public static void main(String[] args){ 
Shape r=new Rectangle(); 
r.printArea(); 
Shape t=new Triangle(); 
t.printArea(); 
Shape c=new Circle(); 
c.printArea(); 
} 
} 
