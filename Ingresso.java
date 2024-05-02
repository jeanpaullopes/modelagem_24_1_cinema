import java.util.Date;

abstract class Ingresso {
    private int nr;
    private Date data;
    
    public Ingresso(int nr, Date data) {
        this.nr = nr;
        this.data = data;
    }

    public int getNr() {
        return nr;
    }
}