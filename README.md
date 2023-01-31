<div align="center">
  <img src="https://avatars.githubusercontent.com/u/72630796?s=400&u=b27ec815e5f5c2a18b7d08bc4b6bba0e900b249c&v=4" width="100" height="100">

  # Desafio COPA
</div>

O desafio é bem simples. Para participar, basta criar um fork deste repositório e quando finalizar o desenvolvimento, abrir um merge request que iremos avaliar.

## Referências

Segue abaixo link com as referências do teste ser implementado.

<a href="https://www.figma.com/file/8W6h2rmhyrfsLEgfX7Axux/Teste-DEV---Spezi-Tecnologia?node-id=1%3A14" target="_blank">Design</a>

<details>
  <summary>Clique aqui para ver detalhes do desafio</summary>

  ![Teste Prático](assets/Teste_de_Pratico.png)
</details>

## Importante
Se surgir qualquer dúvida durante o desenvolvimento, não hesite em perguntar! nosso time vai estar pronto a lhe auxiliar 😊

## Estrutura do projeto 
  Este projeto foi construido utilizando o padrão REST, tirando proveito do modelo RoR api. Os métodos de players estão em PlayersController. Já os de teams + matches estão em TeamsController uma vez  que vi como desnecessária a criação de novo vontrole apenas para o método de sorteio das partidas, sendo essa uma funcionalidade muito atrelada à entidade teams.

## Rotas de Players

  As rotas de players estao seguindo padrão rest e tem seus métodos concentrados em "/players"
  
  Como fazer um post em "/players"? Segue padrão de JSON a ser utilizado: {
	"name":"Pulisic",
	"age": 27,
	"team_id": 3
}
  
  
## Rotas de Teams 
  As rotas de teams também seguem o padrão rest e seu crud está disponível "/teams". Na rota "/teams/players/:team_id" é possível verificar os jogadores de cada time. Já na rota "/teams/matches/sample" é feita o sorteio das partidas e a armazenagem no banco de dados na tabela Matches.
  
  Como fazer um post para "/teams"? segue padrão de JSON a ser utilizado: {
	"country": "USA"
}

  Já a rota "/teams/matches/sample" é um get sem necessidade de envio de parâmetros, por conta de se tratar de um sorteio.
  
  
