package maratonajava.introducao;

public class Aula04Operadores {
    static void main() {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1+numero2;
        System.out.println(resultado);

        // %
        int resto = 21%2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezIgualADeDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);
        System.out.println("isDezIgualADeDez " + isDezIgualADeDez);

        // && (AND) ||(OR) !(NOT)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQue30 " + isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30 " + isDentroDaLeiMenorQue30);


        double contaCorrente = 200;
        double contaPoupanca = 5000;
        double valorPlaystation = 5000;

        boolean isPlaystation5Compravel = contaCorrente >= valorPlaystation || contaPoupanca >= valorPlaystation;

        System.out.println("isPlaystation5Compravel "+isPlaystation5Compravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);


        //++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
