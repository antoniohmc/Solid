package isp.errado;

public class Camera implements DispositivoMultifuncional {
    @Override
    public void enviarEmail(String email) {
        System.out.println("Enviando email: " + email); // Uma camera nao pode fazer isso, mas precisa implementar o método.
    }

    @Override
    public void tirarFoto(String foto) {
        System.out.println("Tirando foto de: " + foto);
    }
}
