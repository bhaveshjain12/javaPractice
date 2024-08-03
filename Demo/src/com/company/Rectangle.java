package com.company;

public class Rectangle {
    public static  void main(String args[]){
        A a=new A();
        //a.setValues(100,2);
        int x=100, y=5;
        a.setLength(x);
        a.setWidth(y);
        a.area();
        a.perimeter();

        System.out.println(a);
    }

}
class A{
    int length,width;
    void area(){
        System.out.println("Area of rectangle: " + length* width);
    }
    void perimeter(){
        System.out.println("Area of  perimeter: "+ 2*(length+width));
    }
//    void setValues(int l, int w){
//        length=l;
//        width=w;
//    }
    void setLength(int l){
        length=l;
    }
    void setWidth(int w){
        width=w;
    }
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }
}

