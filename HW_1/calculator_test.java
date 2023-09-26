package HW_1;
import HW_1.calculator;
import static org.assertj.core.api.Assertions.*;


public class calculator_test {
    public static void main(String[] args) {

        assert 4500.00 == calculator.calculate_discount(5_000.00, 10);
        assert 970.00 == calculator.calculate_discount(1000.00, 3);
        assert 4950.00 == calculator.calculate_discount(5000.00, 5);


        assertThat(calculator.calculate_discount(5000.00, 10)).isEqualTo(4500.00);
        assertThat(calculator.calculate_discount(5000.00, 5)).isEqualTo(4750.00);
        assertThat(calculator.calculate_discount(5000.00, 1)).isEqualTo(4950.00);

        try {
            calculator.calculate_discount(-1.0, -1);
        } catch (ArithmeticException e) {
            assertThatThrownBy(() ->
                    calculator.calculate_discount(0, -1)).isInstanceOf(ArithmeticException.class);
        }
        assertThatThrownBy(() ->
                calculator.calculate_discount(10, -5)).isInstanceOf(ArithmeticException.class);
    }
}