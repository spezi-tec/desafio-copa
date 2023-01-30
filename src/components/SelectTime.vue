<!-- eslint-disable vuejs-accessibility/label-has-for -->
<template>
  <div class="container-select">

    <div class="form-container">
      <form action="">
        <label>Selecione um time da sua base</label>
        <select v-model="selectedOption" v-on:change="emitSelectedOption">
          <option value="">Selecione um time</option>
          <option v-for="time in times" :key="time.id" v-bind:value="time.name">
            {{ time.name }}
          </option>
        </select>
        <button @click="onClick()">SORTEAR</button>
      </form>
    </div>
  </div>
</template>

<script>

export default {
  data() {
    return {
      times: [],
      selectedOption: this.value,
    };
  },
  methods: {
    onClick() {
      this.$emit('showLoading');
      this.$emit('close');
    },
    async getPedidos() {
      const req = await fetch('http://localhost:3000/times');

      const data = await req.json();

      this.times = data;
    },
    emitSelectedOption() {
      this.$emit('updateSelectedOption', this.selectedOption);
      console.log(this.selectedOption);
    },
  },
  watch: {
    value(newVal) {
      this.selectedOption = newVal;
    },
  },
  mounted() {
    this.getPedidos();
  },
};
</script>

<style scoped>
.container-select {
  width: 592px;
  height: 230px;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #1C212D;
}

.form-container {
  width: 528px;
  text-align: left;
  color: #F8F8F8;
}

.form-container button {
  color: #FFFFFF;
  background-color: #F5760F;
  border: none;
  margin-top: 20px;
  height: 45px;
  width: 100%;
}

select {
  margin-top: 10px;
  width: 528px;
  height: 40px;
  background: #2B2F40;
  background: #2B2F40;
  border: 1px solid #191B25;
  border-radius: 4px;
  color: rgba(255, 255, 255, 0.2);
  text-transform: uppercase;
}

option {
  text-transform: uppercase;
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
