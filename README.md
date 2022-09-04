# Tinnova

Exercícios Desafio Tinnova
1) Votos em relação ao total de eleitores
    Paradigma Orientado a Objetos
  -> Pacote Application
      Classe Main.java responsável por importar os dados da classe Votos.java e validar se a quantidade de votos é menor do que a quantidade de eleitores 
  -> Pacote Entities
      Classe Votos.java inclui
         atributos: 
            * totalEleitores (inteiro)
            * votosValidos (inteiro);
            * votosNulos (inteiro);
            * votosBranco (inteiro);
            * perValidos (double);
            * perNulos (double);
            * perBranco (double);

         metodos:
          * percentValidos:
             -> Calcula o percentual de votos válidos 
              percentual de votos validos =  (votosValidos / totalEleitores) * 100);

           * percentBrancos:
             -> Calcula o percentual de votos brancos
              percentual de votos brancos =  (votosBrancos / totalEleitores) * 100);

              * percentBrancos:
              -> Calcula o percentual de votos nulos
               percentual de votos nulos =  (votosNulos / totalEleitores) * 100);



2) Algoritmo de ordenação Bubble Sort 
   -> Pacote Application 
       Método Main recebe um vetor de 8 posições, uma variável auxiliar do tipo inteira.
       Foi utilizado um primeiro laço de repetição for para ler o vetor e um laço interno para ordená-lo
       fazendo a verificação comparando dois números, ordenando o vetor.
       
       
3) Fatorial
  -> Pacote Application 
     Método Main recebe um parâmetro do tipo inteiro, caso esse número seja maior do que 1 entra no laço 
     de repetição while, a variável fatorial é incrementada com o valor de fatorial vezes o valor digitado 
     pelo usuário guardado na variável num. No final do laço a variável num é decrementada.
     
     
4) Soma dos multiplos de 3 ou 5
   -> Pacote Application 
      Metodo Main recebe um parâmetro do tipo inteiro e segue para um laço de repetição for que segue até 
      enquanto a variável de condição i for menor que o parãmetro digitado pelo usuáio. Dentro do for existe
      uma estrutura condicional if que vai verificar o resto da divisão do número digitado por 3 ou por 5.
      A variável soma recebe soma mais o valor de i quando satisfazer a condição.
      
