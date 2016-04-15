package trianguloTest;

import org.junit.Assert;
import org.junit.Test;

import triangulo.Triangulo;



public class TrianguloTest{

	@Test
	public void perimetroTest() {
		Triangulo triangulito = new Triangulo();
		Integer resulEsperado = 16;
		
		Integer resulObtenido = triangulito.perimetro(4);
		
		Assert.assertEquals(resulEsperado,resulObtenido);
	}

	@Test
	public void areaTest() {
		Triangulo triangulito = new Triangulo();
		Integer resulEsperado = 16;
		
		Integer resulObtenido = triangulito.area(4);
		
		Assert.assertEquals(resulEsperado,resulObtenido);
	}
}
