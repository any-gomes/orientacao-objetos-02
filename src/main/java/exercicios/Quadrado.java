package exercicios;

public class Quadrado {
    private Double lado;

    public void setLado(Double lado) {
        if(lado <= 0){
            throw new IllegalArgumentException("Lado deve ser positivo");
        }
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public Double calcularArea(){
        return lado * lado;
    }
    public Double calcularPerimetro(){
        return lado * 4;
    }
}
