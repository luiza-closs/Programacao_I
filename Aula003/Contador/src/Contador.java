public class Contador {
    private int count;

    public Contador() {
        this.count = 0;
    }

    public void incrementar() {
        if (this.count == 9999) {
            this.count = 0;
        } else {
            this.count++;
        }
    }

    public void zerar() {
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }
}