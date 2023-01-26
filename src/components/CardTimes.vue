<template>
<div class="container">
  <div class="row-1-container">
    <img src="../../assets/Brasil.png" alt="">
    <ul>
      <li>
        <ul>
          <li class="celOne">BRASIL</li>
          <li>NÚMERO DE JOGADORES</li>
          <li>PARTIDAS JOGADAS</li>
          <li>VITÓRIAS</li>
          <li>DERROTAS</li>
          <li>AÇOES</li>
        </ul>
      </li>
    </ul>
  </div>
  <div class="row-2-container">
    <ul>
      <li>
        <ul>
          <li class="celTwo">PRÓXIMA PARTIDA: 22 DEC 2022</li>
          <li>24</li>
          <li>102</li>
          <li>88</li>
          <li>14</li>
          <li id="">...</li>
        </ul>
      </li>
    </ul>
  </div>
</div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String,
  },
};
</script>

<style scoped>

.container {
  width: 1210px;
  height: 49px;
  margin: 0px auto;
}

.row-1-container {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  margin: 0 auto; /* centraliza a div na tela */
  background: #2B2F40;
}

img {
  width: 20px;
  height: 20px;
  border-radius: 50%;
  margin-left: 5px;
}

.row-2-container {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  margin: 0 auto; /* centraliza a div na tela */
  background-color:#1C212D;
}

ul {
  display: flex;
  flex-wrap: wrap;
  list-style-type: none;
  width: 100%;
  margin: 0;
  padding: 0;
}

li {
  flex: 1.5;
  padding: 8px;
  text-align: center;
  color: aliceblue;
  font-size: 14px;
}

li ul {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.celOne{
  text-align: left;
  flex: 2;
}

.celTwo{
  text-align: left;
  flex: 2;
}
</style>
