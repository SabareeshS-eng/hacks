import java.util.Scanner; // This class is used to get an input from the user therefor it is imported
abstract class Shape{ //Abstract class to be used to print the area of a shape
protected int a; // Data member that can be used by derived classes
protected int b; // Data member that can be used by derived classes
abstract void printArea(); // Method to print the area
} 
class Rectangle extends Shape{ // Used to print the area of the rectangle
Scanner input=new Scanner(System.in); // Scanner class is used and passed an argument System.in to one argument constructor
@Override //Override annotation is used
void printArea() { 
System.out.println("Enter the length and breadth of the rectangle: "); // Input prompt
a=input.nextInt(); // Input for length is read
b=input.nextInt(); // Input for breadth is read
int area=a*b; // Area of the rectangle is stored
System.out.println("Area of rectangle with length "+a+" and breadth "+b+" is "+area); // Area of the rectangle is printed
} 
} 
class Triangle extends Shape{ // Used to print the area of the Triangle
int c; // Default member data is declared
Scanner input=new Scanner(System.in); // Scanner class is used and passed an argument System.in to one argument constructor
@Override // Override annotation is used
void printArea() { 
System.out.println("Enter the three sides of the triangle:"); // Input prompt
a= input.nextInt(); // Input for side a
b= input.nextInt(); // Input for side b
c= input.nextInt(); // Input for side c
double s=(a+b+c)/2; // Calculation of s
double area=Math.pow(s*(s-a)*(s-b)*(s-c),0.5); // Calculation of area
System.out.println("Area of the triangle is "+area); // Printing of area of triangle
} 
} 
class Circle extends Shape{ // Used to print the area of the circle
Scanner input=new Scanner(System.in); // Scanner class is used and passed an argument System.in to one argument constructor
@Override // Override annotation is used
void printArea() { 
System.out.println("Enter the radius of the circle: "); // Input prompt
a= input.nextInt(); // Getting input for radius
double area=3.14*a*a; // Calculating area of the circle
System.out.println("Area of circle is "+area); // Printing area of the circle
} }
public class ShapeArea { // This class contains main method from which the program starts
public static void main(String[] args){ 
Shape r=new Rectangle(); 
r.printArea(); 
Shape t=new Triangle(); 
t.printArea(); 
Shape c=new Circle(); 
c.printArea(); 
} 
} 
