import Vue from "vue";
import VueRouter from "vue-router";
import {routes} from "./routes";

Vue.use(VueRouter);

const router = new VueRouter({
  routes: routes
});

router.beforeEach((to, from, next) => {
  let requiresAuth = to.matched.some(value => value.meta.requiresAuth);
  let currentUser = localStorage.getItem("currentUser");

  if (requiresAuth && !currentUser || requiresAuth && currentUser === {}) {
    next("/login");
  } else {
    next();
  }

});

export default router;