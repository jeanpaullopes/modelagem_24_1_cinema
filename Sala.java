public class Sala {
    protected int capacidade;
    protected int id;
    protected int capacidadePCD;
    
    public Sala(int capacidade, int id, int capacidadePCD) {
        this.capacidade = capacidade;
        this.id = id;
        this.capacidadePCD = capacidadePCD;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadePCD() {
        return capacidadePCD;
    }

    public void setCapacidadePCD(int capacidadePCD) {
        this.capacidadePCD = capacidadePCD;
    }

}
