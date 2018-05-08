package junit.model;

public final class Cafe
{
    private int beansInStock;
    private int milkInStock;

    public Coffee brew(CoffeeType coffeeType)
    {
        return brew(coffeeType,1);
    }

    public int getBeansInStock() {
        return beansInStock;
    }

    public void setBeansInStock(int beansInStock) {
        this.beansInStock = beansInStock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }

    public void setMilkInStock(int milkInStock) {
        this.milkInStock = milkInStock;
    }

    private Coffee brew(CoffeeType coffeeType, int quantity)
    {
        requirePositiveQuantity(quantity);

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;

        if(requiredBeans > beansInStock || requiredMilk > milkInStock)
        {
            throw new IllegalStateException("Insufficient milk and beans");
        }

        beansInStock -= requiredBeans;
        requiredMilk -= requiredMilk;

        return new Coffee(coffeeType,requiredBeans,requiredMilk);
    }

    private void requirePositiveQuantity(int quantity)
    {
        if(quantity < 1)
        {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
    }

    public void restockBeans(int weightInGrams)
    {
        requirePositiveQuantity(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams)
    {
        requirePositiveQuantity(weightInGrams);
        milkInStock += weightInGrams;
    }


}
