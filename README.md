# Copa - Gerenciador de Jogadores, Partidas e Times

### Back-End
Tecnologias Utilizadas:
- Ruby 3.0.0
- Ruby on Rails 7.0.4
- SQLite

Esta api é responsável por fazer a comunicação com o banco de dados. Optei por utilizar o SQLite devido a facilidade do uso, por se tratar apenas de um arquivo. O código consiste em três models: Player(Jogador), Team(Time) e Match(Partida). Todas as models possuem suas controllers, responsáveis por fazer o crud de cada classe. Cada método possui sua rota.

### Front-End
Tecnologias Utilizadas: 
- Vue 3.12.13

O front-end da aplicação é feito em vuejs. Utilizei a biblioteca de componentes Bulma, afim de padronizar e deixar o código mais intuitivo.
