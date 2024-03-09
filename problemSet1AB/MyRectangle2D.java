package problemSet1AB;

public class MyRectangle2D {
    double x;
    double y;
    double width;
    double height;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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

    public MyRectangle2D(){
        x=0;
        y=0;
        width=1;
        height=1;
    }
    public MyRectangle2D(double x, double y, double width, double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width+2*height;
    }
    public boolean contains(double x, double y){
        boolean inX=(x<=(this.x+width)) && (x>=(this.x-width));
        boolean inY=(y<=(this.y+height)) && (y>=(this.y-height));
        return inX && inY;
    }
    public boolean contains(MyRectangle2D r){
        boolean botL=this.contains(r.x-r.width,r.y-r.height);
        boolean botR=this.contains(r.x+r.width,r.y-r.height);
        boolean topL=this.contains(r.x-r.width,r.y+r.height);
        boolean topR=this.contains(r.x+r.width,r.y+r.height);
        return botL && botR && topL && topR;
    }
    public boolean overlaps(MyRectangle2D r){
        boolean botL=this.contains(r.x-r.width,r.y-r.height);
        boolean botR=this.contains(r.x+r.width,r.y-r.height);
        boolean topL=this.contains(r.x-r.width,r.y+r.height);
        boolean topR=this.contains(r.x+r.width,r.y+r.height);
        return botL || botR || topL || topR;
    }

    public static void main(String[] args) {
        MyRectangle2D r =new MyRectangle2D();
        System.out.println(r.contains(1,1));
    }

}

