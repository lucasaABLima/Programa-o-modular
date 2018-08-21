public class Conta {
    private int numConta, saldo;

    public Conta(int numConta, int saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Conta(){
        this.numConta = 0;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int quantia){
        this.saldo = this.saldo + quantia;
    }

    public boolean sacar(int quantia){
        boolean possuiSaldoSuficiente;
        if (this.saldo - quantia < 0){
            possuiSaldoSuficiente = false;
        }else{
            this.saldo = this.saldo - quantia;
            possuiSaldoSuficiente = true;
        }
        return possuiSaldoSuficiente;
    }
}
