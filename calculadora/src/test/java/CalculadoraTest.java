import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.example.Calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test

    public void Soma(){
        assertEquals(15.0, Calculadora.soma(10.0,5.0), 0);
    }
    @Test
    public void subtracao(){
        assertEquals(5.0, Calculadora.subtracao(10, 5), 0);
    }
    @Test
    public void multiplicacao(){
        assertEquals(50.0, Calculadora.multiplicacao(10.0, 5.0), 0);
    }
    @Test
    public void divisao(){
        assertEquals(2.0, Calculadora.divisao(10.0, 5.0),0);
    }
}