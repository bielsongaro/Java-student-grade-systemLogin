package dominio;

public class CreateLogin {
    private String username;
    private String password;


    public void setCreateUser(String createNameUser, String createPassword ) {
        if(createNameUser.isBlank() || createPassword.isBlank()) {
            System.out.println("Usuario ou senha não inseridos | Tente novamente");
            return;
        }
        this.username = createNameUser;
        this.password = createPassword;
        System.out.println("Login criado com sucesso!");
    }

    public String getCreateNameUser(){

        return username;
    }
    public String getCreatePassword(){
        return password;
    }
}
