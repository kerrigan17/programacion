public class MyMath {
    public static double squarePerimeter(double lado){
        if (lado < 0){
            return 0;

        }else {
            return lado*4;
        }
    }
    public static double squareArea(double base) {
        if (base<0){
            return 0;
        }else {
            return  base * base;
        }
    }
    public static double rectanglePerimeter(double base, double altura){
        if (base <= 0 || altura <=0){
            return 0;
        }else {
            return 2*base + 2*altura;
        }
    }
}
