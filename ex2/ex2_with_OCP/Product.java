public class Product
{
    public String name;
    public Color color;
    public Size size;
    public Price price; //add price attribute

    public Product(String name, Color color, Size size, Price price)
    {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price; //define price
    }
}