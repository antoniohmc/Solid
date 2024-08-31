package isp.errado;

public class Computador implements DispositivoMultifuncional {
    @Override
    public void enviarEmail(String email) {
        System.out.println("Enviando email: " + email);
    }

    @Override
    public void tirarFoto(String foto) {
        System.out.println("Tirando foto de: " + foto); // Um computador não precisa fazer isso, mas é obrigado a implementa-lo.

    }
}
