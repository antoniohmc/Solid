package isp.correto;

public class Pc implements Computador {
    @Override
    public void enviarEmail(String documentos) {
        System.out.println("Assunto: " + documentos);
    }
}
