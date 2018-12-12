import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);

const SET_USER = "SET_USER";

export default new Vuex.Store({
  state: {
    currentUser: JSON.parse(localStorage.getItem("currentUser")) || {},
  },
  mutations: {
    [SET_USER](state, payload) {
      state.currentUser = payload;
    }
  },
  actions: {
    fetchUser({commit}) {
      axios.get("http://localhost:3000/sessions/me", {withCredentials: true}).then(response => {
        commit(SET_USER, response.data);
        localStorage.setItem("currentUser", JSON.stringify(this.state.currentUser));
      }).catch(() => {
        commit(SET_USER, {});
      });
    }
  }
})