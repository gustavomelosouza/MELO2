public class TesteFuncionario {
    public static void main(String[] args) {
        // Criando dois funcionários para teste
        Funcionario func1 = new Funcionario("João Silva", 2000.0, 'J');
        Funcionario func2 = new Funcionario("Maria Souza", 1600.0, 'T');
        
        // Apresentando os funcionários
        System.out.println("Dados iniciais dos funcionários:");
        func1.apresentarFuncionario();
        func2.apresentarFuncionario();
        
        // Testando métodos
        System.out.println("\nTestando métodos:");
        
        // Funcionário 1 faz hora extra
        func1.horaExtra();
        
        // Funcionário 2 tem falta apontada
        func2.apontarFalta();
        
        // Funcionário 1 tem falta apontada
        func1.apontarFalta();
        
        // Funcionário 2 faz hora extra
        func2.horaExtra();
        
        // Tentando apontar falta para funcionário com salário mínimo
        Funcionario func3 = new Funcionario("Carlos Oliveira", 1518.0, 'P');
        func3.apontarFalta(); // Não deve permitir redução
        
        // Testando com funcionário afastado
        func1.setAfastado(true);
        System.out.println("\n" + func1.getNome() + " foi afastado.");
        func1.horaExtra(); // Não deve permitir hora extra
        func1.apontarFalta(); // Não deve permitir apontar falta
        
        // Apresentando os dados finais
        System.out.println("\nDados finais dos funcionários:");
        func1.apresentarFuncionario();
        func2.apresentarFuncionario();
        func3.apresentarFuncionario();
    }
}