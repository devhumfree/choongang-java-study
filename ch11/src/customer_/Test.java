package customer;

public class Test {
public static void main(String[] args) {
int money = 498000;
int [] coinUnit = {50000, 10000, 5000, 1000};
for (int i = 0; i < coinUnit.length ;i++) {
    System.out.printf("%d원짜리 %d개 \n",coinUnit[i], money / coinUnit[i] );
    money %= coinUnit[i];
    }
}
}
