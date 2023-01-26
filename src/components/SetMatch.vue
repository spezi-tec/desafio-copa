<template>
<div class="container">
  <div>x</div>
  <div class="wrapper">
    <h3>SUA PRÓXIMA PARTIDA SERA EM:</h3>
    <span>20 DE DEZEMBRO 2022</span>
  </div>
  <div class="table-container" >
    <div v-for="time in times" :key="time.id">
      <div class="card">
        <span>{{ time. name }}</span>
      </div>
      <div class="table">
        <ul v-for="(matchs, index) in time.match" :key="index">
          <li>VITÓRIAS</li>
          <ul>
            <li>{{ matchs.wins }}</li>
          </ul>
        </ul>
      </div>
    </div>
    <button>VER PARTIDAS</button>
  </div>
</div>
</template>

<script>
export default {
  data() {
    return {
      times: null,
    };
  },
  methods: {
    onClick() {
      this.$emit('showLoading');
      this.$emit('close');
    },
    async getPedidos() {
      try {
        const req = await fetch('http://localhost:3000/times');
        const data = await req.json();

        // mistura os objetos usando sort
        const shuffledData = data.sort(() => Math.random() - 0.5);
        // pega os dois primeiros objetos usando slice
        this.times = shuffledData.slice(0, 2);
      } catch (error) {
        console.error(error);
      }
    },
  },
  mounted() {
    this.getPedidos();
  },
};
</script>

<style scoped>
.container {
  width: 601px;
  height: 454px;
  background-color: #1C212D;
}
.wrapper {
  height: 20%;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.wrapper h3 {
  color: #FFFFFF;
}
.table-container {
  margin-top: 50px ;
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}
.card {
  margin: 30px auto 0;
  width: 264px;
  height: 49px;
  display: flex;
  justify-content: center;
  align-items: center;
  background: #2B2F40;
}

.table {
  margin-top: 2px;
  width: 264px;
  height: 124px;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #181D27;
}

ul {
  display: flex;
  flex-wrap: wrap;
  list-style-type: none;
  width: 100%;
  margin: 0 10px;
  padding: 0;
}

li {
  flex: 1.5;
  padding: 8px;
  text-align: center;
  color: aliceblue;
  font-size: 14px;
}

span {
  color: rgba(248, 248, 248, 0.5);
  letter-spacing: 0.02em;
  font-size: 14px;
  text-transform: uppercase;
}

button {
  margin-top: 25px;
  background: #F5760F;
  color: #FFFFFF;
  border: none;
  border-radius: 4px;
  font-weight: 700;
  font-size: 14px;
  line-height: 18px;
  width: 565px;
  height: 45px;
}
</style>
