<!-- eslint-disable vuejs-accessibility/label-has-for -->
<template>
  <div class="container">
    <div class="upload">
      <img src="../../assets/upload-banner.png" alt="">
    </div>
    <div class="form-container">
    <form>
      <label>Nome do Time:</label>
      <input v-model="time.name" type="text" class="name-input" />

      <div class="group-container">
        <div class="item-group">
          <div class="group">
            <label>Número de jogadores:</label>
            <input v-model="time.players" type="number" />

            <label>Número de jogadores no ataque:</label>
            <input v-model="time.attackers" type="number" />
          </div>
        </div>
        <div class="item-group">
          <div class="group">
            <label>Número de jogadores:</label>
            <input v-model="time.players" type="number" />

            <label>Número de jogadores no ataque:</label>
            <input v-model="time.attackers" type="number" />
          </div>
        </div>
      </div>

      <button @click="submitForm">SALVAR</button>
    </form>
  </div>
  </div>
</template>

<script>
export default {
  name: 'FormAdd',
  data() {
    return {
      time: {
        name: '',
        players: '',
        attackers: '',
        defenders: '',
        midfielders: '',
      },
    };
  },
  methods: {
    submitForm() {
      console.log(this.time);
    },
  },

};
</script>

<style scoped>

.container {
  width: 592px;
  height: 588px;
  background-color: #1C212D;
}
.form-container {
  display: flex;
  align-content: center;
  justify-content: center;
}

form {
  width: 550px;
  height: 50%;
  font-size: 14px;
  text-align: left;
  color: aliceblue;
}

img {
  margin: 40px 0 20px 0;
}

.name-input {
  width: 99%;
}

.group-container {
  display: flex;
}

.item-group {
  width: 256px;
  flex: 1;
}

input {
  margin: 10px 0;
  width: 256px;
  height: 40px;
}

button {
  margin-top: 20px;
  width: 100%;
  background-color: #F5760F;
  color: aliceblue;
  height: 45px;
  border: none;
}

</style>
