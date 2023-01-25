<template>
  <div class="home">
    <div class="add-time">
      <h1>MEUS TIME</h1>
      <button>novo time</button>
    </div>
    <CardTimes />
  </div>
</template>

<script>
// @ is an alias to /src
import CardTimes from '@/components/CardTimes.vue';

export default {
  name: 'HomeView',
  components: {
    CardTimes,
  },
};
</script>

<style scoped>
.home {
  width: 1210px;
  height: 49px;
  margin: 0px auto;
}
.add-time {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  margin: 20px auto; /* centraliza a div na tela */
  color: #F8F8F8;
}

.add-time button {
  background-color: #F5760F;
  padding: 8px 16px;
  color: #F8F8F8;
}
</style>
