import org.junit.Test;

public class CalculatorTest {

    @Test
    public void IsTrueTheSum(){
        Calculator cal = new Calculator();
        int result = cal.add(5,3);
        assert result ==5;
    }
}
