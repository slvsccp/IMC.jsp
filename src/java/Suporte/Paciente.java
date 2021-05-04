package Suporte;

public class Paciente {
    
    private String nome, cpf, sexo, tipo_sangue;
    private float peso, altura;
    private int idade, pressao_min, pressao_max;

    //Construtor
    public Paciente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    // Método GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo_sangue() {
        return tipo_sangue;
    }

    public void setTipo_sangue(String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPressao_min() {
        return pressao_min;
    }

    public void setPressao_min(int pressao_min) {
        this.pressao_min = pressao_min;
    }

    public int getPressao_max() {
        return pressao_max;
    }

    public void setPressao_max(int pressao_max) {
        this.pressao_max = pressao_max;
    }
    
}
