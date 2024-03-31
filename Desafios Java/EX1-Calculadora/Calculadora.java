public class Calculadora {
    
    Float num1;
    float num2;
    float soma;

    Calculadora(Float n1, Float n2){

        num1=n1;
        num2=n2;

    }

    void adiçao(boolean mostrar){
      
        soma = num1 + num2;

        System.out.println("A soma de "+ num1 +" + "+ num2 +" é: "+ soma);

    }

    void subtraçao(boolean mostrar){
      
        soma = num1 - num2;

        System.out.println("A subtração de "+ num1 +" - "+ num2 +" é: "+ soma);

    }

    void divisao(boolean mostrar){
      
        soma = num1 * num2;

        System.out.println("A multiplicaçao de "+ num1 +" x "+ num2 +" é: "+ soma);

    }

    void multiplicaçao(boolean mostrar){
      
        soma = num1 / num2;

        System.out.println("A divisão de "+ num1 +" / "+ num2 +" é: "+ soma);

    }

}
