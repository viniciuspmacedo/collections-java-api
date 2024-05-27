package list.operacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListTarefas {
    List<Tarefa> tarefaList;

    public ListTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
         if (t.getDescricao().equalsIgnoreCase(descricao)){
             tarefasParaRemover.add(t);
         }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
}
