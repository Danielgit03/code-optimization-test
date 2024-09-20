public class TaxCalculation {
   
    private static final double TAX_RATE_PRODUCT_1 = 0.15;
    private static final double TAX_RATE_PRODUCT_2 = 0.10;

    // Constante para el umbral de impuestos altos
    private static final double HIGH_TAX_THRESHOLD = 50.0;

    public static void main(String[] args) {
        
        double[] productPrices = {100.0, 200.0};
        double[] taxRates = {TAX_RATE_PRODUCT_1, TAX_RATE_PRODUCT_2};

        
        if (productPrices.length != taxRates.length) {
            throw new IllegalArgumentException("Product prices and tax rates arrays must be of the same length.");
        }

        
        double totalTax = 0;
        for (int i = 0; i < productPrices.length; i++) {
            totalTax += productPrices[i] * taxRates[i];
        }

       
        if (totalTax > HIGH_TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}