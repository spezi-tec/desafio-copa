<template>
  <div class="container">
    <div class="wrapper">
      <div class="left">
        <h1 class="logo">MEU</h1>
        <h1>TIME</h1>
      </div>
      <div class="center">
        <div class="itens">
          <router-link to="/partidas">PARTIDAS</router-link>
          <a href="">MEUS TIMES</a>
          <a href="">COMUNIDADES</a>
          <a href="">NOVIDADES</a>
        </div>
      </div>
      <div class="right">
        <img src="" alt="">
        <p>USUÁRIO</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'NavBar',
  data() {

  },
};
</script>

<style scoped>
.container {
  height: 60px;
  background-color: #12121A;
}
.wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
  height: 100%;
}

.left {
  flex: 1;
  display: flex;
  justify-content: center;
}

.left .logo{
  color: #F8F8F8;
}

.left h1 {
  color: #F5760F;
}

.center {
  flex: 1;
  text-align: center;
}

.itens  a{
  color: #F8F8F8;
  text-decoration: none;
  padding-left: 20px;
}

.itens a:active {
  color: #F5760F;
}

.right {
  flex: 1;
  display: flex;
  align-items: center;
  justify-content: center;
}

</style>
