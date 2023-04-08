//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;


class exercicio4 {
  public static void main(String[] args) {

//variaveis
    double media;
    double soma;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

  //adicionar as notas
      Scanner teclado=new Scanner(System.in);
    
    System.out.println("nota 1");
      nota1 = teclado.nextDouble();
    
    System.out.println("nota 2");
      nota2 = teclado.nextDouble();
    
    System.out.println("nota 3");
      nota3 = teclado.nextDouble();
    
    System.out.println("nota 4");
      nota4 = teclado.nextDouble();

      teclado.close();

    //calcular media e soma
    soma = nota1 + nota2 + nota3 + nota4;

    media = (nota1 + nota2 + nota3 + nota4) / 4;

    //mostrar media e soma pra pessoa

    System.out.println("Soma");
    System.out.println(soma);

    System.out.println("Média");
    System.out.println(media);



    
  }
}