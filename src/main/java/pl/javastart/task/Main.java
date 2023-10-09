package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Przegląd Sportowy", "Dziennik sportowy", 4.5, "Gazeta");
        Product product2 = new Product("Galaxy Watch6", "Inteligentny zegarek", 1149.0, "Zegarek");
        Product product3 = new Product("Chleb Tostowy", "Świeże pieczywo", 3.2, "Żywność");
        TotalPrice totalPrice = new TotalPrice();
        double product1Price = totalPrice.calculatePrice(product1);
        double product2Price = totalPrice.calculatePrice(product2);
        double product3Price = totalPrice.calculatePrice(product3);
        System.out.printf("Cena produktu 1 wynosi: %.2f zł%n", product1Price);
        System.out.printf("Cena produktu 2 wynosi: %.2f zł%n", product2Price);
        System.out.printf("Cena produktu 3 wynosi: %.2f zł", product3Price);

    }
}
