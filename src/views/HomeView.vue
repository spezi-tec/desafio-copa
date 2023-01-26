<template>
  <div class="home">
    <div class="add-time">
      <h1>MEUS TIME</h1>
      <button @click="showForm = true"><fa id="plus" icon="plus"/>NOVO TIME</button>
    </div>
    <div class="overlay" v-if="showForm"></div>
    <div class="popUp" v-if="showForm">
      <FormAdd :showForm="showForm"/>
    </div>
    <CardTimes />
  </div>
</template>

<script>
import CardTimes from '@/components/CardTimes.vue';
import FormAdd from '@/components/FormAdd.vue';

export default {
  name: 'HomeView',
  data() {
    return {
      showForm: false,
    };
  },
  components: {
    CardTimes,
    FormAdd,
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
  display: flex;
  align-items: center;
  justify-content: space-around;
  background-color: #F5760F;
  padding: 8px 16px;
  width: 153px;
  height: 40px;
  color: #F8F8F8;
}

#plus {
  font-size: 18px;
  border-radius: 50px;
  color: #F5760F;
  background-color: #F8F8F8;
}

.overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5);
    z-index: 10;
  }
  .popUp {
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    padding: 20px;
    z-index: 11;
  }
</style>
