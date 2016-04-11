package cuadradoTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cuadrado.Cuadrado;

public class CuadradoTest {

	@Test
	public void calcularPerimetro() {
		
		Cuadrado cuadradito = new Cuadrado ();
		Integer resulEsperado = 16;
		
		Integer resulObtenido = cuadradito.perimetro(4);
		
		Assert.assertEquals(resulEsperado, resulObtenido);
		
		
	}

	
	@Test
	public void calcularArea(){
		
		Cuadrado cuadradito = new Cuadrado();
		Integer resulEsperado = 16;
		
		Integer resulObtenido = cuadradito.area(4);
		
		Assert.assertEquals(resulEsperado, resulObtenido);
		
	}
}
