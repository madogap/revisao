## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

---------JAVA-------

O escopo pode ser entendido onde como o ambiente onde uma variavel pode ser acessada
Em java onde ela foi declarada, fora do seu escopo ela fica inacessivel apos o interpretador sair do bloco do execucao.

## Nas Classes Os atributos (variaveis) sao declaradas no corpo principal da Classe sendo entao portanto acessiveis a todos os metodos

## Entretanto caso voce declare uma variavel dentro de um metodo essa variavel somente e acessada pelo metodo onde ela foi declarada 

## Palavras reservadas 52
---Tipos primitivos
* Boolean -> Um valor indiicando true or false
*Byte -> Um inteiro de 8 bites (signed)
*har -> um character unicode (16-bit unsigned)
*Double -> Um numero de ponto flutuante de 64bits (signed)
*Float ->  Um numero de ponto flutuante de 32bits (signed)
*Int ->  Um inteiro de 32 bits (signed)
*Long -> Um inteiro de 64 bits (signed)
*Short -> Um inteiro de 32 bits (signed)
*Void -> Indica que o metodo nao tem retorno de valor ausencia de valor

---Modificadores de classe, variaveis e metodos

*Abstract -> Classe que nao pode ser instanciada ou metodo que precisa ser implementado por uma subclasse nao abstrata
*Class -> Especifica uma classe
*Extends -> Indica super classe que a subclasse esta estendendo
*Final -> Impossibilita  que uma classe seja estendida que um metodo seja sobrescrito ou que uma variavel seja reinicializada
*Implements -> Indica que as interfaces que uma classe ira implementar
*Interface -> Especifica uma interface
*Native -> Indica que um metodo esta escrito em uma linguagem dependendo da plataforma como o C
*New -> Instancia um novo objeto chamando seu construtor
*Static-> Faz um metodo ou variavel  pertecer a classe ao inves de as instancias
*Strictfp -> Usado em frente a um metodo ou classe para indicar que os numeros de plonto flutuante seguirao as regras de ponto flutuante em tidas as expressoes
*Synchronized -> Indica que um metodo so pode ser acessado por uma thread de cada vez
*Transient -> Impede a serializacao de campos
*Volatile-> Indica que uma variavel pode ser alterada durante o uso da Thread 

---Controle de Fluxo dentro de um bloco de codigo
*Break -> Sai do bloco de codigo em que ele esta
*Case -> Executa um bloco de codigo dependendo do teste Switch
*Continue -> Pula a execucao do codigo que vira apos essa linha e vai para a proxima passagem do loop


---Tratamento de ERROS

*Assert ->Testa uma expressao condicional para verificar uma suposicao do programador
*Catch -> Declara o bloco de codigo usado para tratar uam excecao
*Finally -> Bloco de codigo apos um try-catch que e executado independentemente do fluxo de programa seguido ao lidar com uma excecao

---Variaveis de referencia

*Super -> Refere-se a super classe imediata
*This -> Refer-se a instancia atual do objeto

---USO----
Arquivo -->> Package, import, static 
Classe -->> Public ou protected ou private + final ou abstract + extends ou implements 
Metodo -->> public ou protected ou private + static ou final ou abstract + void e return
Atributo -->> public ou protected ou private + static ou final + tipo primitivo

---Palavras opostas
Package <--> Import
Extends <--> Implements
Final <--> Abstract
Throws <--> Throw

-Classificacoes de uso
Escopo de Uso   
Palavras  Opostas

Modificadores de acesso
Public -> Qualquer classe acessa
Private -> Acesso apenas dentro da classe
Protected -> Acesso por classes no mesmo pacote e subclasses



## Para documentar para Web

Comando --> javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java

## Com a JVM devidamente configurada podemos executar nosso programa e disponibilizar o instalador  oara quaisquer sistemas operacional

-> Executar um programa via terminal
-- Na pasta .bin   e nela que ficara o arqivos .class o nosso bytecode.
-- Devera navegar entre os diretorios ate chegar onde esta os bytecodes --
-- Digite: -->   java MinhaClasse
*Cria classe -> Copilar-> Executar (.class)

## Argumentos
Quando executamos uma classe que contem o metodo main o mesmo permite que passemos um array de argumentos [] do tipo String 
Ex: public class AboutMe{
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in).useLocale(Locale.)

            String nome = args [0];
            System.out.printls("Digite seu nome: ");
            String nome = scanner.next();
            
            String sobrenome = args [1];
            
            
            int idade = Integer.valueOf(args[2]);
            int idade = scanner.nextInt();

            double altura = Double.valueOf(args[3]);

            System.out.println("Ola, me chamo " + nome +)
        }
}
Executar dentro da .bin 

java AboutMe Marcus Augusto 35 1.72 <-- Sao os parametros da classe

## Classe Scanner
import java.util.Locale;
import java.util.Scanner;
--Permite que o usuario tenha interacao mais assertiva com o nosso programa 


## Controles de Fluxos ->> E habilidade de ajustar a maneira como um programa realiza suas tarefas
Por meio de instrucoes especiais chamadas de comando essas tarefas podem ser executadas seletivamente, repetidamdente ou excepcionalmente

**Estrutura Condicional-->> IF-ELSE && SWITCH-CASE <<--
^Simples
Quando ocorre uma validacao de execucao de fluxo somente quado a condicao for positiva, considerado estrutura simples;

^Composta
Mais de uma jornada de execucao de condicionamento a uma regra de negocios 

^Encadeada
Mais de um if else podendo ter a tercdeira, quarta ...condicoes

^^CONDICAO TERNARIA

String resultado = nota => 7 ? "Aprovado" : "Reprovado";

String resultado = nota => 7 ? "Aprovado" : nota >=5 && <=7 ? "Recuperacao" : "Reprovado";

<<------- SWITCH-CASE ------->>

Compara o valor de cada caso com o da variavel sequencialmente  e sempre que encontra o valor correspondente executa o codigo associado ao caso. Para evitar  que as comparacoes continuem a ser executadas apos um caso correspondente ter sido encontrado acrescentamos o comando BREAK no final do bloco de codigos. O comando BREAK quando executado encerra a execucao da estrutura onde ele se encontra



**Estrutura de Repeticao -->> FOR || WHILE || DO-WHILE <<--
Sao comandos    que permitem interacao do codigo ou seja comandos presentes no bloco sejam repetidos varias vezes
^Laco de interacao ou loops
-->> FOR para (Recebe uma entrada uma variavel contadora, a condicao e o valor de incrementacao)
for(inicializacao; validacao boolea; incrementacao){

}
<<-------- FOR em ARRAYS --------->>
FOR EACH =  esta fortemente realcionado com um cenario onde contenha array ou colecao e assim é baseada aos elementos da colecao


BREAK OU CONTINUE

-->> WHILE enquanto

Testa a condicao antes de executar o codio  logo o caso a condicao seja invalida no primeiro teste o bloco nem sera executado




-->> DO-WHILE faca enquanto

Testa a condicao apos executar o codigo sendo assim mesmo que a condicao seja  considerada invalida no primeiro teste o bloco sera executado pelo menos uma vez


**Estrutura de Excecoes -->>
------>> TRY-CATCH-FINALLY && THROW <<-------

De forma interpretativa em Java um erro é algo irreparavel a aplicacao trava ou encerrar drasticamente.
Ja excecoes é um fliuxo inesperado da nossa aplicao exemplo
Dividir um valor por zero 
Abrir arquivo que nao existe
Abrir conexao de banco com usuario e senha ivalido
NAO SAO ERROS mas sim fluxos nao previstos pela aplicacao

TRY = Permite que voce defina um bloco de codigo para ser testado quando a erros enquanto esta sendo executado

CATCH = Permite definir um bloco de codigo a ser executado caso ocorra um erro no bloco TRY

Finally = Permite definir um bloco de codigo a ser executado independente de ocorrer um error ou nao 

##Hierarquia de Excecoes

O Java dispoe de varias classes que apresentam excecoes em hieraquias chamadas CHECKD and UNCHECKED EXCEPTIONS
