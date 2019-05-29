package ordenamento;

public class Periodico implements Comparable{
    private String issn;
    private String titulo;
    private String area;
    private String estrato;

    public Periodico(String issn, String titulo, String area, String estrato) {
        this.issn = issn;
        this.titulo = titulo;
        this.area = area;
        this.estrato = estrato;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }
    
    @Override
    public int compareTo(Object o) {
        Periodico p=(Periodico)o;
        return this.issn.compareTo(p.issn);
    }

    @Override
    public String toString() {
        return "Periodico{" + "issn=" + issn + ", titulo=" + titulo + ", area=" + area + ", estrato=" + estrato + '}';
    }
    
}
