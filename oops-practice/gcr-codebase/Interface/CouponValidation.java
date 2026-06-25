interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        if (!CouponValidator.isLengthValid(code))
            return false;

        return code.startsWith("SAVE");
    }
}

public class CouponValidation {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "SAVE50",
                "ABC",
                "SAVE100",
                "DISCOUNT"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {

            if (cart.validateCoupon(code))
                System.out.println(code + " -> Valid Coupon");
            else
                System.out.println(code + " -> Invalid Coupon");
        }
    }
}
