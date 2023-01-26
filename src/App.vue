<template>
  <NavBar />
  <Banner />
  <router-view/>
</template>

<script>
import NavBar from './components/NavBar.vue';
import Banner from './components/Banner.vue';

export default {
  components: {
    NavBar,
    Banner,
  },
};
</script>

<style>
body {
  background: #1E1E1E;
}
#app {
  font-family: 'Inter', sans-serif;
  font-family: 'Inter';
  font-style: normal;
  font-weight: 500;
  font-size: 14px;
  line-height: 17px;
  letter-spacing: 0.02em;
  text-align: center;
  color: #2c3e50;
  height: 1024px;
  width: 1440px;
  margin: 0 auto;
  background: #15151E
}

</style>
