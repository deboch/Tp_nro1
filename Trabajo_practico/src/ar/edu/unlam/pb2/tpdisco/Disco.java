package ar.edu.unlam.pb2.tpdisco;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	private final Double PI=3.14;
	
	
	public Disco(Double radioInterior, Double radioExterior ){
		this.radioExterior=radioExterior;
		this.radioInterior=radioInterior;
		
	}
   
	public Double getRadioInterior(){
		return this.radioInterior;
		
	}
	
	public Double getRadioExterior(){
		return this.radioExterior;
		
	}
	public Double getPerimetroInterior(){
		return 2*PI*radioInterior;
	}
	
    public Double getPerimetroExterior(){
		return 2*PI*radioExterior;
	}
    
    public Double getSuperficie(){
    	return PI*(radioExterior*radioExterior); 
    }
}
