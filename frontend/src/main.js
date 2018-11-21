import router from './router';
import Vue from 'vue';
import App from './App';

new Vue({
  router,
  render: h => h(App)
}).$mount('#app');