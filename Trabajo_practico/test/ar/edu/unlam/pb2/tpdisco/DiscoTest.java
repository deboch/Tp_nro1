package ar.edu.unlam.pb2.tpdisco;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {


	@Test
	
	public void testQueSeDeAConocerElRadioInterior(){
		
		Disco miDisco=new Disco(2.0, 4.0);
		Double radioEsperado=2.0;
		Double radioObtenido=miDisco.getRadioInterior();
        Assert.assertEquals(radioEsperado,radioObtenido);
		
		
	}
       @Test
	
	    public void testQueSeDeAConocerElRadioExterior(){
		
    	   Disco  miDisco=new Disco (2.0, 4.0);
		Double radioEsperado=4.0;
		Double radioObtenido=miDisco.getRadioExterior();
        Assert.assertEquals(radioEsperado,radioObtenido);
		
		
	}
        @Test 
        public void testQueMuestreElPerimetroInteriorCorrecto(){
        	Disco  miDisco=new Disco (2.0, 4.0);
               Double perimetroInteriorEsperado=12.56;
               Double perimetroInteriorObtenido=miDisco.getPerimetroInterior();
               Assert.assertEquals(perimetroInteriorEsperado,perimetroInteriorObtenido);


        }
          @Test 
          public void testQueMuestreElPerimetroExteriorCorrecto(){
        	  Disco  miDisco=new Disco (2.0, 4.0);
               Double perimetroExteriorEsperado=25.12;
               Double perimetroExteriorObtenido=miDisco.getPerimetroExterior();
               Assert.assertEquals(perimetroExteriorEsperado,perimetroExteriorObtenido);
}
            @Test 
            public void testQueMuestreLaSuperficieCorrecta(){
            	Disco  miDisco=new Disco (4.0, 8.0);
               Double superficieEsperada=200.96;
               Double superficieObtenido=miDisco.getSuperficie();
               Assert.assertEquals(superficieEsperada,superficieObtenido);
    }

}




