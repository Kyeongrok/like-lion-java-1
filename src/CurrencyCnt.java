public class CurrencyCnt {
    public static void main(String[] args) {
        int cur50000 = 50000;
        int cur10000 = 10000;
        int cur5000 = 5000;
        int cur1000 = 1000;
        int cur500 = 500;
        int cur100 = 100;
        int cur50 = 50;
        int cur10 = 10;

        int refund = 25890;
        System.out.printf("입력 금액 : %d\n", refund);

        System.out.printf("%d원 : %d개\n", cur50000, refund/cur50000);
        refund %= cur50000;
        System.out.printf("%d원 : %d개\n", cur10000, refund/cur10000);
        refund %= cur10000;
        System.out.printf("%d원 : %d개\n", cur5000, refund/cur5000);
        refund %= cur5000;
        System.out.printf("%d원 : %d개\n", cur1000, refund/cur1000);
        refund %= cur1000;
        System.out.printf("%d원 : %d개\n", cur500, refund/cur500);
        refund %= cur500;
        System.out.printf("%d원 : %d개\n", cur100, refund/cur100);
        refund %= cur100;
        System.out.printf("%d원 : %d개\n", cur50, refund/cur50);
        refund %= cur50;
        System.out.printf("%d원 : %d개\n", cur10, refund/cur10);
    }
}
