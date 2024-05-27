package list.operacoesBasicas.listaTarefas;

public class TesteOperacoesBasicas {
    public static void main(String[] args) {
        ListTarefas listTarefas = new ListTarefas();

        System.out.println("Quantidade de tarefas na lista: " + listTarefas.obterNumeroTotalTarefas());

        listTarefas.adicionarTarefa("Tarefa 1");
        listTarefas.adicionarTarefa("Tarefa 2");
        listTarefas.adicionarTarefa("Tarefa 3");
        listTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("Quantidade de tarefas na lista: " + listTarefas.obterNumeroTotalTarefas());

        System.out.println("Removendo items");
        listTarefas.removerTarefa("Tarefa 2");
        System.out.println("Quantidade de tarefas na lista: " + listTarefas.obterNumeroTotalTarefas());
        listTarefas.obterDescricaoTarefas();
    }
}
