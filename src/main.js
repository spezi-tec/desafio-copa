import { createApp } from 'vue';

// eslint-disable-next-line import/no-extraneous-dependencies
import { library } from '@fortawesome/fontawesome-svg-core';
// eslint-disable-next-line import/no-extraneous-dependencies
import { faPlus, faXmark, faEllipsisVertical } from '@fortawesome/free-solid-svg-icons';
// eslint-disable-next-line import/no-extraneous-dependencies
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome';
import router from './router';
import App from './App.vue';

library.add(faPlus, faXmark, faEllipsisVertical);

createApp(App).component('fa', FontAwesomeIcon).use(router).mount('#app');
