//Boston Learned


import java.util.*;

public class Oasis
{
  //Most variables are longs because of extra large input
  public static long dx;
  public static long dy;
  // The main method
  public static void main (String[]Args)
  {

    // The simple way to read from standard input
    Scanner sc = new Scanner (System.in);

    // Read in the number of boxes
    int n = sc.nextInt ();

      Oasis.dx = sc.nextInt ();
      Oasis.dy = sc.nextInt ();

      ArrayList < Box > bs = new ArrayList < Box > ();	// The ArrayList based approach

    // Read in and add the box to our group of boxes
    for (int i = 0; i < n; i++)
      {
	long x = sc.nextInt ();
	long y = sc.nextInt ();
	String name = sc.next ();
	Box newBox = new Box (x, y, name);
	  bs.add (newBox);
      }

    Collections.sort (bs);	// for ArrayLists

  for (Box b:bs)
      {
	System.out.println (b);
      }
  }

  // Our Box class the implements the Comparable interface
  public static class Box implements Comparable < Box >
  {
    long x, y;
    String name;

    // the box constructor
      Box (long x, long y, String name)
    {
      this.x = x;
      this.y = y;
      this.name = name;
    }

    // Method to compute the volume
    long getVolume ()
    {
      long disx = Oasis.dx - x;
      long disy = Oasis.dy - y;
      long ret = ((disx * disx) + (disy * disy));
      return ret;

    }

    // Our comparison method
    public int compareTo (Box o)
    {
      return Long.compare (getVolume (), o.getVolume ());
    }
    public String toString ()
    {
      return name;
    }
  }
}
