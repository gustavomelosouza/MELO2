public class Funcionario {
    private String nome;
    private double salario;
    private char nivel; // T, J, P ou S
    private boolean afastado;
    
    // Construtor
    public Funcionario(String nome, double salario, char nivel) {
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
        this.afastado = false;
        
        // Garante que o salário não seja menor que o mínimo
        if (this.salario < 1518.0) {
            this.salario = 1518.0;
        }
    }
    
    // Método para apresentar os dados do funcionário
    public void apresentarFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("Nível: " + nivel);
        System.out.println("Afastado: " + (afastado ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
    
    // Método para apontar falta (reduz salário em 10%)
    public void apontarFalta() {
        if (!afastado) {
            double novoSalario = salario * 0.9;
            if (novoSalario >= 1518.0) {
                salario = novoSalario;
                System.out.println(nome + " teve falta apontada. Novo salário: R$ " + String.format("%.2f", salario));
            } else {
                System.out.println("Não é possível reduzir o salário de " + nome + " abaixo do mínimo.");
            }
        } else {
            System.out.println(nome + " está afastado e não pode ter falta apontada.");
        }
    }
    
    // Método para registrar hora extra (aumenta salário em 10%)
    public void horaExtra() {
        if (!afastado) {
            salario *= 1.1;
            System.out.println(nome + " fez hora extra. Novo salário: R$ " + String.format("%.2f", salario));
        } else {
            System.out.println(nome + " está afastado e não pode fazer hora extra.");
        }
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public char getNivel() {
        return nivel;
    }
    
    public boolean isAfastado() {
        return afastado;
    }
    
    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
    }
}