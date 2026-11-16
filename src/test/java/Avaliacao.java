public class Avaliacao {
    public double calcularMedia(double nota1, double nota2) {
        validarNota(nota1);
        validarNota(nota2);
        return (mota1 + nota2) / 2;
    }
    public String verificarSituacao(double media) {
        if (media >= 7 ) {
            return "APROVADO"
        } else if (media >= 5) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO"
        }
    
    }
    public boolean notaValida (double nota) {
        return nota >= 0 && nota <= 10;
    }
    private void validarNota(double nota){
        if (!notaValida(nota)) {
            throw new IllegalArgumentException("Nota inválida. A nota deve estar entre 0 e 10.")
        }
    }
}