<script setup>
import Navbar from '../src/components/Navbar/navbar.vue'
</script>
<template>
  <Navbar />
  <div class="main-container">
    <img src="./assets/banner.png" />
    <router-view></router-view>
  </div>

</template>
