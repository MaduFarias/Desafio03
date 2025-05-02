# Desafio03

Caça ao número 

Dificuldade 
- Fácil - 1 ao 50 
- Médio - 1 ao 100
- Difícil - 1 ao 500

1. O usuário escolhe a dificuldade
2. O sistema gera um número ok

3. O usuário tem 10 tentativas 
4. Cada tentativa o sistema informa se o número é maior ou menor que o chute
5. O sistema tem o histórico de chutes e mostra se o usuário pedir
6. Se o usuário acertar ganha 1 ponto
7. Se errar todas o sistema revela o núemero secreto 

8. Assim que terminar a rodada, o usuário escolhe se quer jogar novamente ou sair 
9. Ao fim da operação o sistema exibe
- Quantidade de rodadas jogadas
- Quantidade de acertos 


Rascunho 

Sistema dificuldade + escolha de numero 
- Criar class dificuldade
  - Definir menu de dificuldade 
  - Definir sistema de escolha de dificuldade 

Jogo 
- Classe jogo recebe o número 
- Informa as regras do jogo 
- Espaço para digitar chute 
- Sistema de maior ou menor 
- Sistema de tentativas 

Pontuação, chutes e erro 

Saída 



Maior ou Menor
1. O sistema gera um **número aleatório entre 1 e 100**. ok
2. O usuário deve adivinhar se o **próximo número será maior ou menor**. 
3. O sistema gera um novo número e compara: ok
  - Se acertou → +1 ponto ok
  - Se errou → 0 ponto ok
4. O número novo vira o "atual", e o ciclo se repete.
5. O jogo continua até o usuário digitar `"sair"`.
6. Ao final, o sistema exibe a **pontuação total**. ok

----
Criar sistema de randomização 

Adivinhar 
- if > ou < (fazer isso com arrays)
- if == gerar outro numero 
- tratamento maior e menor 

Variável que guarda o 

