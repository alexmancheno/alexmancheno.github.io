class Main14_1 
{
    public static void main(String[] args) 
    {
        String s = "a";
        change(s);
        System.out.println(s);

        A a = new A();
        change(a);
        System.out.println(a.name);
    }

    public static void change(String s) 
    {
        s = "z";
    }

    public static void change(A a) 
    {
        a.name = "z";
    }
}

class A 
{
    public String name;

    public A() 
    {
        this.name = "a";
    }
}