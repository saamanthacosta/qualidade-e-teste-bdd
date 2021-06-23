package steps.stepDefinition;

import bdd.Triangulo;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


public class TrianguloStepDefinition {
    int x;
    int y;
    int z;
    String resultado;

    @Dado("tres numeros {int}, {int} e {int}")
    public void tresNumerosXYEZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Quando("verifico se eles formam um triangulo")
    public void verificoSeElesFormamUmTriangulo() {
        resultado = Triangulo.verificaTriangulo(x, y, z);
    }

    @Entao("nao formam um triangulo")
    public void naoEhTriangulo() {
        Assert.assertEquals(resultado, "Nao eh um triangulo");
    }

    @Entao("formam um triangulo escaleno")
    public void oTrianguloEhEscaleno() {
        Assert.assertEquals(resultado, "O triangulo eh escaleno");
    }

    @Entao("formam um triangulo equilatero")
    public void oTrianguloEhEquilatero() {
        Assert.assertEquals(resultado, "O triangulo eh equilatero");
    }

    @Entao("formam um triangulo isosceles")
    public void oTrianguloEhIsosceles() {
        Assert.assertEquals(resultado, "O triangulo eh isosceles");
    }

}
