class Sandwich 
{
    private String MainIngredient;
    private String Bread;
    private double Price;

    public void setMainIngredient(String Igredient)
    {
        MainIngredient = Igredient;
    }
    public void setBread(String bread)
    {
        Bread = bread;
    }
    public void setPrice(double price)
    {
        Price = price;
    }

    public String getMainIngredient()
    {
        return MainIngredient;
    }
    public String getBread()
    {
        return Bread;
    }
    public double getPrice()
    {
        return Price;
    }
}
