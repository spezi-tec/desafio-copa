<template>
<div class="container">
  <div class="table-container">
    <div class="row-container">
      <span>20 DE DEZEMBRO 2022</span>
    </div>
    <div class="card-container" v-for="time in times" :key="time.id">
      <div class="card">
        <span>{{ time.name }}</span>
      </div>
      <div class="table">
        <ul>
          <li>PARTIDAS</li>
          <li>VITÓRIAS</li>
          <ul v-for="(matchs, index) in time.match" :key="index">
            <li>{{ matchs.matchs }}</li>
            <li>{{ matchs.wins }}</li>
          </ul>
        </ul>
      </div>
    </div>
  </div>
</div>
</template>

<script>
export default {
  name: 'CardMatch',
  setup() {

  },
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
  width: 1210px;
  height: 49px;
  margin: 0px auto;
}
.row-container {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 49px;
  background: #121219;
}

.teste {
  flex: 2;
}
.table-container {
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
}
.card-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.card {
  margin: 30px auto 0;
  height: 49px;
  width: 590px;
  display: flex;
  justify-content: center;
  align-items: center;
  background: #2B2F40;
}

.table {
  margin-top: 2px;
  height: 124px;
  width: 590px;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #1C212D;
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

li:nth-child(1) {
  border-right: 1px solid lightgray;
}

span {
  color: rgba(248, 248, 248, 0.5);
  letter-spacing: 0.02em;
  font-size: 14px;
  text-transform: uppercase;
}

</style>
