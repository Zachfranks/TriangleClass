package com.company;

public class TryangleClass {

    //class variubles
    private int A =0,B=0,C=0;

    //creating the class
    public TryangleClass(int A,int B,int C){
        this.A = A;this.B = B;this.C = C;
    }

    //getting all the sides
    public int GetA(){
        return A;
    }
    public double GetB(){
        return B;
    }
    public double GetC(){
        return C;
    }

    //get the area
    public double GetArea(){
        if (IsTriangleValid()){
            double s = 0.5*(A + B +C);
            return Math.sqrt(s* (s-A) * (s-B) * (s-C));
        }else {
            return 0;
        }
    }

    //get the permiter
    public double GetPerminter(){
        if (IsTriangleValid()){
            return A + B + C;
        }else {
            return 0;
        }
    }

    //get the type of tryangle
    public String GetType(){
        double A2 = A*A,B2=B*B,C2 =C*C;
        if ((A2 + B2 < C2)
                ||(B2 + C2 < A2)
                ||(C2 + A2 < B2)){
            return "obtuse";
        }
        else if ((A2 + B2 > C2)
                &&(B2 + C2 > A2)
                &&(C2 + A2 > B2)) {
            return "acute";
        }
        else if ((A2 + B2 == C2)
                ||(B2 + C2 == A2)
                ||(C2 + A2 == B2)) {
            return "square";
        }
        return "error";
    }

    //get the radius inside the circle
    public double GetInRaduis(){
        double area = GetArea();
        double s = (A+B+C)/2;
        return area/s;
    }

    // get the radius outside the circle
    public double GetCircumArea(){
        double r = GetInRaduis();
        double s = (A+B+C)/2;
        double radius = (A * B * C)/(4 * r * s);
        return Math.PI * (radius * radius);
    }

    //finding the height
    public double GetHeight(){
        double area = GetArea();
        int base = Math.max(Math.max(A,B),C);
        return 2 * area / base;
    }

    //checking if its a real tryangle
    protected Boolean IsTriangleValid(){
        return (B+ C > A);
    }
}
