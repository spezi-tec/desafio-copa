<template>
  <div class="about">
    <div class="raffle">
      <h1>PRÓXIMA PARTIDA</h1>
      <button>SORTEAR UMA PARTIDA</button>
    </div>
    <CardMatch />
  </div>

</template>

<script>
import CardMatch from '@/components/CardMatch.vue';

export default {
  setup() {

  },
  components: {
    CardMatch,
  },
};
</script>

<style scoped>
.about {
  width: 1210px;
  height: 49px;
  margin: 0px auto;
}
.raffle {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  margin: 20px auto; /* centraliza a div na tela */
  color: #F8F8F8;
}

.raffle button {
  background-color: #F5760F;
  padding: 8px 16px;
  color: #F8F8F8;
}
</style>
