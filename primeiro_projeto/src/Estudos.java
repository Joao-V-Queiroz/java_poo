public class Estudos {
    public String anotacoes;
    public String materia;

    // Construtor
    public Estudos(String anotacoes, String materia) {
        this.anotacoes = anotacoes;
        this.materia = materia;
    }

    // getters e setters
    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String toString() {
        return "Anotações: " + anotacoes + ", Matéria: " + materia;
    }

}
