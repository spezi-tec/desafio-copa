<template>
  <div class="about">
    <div class="raffle">
      <h1>PRÓXIMA PARTIDA</h1>
      <button @click="show()"><fa icon="flag"/> SORTEAR UMA PARTIDA</button>
    </div>
    <div class="overlay" v-if="showForm"></div>
    <div class="popUp" v-if="showForm">
      <SelectTime @close="close"
      @showLoading="showLoading"
      v-bind:value="selectedOption"
      v-on:updateSelectedOption="updateSelectedOption"/>
    </div>
    <div class="overlay" v-if="loading"></div>
    <div class="popUp" v-if="loading">
      <LoadingProgress :completeLoading="completeLoading"/>
    </div>
    <div class="overlay" v-if="complete"></div>
    <div class="popUp" v-if="complete">
      <SetMatch v-bind:selectedOption="selectedOption" />
    </div>

    <CardMatch />
  </div>

</template>

<script>
import CardMatch from '@/components/CardMatch.vue';
import SelectTime from '@/components/SelectTime.vue';
import LoadingProgress from '@/components/LoadingProgress.vue';
import SetMatch from '@/components/SetMatch.vue';

export default {
  data() {
    return {
      showForm: false,
      loading: false,
      complete: false,
      selectedOption: null,
    };
  },
  setup() {

  },
  components: {
    CardMatch,
    SelectTime,
    LoadingProgress,
    SetMatch,
  },
  methods: {
    show() {
      this.showForm = true;
    },
    close() {
      this.showForm = false;
    },
    showLoading() {
      this.loading = true;
    },
    completeLoading() {
      this.complete = true;
    },
    updateSelectedOption(newVal) {
      this.selectedOption = newVal;
    },
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
  width: 242px;
  height: 40px;
  font-weight: 500;
  font-size: 14px;
  line-height: 17px;
  color: #F8F8F8;
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
