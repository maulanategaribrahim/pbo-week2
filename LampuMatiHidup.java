public class LampuMatiHidup {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();

        while (true) {
            lampu.nyalakanLampu();
            System.out.println("Lampu dinyalakan");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lampu.matikanLampu();
            System.out.println("Lampu dimatikan");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
