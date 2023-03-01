public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped<5  ?  1:0.85;
    }
    public int multiplierPerProductsSold(int productsSold) {
        return productsSold>20 ? 13:10;
    }
    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }
    public double finalSalary(int daysSkipped, int productsSold) {
        double result = (1000 * multiplierPerDaysSkipped(daysSkipped) )+bonusForProductSold(productsSold);
        return result>2000 ? 2000:result;
    }
}
