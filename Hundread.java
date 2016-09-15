class Hundread
{
public static void main(String args[])
{
    print(0);
}

private static void print(int i)
{
    System.out.println((i % 100) + 1);
    print(i+1);
}
