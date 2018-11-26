<template>
  <main role="main" class="inner cover">
      <h1 class="cover-heading">Welcome </h1>
      <h1 class="cover-heading">You are not logged in!</h1>
      <p class="lead">
        <router-link class="nav-link" :to="{ path: '/login' }">Log In</router-link>
      </p>
  </main>
</template>

<script>
  export default {
    name: "Home"
  };
</script>
