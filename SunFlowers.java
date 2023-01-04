
/**
 * Write a description of class SunFlowers here.
 *
 * @Umasathvik Pantham
 * @02/06/2021
 */
public class SunFlowers
{
    public static void main(String[] args)
    {
        Picture pic = new Picture("sunflowers.jpg");
        
        pic.draw();
        
        System.out.print("X-coordinate: ");
        System.out.println(pic.getX());
        System.out.print("Y-coordinate: ");
        System.out.println(pic.getY());
        System.out.print("Width: ");
        System.out.println(pic.getWidth());
        System.out.print("Height: ");
        System.out.println(pic.getHeight());
        
        pic.grow(-400, -500);
        
        System.out.print("X-coordinate: ");
        System.out.println(pic.getX());
        System.out.print("Y-coordinate: ");
        System.out.println(pic.getY());
        System.out.print("Width: ");
        System.out.println(pic.getWidth());
        System.out.print("Height: ");
        System.out.println(pic.getHeight());
        
        pic.translate(-400, -500);
        
        System.out.print("X-coordinate: ");
        System.out.println(pic.getX());
        System.out.print("Y-coordinate: ");
        System.out.println(pic.getY());
        System.out.print("Width: ");
        System.out.println(pic.getWidth());
        System.out.print("Height: ");
        System.out.println(pic.getHeight());
        
    }
}