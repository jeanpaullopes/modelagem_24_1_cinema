import java.util.ArrayList;
import java.util.List;

public class Bilheteria {
    private List<Sessao> sessoes;

    public Bilheteria(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public List<Filme> consultaFilmes(String titulo) {
        List<Filme> filmes = new ArrayList<Filme>();
        for (Sessao sessao : sessoes) {
            if (sessao.getFilme().getTitulo().contains(titulo)) {
                filmes.add(sessao.getFilme());
            }
        }
        // os dois for fazem a mesma coisa, mas o primeiro é menos verboso
        for (int i = 0; i < sessoes.size(); i++) {
            Sessao s = sessoes.get(i);  
            if (s.getFilme().getTitulo().contains(titulo)) {
                filmes.add(s.getFilme());
            }
        }

        return filmes;
    }

    public List<Sessao> getSessoes(Filme filme) {
        List<Sessao> sessoes = new ArrayList<Sessao>();
        for (Sessao sessao : this.sessoes) {
            if (sessao.getFilme().getId() == filme.getId()) {
                sessoes.add(sessao);
            }
        }
        return sessoes;
    }

    public int[] getDisponibilidade(Sessao sessao) {
        int[] disponibilidade = new int[2];
        disponibilidade[0] = sessao.getDisponibilidade();
        disponibilidade[1] = sessao.getDisponibilidadePCD();
        
        return disponibilidade;
    }
    
}
