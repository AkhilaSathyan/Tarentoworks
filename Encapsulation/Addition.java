public class Addition{
private int sum;
public void settotal(int a, int b){
sum = a + b;
}
public void gettotal()
{
System.out.println("Addition of two numbers:" +sum );
}
public static void main(String []args){
Addition add = new Addition ();
add.settotal(10, 20);
add.gettotal();
}
}