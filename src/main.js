import { createApp } from 'vue'
import App from './App.vue'
import './assets/base.css'
import { createRouter, createWebHistory } from 'vue-router'
import Home from "../src/views/Home.vue"
import Partidas from "../src/views/Partidas.vue"

const router = createRouter({
    history: createWebHistory(),
    routes : [
        {path:'/', name:'Home', component: Home},
        {path:'/partidas', name:'Partidas', component: Partidas}
    ]
})

createApp(App)
.use(router)
.mount('#app')
