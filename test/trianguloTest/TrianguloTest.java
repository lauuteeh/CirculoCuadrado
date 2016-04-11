package trianguloTest;

import org.junit.Assert;
import org.junit.Test;

import triangulo.Triangulo;



public class TrianguloTest{

	@Test
	public void perimetroTest() {
		Triangulo triangulito = new Triangulo();
		Integer resulEsperado = 12;
		
		Integer resulObtenido = triangulito.perimetro(4);
		
		Assert.assertEquals(resulEsperado,resulObtenido);
	}

	@Test
	public void areaTest() {
		Triangulo triangulito = new Triangulo();
		Integer resulEsperado = 4;
		
		Integer resulObtenido = triangulito.area(4, 2);
		
		Assert.assertEquals(resulEsperado,resulObtenido);
	}
}
