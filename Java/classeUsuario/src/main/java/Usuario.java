
public class Usuario {
    
    //Atributos
    private String nome;
    private String email;
    private String login;
    private String senha ;      
            
    //Construtores
    //Inicializa os atributos vazios
    public Usuario(){
    this(" "," "," "," ");
}
    //Inicializa os atributos com valores passados por parametro
    public Usuario(String nome, String email, String login, String senha){
     this.nome = nome;   
     this.email = email;
     this.login = login;
     this.senha = senha;
    }
    
    
    //Getters e Setters
    public String getNome(){
     return nome;   
    }
    public void setNome(String nome){
     this.nome = nome;   
    }
    
    //Implementação dos demais getters e setters
    
    //Métodos específicos da classe
    public void provarExistencia() {
        System.out.println("Oi, eu existo!");   
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void usuario1(){
        
        System.out.println("O seu nome é: "+nome+"\nO seu email é: "+email+"\nseu login é: "+login+"\nsua senha é: "+senha);
    }
}
