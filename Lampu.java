public class Lampu {
    private boolean nyala;

    public Lampu() {
        nyala = false;
    }

    public void nyalakanLampu() {
        nyala = true;
    }

    public void matikanLampu() {
        nyala = false;
    }

    public boolean isNyala() {
        return nyala;
    }

    public void cekLampu() {
        if (nyala) {
            System.out.println("Lampu menyala");
        } else {
            System.out.println("Lampu mati");
        }
    }
}
