package isp.correto;

public class CameraSimples implements Camera {
    @Override
    public void tirarFoto(String foto) {
        System.out.println("Tirando foto do: " + foto);
    }
}
