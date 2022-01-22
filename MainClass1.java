class MainClass1
{
    public static void main(String[] args)
    {
        Rectangle hello = new Rectangle();
        hello.length = 23;
        hello.breadth = 23;
        hello.area = hello.length * hello.breadth;
        System.out.println("length of rectangle is " + hello.length);
        System.out.println("breadth of rectangle is " + hello.breadth);
        System.out.println("area of rectangle is " + hello.area);      
    }
}