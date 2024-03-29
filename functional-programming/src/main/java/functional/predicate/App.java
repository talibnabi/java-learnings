package functional.predicate;

public class App {
    public static void main(String[] args) {
        boolean check = _Predicate.isValidPhoneNumberStartAndLen
                .test("0708312165");
        boolean check2 = _Predicate.isValidPhoneNumberStartAndLen
                .and(_Predicate.isValidPhoneNumberContains)
                .test("0708312165");
        boolean check3 = _Predicate.isValidPhoneNumberStartAndLen.negate().test("0708312165");
        boolean check4 = _Predicate.isValidPhoneNumberStartAndLen
                .or(_Predicate.isValidPhoneNumberContains)
                .test("0708312165");
        boolean check5 = _Predicate.customerPredicate.
                test(new Customer("Talib", 166));
        boolean check6 = _Predicate.customerBiPredicate
                .test(new Customer("Talib", 166), 166);
        System.out.println(check6);
    }
}
