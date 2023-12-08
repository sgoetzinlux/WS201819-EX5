// ******************* Part 1

class A {
        static int i;
        static
        {
            System.out.println(1);
            i = 100;
        }
    }
    class StaticInitializationBlock {
        static
        {
            System.out.println(2);
        }
        public static void main(String[] args)
        {
            System.out.println(3);
            System.out.println(A.i);
        }
    }


// ******************* Part 2
/*
class A
{
    int i;
    static
    {
        System.out.println(i);
    }
}
*/
// ******************* Part 3
/*
class A
{
    static int first;
    static String second;
    static
    {
        System.out.println(1);
        first = 100;
    }
    static
    {
        System.out.println(2);
        second = "SECOND";
    }
}
class StaticInitializationBlock
{
    static
    {
        System.out.println(3);
    }
    public static void main(String[] args)
    {
        System.out.println(4);
        System.out.println(A.first);
        System.out.println(A.second);
    }
}
*/
