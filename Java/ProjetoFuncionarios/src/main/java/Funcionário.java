
class Funcionário extends Object{
    public String Nome;
    public int Nasc;
    public double Salário;
public Funcionário(String n, int na, double s){    
    Nome = n;
    Nasc = na;
    Salário = s;
}
public void Informar_Salário(){
    System.out.println("O salário de: "+Nome+" é: "+Salário);
}
public void CalcularIdade(){
    System.out.println("A idade do funcionário é: "+(2024-Nasc));
}
}
