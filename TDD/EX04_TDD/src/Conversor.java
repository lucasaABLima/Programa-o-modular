public class Conversor {
    private static final double pes = 3.28084;
    private static final double polegadas = 39.3701;

    public Conversor(){

    }

    public double converterPesParaMetros(double valor){
        double valorSaida;
        valorSaida = Math.round(valor/this.pes);
        return valorSaida;
    }

    public double converterPesParaPolegadas(double valor){
        double valorSaida;
        valorSaida = Math.round((valor * this.polegadas)/this.pes);
        return valorSaida;
    }

    public double converterPesParaCentimetros(double valor){
        double valorSaida;
        valorSaida = Math.round((valor * 100)/this.pes);
        return valorSaida;
    }

    public double converterPolegadasParaMetros(double valor){
        double valorSaida;
        valorSaida = Math.round(valor/this.polegadas);
        return valorSaida;
    }

    public double converterPolegadasParaPes(double valor){
        double valorSaida;
        valorSaida = Math.round((valor * this.pes)/this.polegadas);
        return valorSaida;
    }

    public double converterPolegadasParaCentimetros(double valor){
        double valorSaida;
        valorSaida = Math.round((valor * 100)/this.polegadas);
        return valorSaida;
    }

    public double converterMetrosParaPes(double valor){
        double valorSaida;
        valorSaida = Math.round(valor * this.pes);
        return valorSaida;
    }

    public double converterMetrosParaPolegadas(double valor){
        double valorSaida;
        valorSaida = Math.round(valor * this.polegadas);
        return valorSaida;
    }

    public double converterMetrosParaCentimetros(double valor){
        double valorSaida;
        valorSaida = Math.round(valor * 100);
        return valorSaida;
    }

    public double converterCentimetrosParaPes(double valor){
        double valorSaida;
        valorSaida = Math.round((valor * this.pes)/100);
        return valorSaida;
    }

    public double converterCentimetrosParaPolegadas(double valor){
        double valorSaida;
        valorSaida = Math.round((valor * this.polegadas)/100);
        return valorSaida;
    }

    public double converterCentimetrosParaMetros(double valor){
        double valorSaida;
        valorSaida = Math.round(valor/100);
        return valorSaida;
    }
}
