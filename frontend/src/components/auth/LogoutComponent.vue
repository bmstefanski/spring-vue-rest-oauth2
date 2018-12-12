<template>
  <a class="btn btn-block" @click.prevent="logout"></a>
</template>

<script>
  export default {
    name: "Logout",
    methods: {
      logout() {
        this.$store.dispatch("logout");
      }
    }
  };
</script>
