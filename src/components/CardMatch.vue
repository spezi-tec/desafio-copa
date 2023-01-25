<template>
<div class="container">
  <div class="row-container">
    <span>20 DE DEZEMBRO 2022</span>
  </div>
  <div class="card-container">
    <div class="card1">
      <span>BRASIL</span>
      <div class="table-1">
        <ul class="row-two">
          <li>PARTIDAS JOGADAS</li>
          <li>VITÓRIAS</li>
        </ul>
        <ul>
          <li>102</li>
          <li>24</li>
        </ul>
      </div>
    </div>
    <div class="card2">
      <span>BRASIL</span>
      <div class="table-1">
        <ul class="row-two">
          <li>PARTIDAS JOGADAS</li>
          <li>VITÓRIAS</li>
        </ul>
        <ul>
          <li>102</li>
          <li>24</li>
        </ul>
      </div>
    </div>
  </div>
</div>
</template>

<script>
export default {
  setup() {

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

.card-container {
  display: flex;
  justify-content: space-between;
  margin: 30px auto 0;
}

.card1 {
  height: 49px;
  width: 590px;
  background: #2B2F40;
}

.table-1{
  height: 124px;
  width: 590px;
  margin-top: 10px ;
  background-color: #1C212D;
}

.card2 {
  height: 49px;
  width: 590px;
  background: #121219;
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
}

</style>
