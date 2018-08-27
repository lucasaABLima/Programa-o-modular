import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public Data() {
        this.setDia(1);
        this.setMes(1);
        this.setAno(2000);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean eAnoBisexto() {
        boolean eBisexto;
        eBisexto = this.getAno() % 4 == 0;
        return eBisexto;
    }

    public void proximoDia() {
        if (this.getMes() == 2) {
            if (eAnoBisexto()) {
                if (this.getDia() == 29) {
                    this.setDia(1);
                    this.setMes(this.getMes() + 1);
                } else {
                    this.setDia(this.getDia() + 1);
                }
            } else {
                if (this.getDia() == 28) {
                    this.setDia(1);
                    this.setMes(this.getMes() + 1);
                } else {
                    this.setDia(this.getDia() + 1);
                }
            }
        }
        if (this.getMes() == 12) {
            if (this.getDia() == 31) {
                this.setDia(1);
                this.setMes(1);
                this.setAno(this.getAno() + 1);
            } else {
                this.setDia(this.getDia() + 1);
            }
        } else {
            if (this.getMes() == 1 || this.getMes() == 3 || this.getMes() == 5 || this.getMes() == 7 || this.getMes() == 8 || this.getMes() == 10) {
                if (this.getDia() == 31) {
                    this.setDia(1);
                    this.setMes(this.getMes() + 1);
                } else {
                    this.setDia(this.getDia() + 1);
                }
            } else {
                if (this.getDia() == 30) {
                    this.setDia(1);
                    this.setMes(this.getMes() + 1);
                } else {
                    this.setDia(this.getDia() + 1);
                }
            }
        }
    }

    public void adicionaDias(int dias) {
        for (int i = 0; i < dias; i++) {
            proximoDia();
        }
    }

    public int diasNoMes() {

        int dias;
        if (this.getMes() == 2) {
            if (eAnoBisexto()) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else {
            if (this.getMes() == 1 || this.getMes() == 3 || this.getMes() == 5 || this.getMes() == 7 || this.getMes() == 8 || this.getMes() == 10 || this.getMes() == 12) {
                dias = 31;
            } else {
                dias = 30;
            }
        }
        return dias;
    }

    public String diaDaSemana() {
        String dia;
        String input_date = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(input_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat dayFormat = new SimpleDateFormat("EEEE");
        dia = dayFormat.format(date);
        return dia;
    }

    public String porExtenso(){
        String extensao = "";
        switch (this.mes){
            case 1:
                extensao = "janeiro";
                break;
            case 2:
                extensao = "fevereiro";
                break;
            case 3:
                extensao = "março";
                break;
            case 4:
                extensao = "abril";
                break;
            case 5:
                extensao = "maio";
                break;
            case 6:
                extensao = "junho";
                break;
            case 7:
                extensao = "julho";
                break;
            case 8:
                extensao = "agosto";
                break;
            case 9:
                extensao = "setembro";
                break;
            case 10:
                extensao = "outubro";
                break;
            case 11:
                extensao = "novembro";
                break;
            case 12:
                extensao = "dezembro";
                break;
        }
        return this.dia + " de " + extensao + " de " + this.ano;
    }
}

