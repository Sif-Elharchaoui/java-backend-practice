package week1.day2;

public class PricingEngine {

    public static void main(String[] args) {

        // Prediction: calls calculatePrice(double)
        // Reason: only one argument is passed
        double resultOne = calculatePrice(100.0);

        // Prediction: calls calculatePrice(double, double)
        // Reason: two double arguments are passed
        double resultTwo = calculatePrice(100.0, 10.0);

        // Prediction: calls calculatePrice(double, double, double)
        // Reason: three double arguments are passed
        double resultThree = calculatePrice(100.0, 10.0, 5.0);

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
    }

    public static double calculatePrice(double basePrice) {
        return basePrice;
    }

    public static double calculatePrice(double basePrice, double discountPercent) {

        double discountAmount = basePrice * (discountPercent / 100);

        return basePrice - discountAmount;
    }

    public static double calculatePrice(double basePrice, double discountPercent, double taxPercent) {

        double discountAmount = basePrice * (discountPercent / 100);
        double priceAfterDiscount = basePrice - discountAmount;

        double taxAmount = priceAfterDiscount * (taxPercent / 100);

        return priceAfterDiscount + taxAmount;
    }
}