package trianguloTest;

import org.junit.Assert;
import org.junit.Test;

import triangulo.Triangulo;



public class TrianguloTest{

	@Test
	public void perimetroTest() {
		Triangulo triangulito = new Triangulo();
<<<<<<< HEAD
		Integer resulEsperado = 16;
=======
		Integer resulEsperado = 12;
>>>>>>> 6b7e1de342e50d2120727547ff3bf4eee48be60a
		
		Integer resulObtenido = triangulito.perimetro(4);
		
		Assert.assertEquals(resulEsperado,resulObtenido);
	}

	@Test
	public void areaTest() {
		Triangulo triangulito = new Triangulo();
<<<<<<< HEAD
		Integer resulEsperado = 16;
		
		Integer resulObtenido = triangulito.area(4);
=======
		Integer resulEsperado = 4;
		
		Integer resulObtenido = triangulito.area(4, 2);
>>>>>>> 6b7e1de342e50d2120727547ff3bf4eee48be60a
		
		Assert.assertEquals(resulEsperado,resulObtenido);
	}
}
