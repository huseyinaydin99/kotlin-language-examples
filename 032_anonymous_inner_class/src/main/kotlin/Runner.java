public class Runner
{
    public static  void main(String[] args)
    {

        Human programmer = new Human()
        {
            public void think()
            {
                System.out.println("Think Virtually....");
            }
        };

        programmer.think();
    }
}