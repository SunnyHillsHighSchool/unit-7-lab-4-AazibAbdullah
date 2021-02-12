//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aazib Abdullah

//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
//private instance variable (must be an Integer)
  private int num;
//constructor
  public Number()
  {
    num = 0;
  }
  //
  public Number(int n)
  {
    num = n;
  }
//getter method
  public int getNum()
  {
    return num;
  }
//setter method
  public void setNumber(int nn)
  {
    num = nn;
  }
//isOdd method
public boolean isOdd()
{
  boolean b = false;
  // If the remainder of num % 2 is 1, return it.
  if (num % 2 == 1)
  {
    b = true;
  }
  return b;
}
//isPerfect method
public boolean isPerfect()
{
  int sum = 0;
  for (int i = 1; i < num; i++)
  {
    if (num % i == 0)
    {
      sum = sum + i;
    }
  }
  if (sum == num)
  {
    return true;
  }
  return false;
}
//toString
public String toString()
{
  return "The number " + num;
}
}