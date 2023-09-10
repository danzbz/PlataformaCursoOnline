package br.com.value.projects.dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Plataforma {

	private String descricao;
	private List<Trilha> ListaTrilha;
	
	public Plataforma(String descricao) {
		this.descricao = descricao;
		this.ListaTrilha = new ArrayList<Trilha>();
	}		

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
	
	public List<Trilha> getListaTrilha() {
        return ListaTrilha;
    }
	
    public void adicionarTrilhaLista(Trilha trilha) {
        ListaTrilha.add(trilha);
    }
    
    public void excluirTrilhaPorNome(String nomeTrilha) {
        Iterator<Trilha> iterator = ListaTrilha.iterator();
        while (iterator.hasNext()) {
            Trilha trilha = iterator.next();
            if (trilha.getNome().equals(nomeTrilha)) {
                iterator.remove();
                System.out.println("Trilha '" + nomeTrilha + "' excluída com sucesso.");
                return;
            }
        }
        System.out.println("Trilha '" + nomeTrilha + "' não encontrada.");
    }
    
    public double buscaTrilhaPorNome(String nomeTrilha) {
        Iterator<Trilha> iterator = ListaTrilha.iterator();
        while (iterator.hasNext()) {
            Trilha trilha = iterator.next();
            if (trilha.getNome().equals(nomeTrilha)) {
            	
                System.out.println("Trilha '" + nomeTrilha + "' FOI encontrada.");
                return 1.0;
            }
            
        }        
        System.out.println("Trilha '" + nomeTrilha + "' NAO encontrada.");
        return 0.0;
    }
}

