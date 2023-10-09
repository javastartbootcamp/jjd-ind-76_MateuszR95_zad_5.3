package pl.javastart.task;

public class TotalPrice {

    public double calculatePrice(Product product) {

        double totalPrice = 0;
        switch (product.getCategory()) {
            case "Gazeta" -> totalPrice = product.getNetPrice() + 0.23 * product.getNetPrice();
            case "Zegarek" -> totalPrice = product.getNetPrice() + 0.08 * product.getNetPrice();
            default -> totalPrice = product.getNetPrice() + 0.05 * product.getNetPrice();

        } return totalPrice;
    }

}
