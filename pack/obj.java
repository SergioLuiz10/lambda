package pack;

public class obj {
    private String produto;
    private double preço;

    public obj(String produto, double preço) {
        this.produto = produto;
        this.preço = preço;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "obj{" +
                "produto='" + produto + '\'' +
                ", preço=" + preço +
                '}';
    }
}
