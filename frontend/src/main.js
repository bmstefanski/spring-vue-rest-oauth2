import Vue from "vue";
import App from "./App";
import router from "./router";
import store from './store';

new Vue({
  store,
  router: router,
  render: h => h(App)
}).$mount('#app');