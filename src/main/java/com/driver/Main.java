package com.driver;

public class Main {
    public static class Produt{
        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
    public static void main(String[] args){
        Produt p=new Produt();
        p.product(4,5);
        p.product(2,3,5);
        p.product(6.2,2.5);
    }




}