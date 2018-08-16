
package calculadora;

public class logica {
    
    private int num1;
    private int num2;
    private int resultado;
    
    public void setnum1 (int valor){
        this.num1=valor;
    }
    public void setnum2 (int valor){
        this.num2=valor;
    }
    public int getresultado (){
        return this.resultado;
    }
    public void sumar (){
        this.resultado = this.num1+this.num2;
    }
    public void restar (){
        this.resultado = this.num1-this.num2;
    }
    public void multiplicar (){
        this.resultado = this.num1*this.num2;
    }
    public void dividir (){
        this.resultado = this.num1/this.num2;
    }
}
