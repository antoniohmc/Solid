package isp.correto;

public class Main {
    public static void main(String[] args) {

        Pc pc = new Pc();
        pc.enviarEmail("Trabalho de solid concluido");

        CameraSimples camera = new CameraSimples();
        camera.tirarFoto("Por do Sol");
    }
}
