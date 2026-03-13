package dominio;
public class LoginAuthentication {
    public boolean getVerificandoLogin(CreateLogin createLogin, String login, String senha ) {
        if (login.equals(createLogin.getCreateNameUser()) && senha.equals(createLogin.getCreatePassword())) {
            System.out.println("Login correto");
            return true;

        } else {
            System.out.println("Senha ou usuario incorretos");
            return false;
        }

    }
}