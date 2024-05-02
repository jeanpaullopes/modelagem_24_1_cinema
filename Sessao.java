import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {
    private int id;
    private Filme filme;
    private Sala sala;
    private Date horario;
    private float valorInterira;
    private float valorEstudante;
    private float valorIdoso;
    private List<Ingresso> ingressos;
    

    public Sessao(int id, Filme filme, Sala sala, Date horario, float valorInterira, float valorEstudante,
            float valorIdoso, float valorPCD) {
        this.id = id;
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.valorInterira = valorInterira;
        this.valorEstudante = valorEstudante;
        this.valorIdoso = valorIdoso;
        this.valorPCD = valorPCD;
        this.ingressos = new ArrayList<Ingresso>();
    }

    private float valorPCD;
    public int getId() {
        return id;
    }
    public Filme getFilme() {
        return filme;
    }
    public Sala getSala() {
        return sala;
    }
    public Date getHorario() {
        return horario;
    }
    public float getValorInterira() {
        return valorInterira;
    }
    public float getValorEstudante() {
        return valorEstudante;
    }
    public float getValorIdoso() {
        return valorIdoso;
    }
    public float getValorPCD() {
        return valorPCD;
    }

    public List<IngressoPCD> getIngressosPCD() {
        List<IngressoPCD> ingressosPCD = new ArrayList<IngressoPCD>();
        for (Ingresso ingresso : ingressos) {
            if (ingresso instanceof IngressoPCD) {
                ingressosPCD.add((IngressoPCD) ingresso);
            }
        }
        return ingressosPCD;
    }

    public int getDisponibilidade() {
        return sala.getCapacidade() - ingressos.size();

    }
    public int getDisponibilidadePCD() {
        return sala.getCapacidadePCD() - this.getIngressosPCD().size();

    }
    

    
}
