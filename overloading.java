class Addition{
	static int Add(int a,int b)
        {
                return a + b;
        }
    static int Add(int a,int b,int c)
        {
                return a + b + c;
        }
    static Double Add(Double a,Double b)
        {
                return(a + b);
        }
}
public class overloading
    {
        
        public static void main(String arg[])
        {
            System.out.println(Addition.Add(1,2));
            System.out.println(Addition.Add(1, 2, 5));
            System.out.println(Addition.Add(1.5, 5.1));
        }
    }
/*
3
8
6.6
	
*/
