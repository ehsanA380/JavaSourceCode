package com.company;

public class Square extends  shape {
    Square(int dim1){
        super(dim1,-1);
    }
    public int area(){
        return this.dim1 * this.dim1;
    }

    public static void main(String[] args) {
        Square sq= new Square(2);
        System.out.println(sq.area());
    }
}
