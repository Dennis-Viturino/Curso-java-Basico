package src.dennis.programas.exerciciosdepoo.aula33exercicios.exer01;

public class Lampada {

    private String modelo;
    private String tensão;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantia;
    private String[] tipos;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String modelo, String tensão, int potencia, String cor, String tipoLuz, int garantia, String[] tipos,
            boolean ligada) {
        this.modelo = modelo;
        this.tensão = tensão;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantia = garantia;
        this.tipos = tipos;
        this.ligada = ligada;
    }

    public void ligarLampada() {
        setLigada(true);
    }

    public void desligarLampada() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligarLampada();
        } else {
            ligarLampada();
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensão() {
        return tensão;
    }

    public void setTensão(String tensão) {
        this.tensão = tensão;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
