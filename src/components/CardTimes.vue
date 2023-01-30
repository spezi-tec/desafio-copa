<template>
<div class="container">
  <div class="container-table" v-for="time in times" :key="time.id">
    <div class="row-1-container">
      <ul>
        <li>
          <ul>
            <img src="../../assets/Brasil.png" alt="">
            <li class="celOne">{{ time.name }}</li>
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
          <ul v-for="(matchs, index) in time.match" :key="index">
            <li class="celTwo">PRÓXIMA PARTIDA: 22 DEC 2022</li>
            <li>{{ time.players }}</li>
            <li>{{ matchs.matchs }}</li>
            <li>{{ matchs.wins }}</li>
            <li>{{ matchs.defeats }}</li>
            <li id="">...</li>
          </ul>
        </li>
      </ul>
    </div>

  </div>
</div>
</template>

<script>
export default {
  name: 'CardTimes',
  data() {
    return {
      times: null,
    };
  },
  methods: {
    async getPedidos() {
      const req = await fetch('http://localhost:3000/times');

      const data = await req.json();

      this.times = data;
    },
  },
  mounted() {
    this.getPedidos();
  },
};
</script>

<style scoped>

.container {
  width: 1193px;
  height: 98px;
  margin: 0px auto;
}

.container-table {
  display: flex;
  flex-direction: column;
}

.row-1-container {
  background: #2B2F40;
  margin-top: 20px;
}

img {
  width: 20px;
  height: 20px;
  border-radius: 50%;
  margin-left: 5px;
}

.row-2-container {
  background-color:#1C212D;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}

li {
  flex: 1.5;
  padding: 8px 0;
  margin-left: 8px;
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
  text-transform: uppercase;
}

.celTwo{
  text-align: left;
  flex: 2;
}
</style>
