<template>
  <main role="main" class="inner cover">
    <h1 class="cover-heading">Welcome </h1>
    <h1 class="cover-heading" v-if="!isAuthenticated">You are not logged in!</h1>
  </main>
</template>

<script>
  export default {
    name: "Home",
    created() {
      let currentUser = localStorage.getItem("currentUser");
      if (!currentUser || currentUser === {}) {
        this.$store.dispatch("fetchUser");
      }
    },
    computed: {
      isAuthenticated() {
        return this.$store.getters.isAuthenticated;
      }
    }

  };
</script>
