<template>
  <div class="loading-container">
    <div class="progess-container">
      <h3>SORTEANDO RIVAIS E DATAS</h3>
      <span>Isso pode demorar alguns instantes...</span>
      <div class="bar-container">
        <div class="progress-bar">
          <div class="progress" v-bind:style="{ width: width + '%' }"></div>
        </div>
      </div>
      <button>CANCELAR</button>
    </div>
  </div>
</template>

<script>

export default {
  name: 'LoadingProgress',
  props: {
    duration: {
      type: Number,
      default: 1000,
    },
    completeLoading: {
      type: Function,
      default: () => {},
    },

  },
  data() {
    return {
      width: 0,
    };
  },
  methods: {
    start() {
      const interval = setInterval(() => {
        this.width += (100 / (this.duration / 10));
        if (this.width >= 100) {
          this.completeLoading();
          clearInterval(interval);
        }
      }, 50);
    },
  },
  mounted() {
    this.start();
  },
};
</script>

<style scoped>

.loading-container {
  width: 293px;
  height: 233px;
  display: flex;
  align-items: center;
  background-color: #1C212D;
}

.progess-container {
  width: 100%;
}

.progess-container h3 {
  font-weight: 700;
  font-size: 16px;
  line-height: 18px;
  color: #FFFFFF;
}

.progess-container span {
  font-weight: 400;
  font-size: 12px;
  color: rgba(255, 255, 255, 0.4);
}

.bar-container {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 20px 0;
}

.progress-bar {
  background: #2B2F40;
  width: 229px;
  height: 8px;
  border-radius: 2px;
}

.progress {
  background-color: #F5760F;
  height: 8px;
  border-radius: 2px;
}

button {
  width: 229px;
  height: 45px;
  font-weight: 700;
  font-size: 14px;
  line-height: 18px;
  background: #F5760F;
  border-radius: 4px;
  color: #FFFFFF;
}
</style>
