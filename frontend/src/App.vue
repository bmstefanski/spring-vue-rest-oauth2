<template>
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class="masthead-brand">Spring OAuth Example</h3>
      <nav class="nav nav-masthead justify-content-center">
        <router-link class="nav-link" :to="{ path: '/' }">Home</router-link>
        <router-link class="nav-link" :to="{ path: '/login' }">Login</router-link>
        <router-link class="nav-link" :to="{ path: '/logout' }">Logout</router-link>
      </nav>
    </div>
  </header>
  <router-view></router-view>
  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>, by <a href="https://twitter.com/mdo">@mdo</a>.</p>
    </div>
  </footer>
</div>
</template>

<style>
  a,
  a:focus,
  a:hover {
    color: #fff;
  }

  .btn-secondary,
  .btn-secondary:hover,
  .btn-secondary:focus {
    color: #333;
    text-shadow: none; 
    background-color: #fff;
    border: 0.05rem solid #fff;
  }

  html,
  body {
    height: 100%;
    background-color: #333;
  }

  body {
    display: -ms-flexbox;
    display: flex;
    color: #fff;
    text-shadow: 0 0.05rem 0.1rem rgba(0, 0, 0, 0.5);
    box-shadow: inset 0 0 5rem rgba(0, 0, 0, 0.5);
  }

  .cover-container {
    max-width: 42em;
  }

  .masthead {
    margin-bottom: 2rem;
  }

  .masthead-brand {
    margin-bottom: 0;
  }

  .nav-masthead .nav-link {
    padding: 0.25rem 0;
    font-weight: 700;
    color: rgba(255, 255, 255, 0.5);
    background-color: transparent;
    border-bottom: 0.25rem solid transparent;
  }

  .nav-masthead .nav-link:hover,
  .nav-masthead .nav-link:focus {
    border-bottom-color: rgba(255, 255, 255, 0.25);
  }

  .nav-masthead .nav-link + .nav-link {
    margin-left: 1rem;
  }

  .nav-masthead .active {
    color: #fff;
    border-bottom-color: #fff;
  }

  @media (min-width: 48em) {
    .masthead-brand {
      float: left;
    }
    .nav-masthead {
      float: right;
    }
  }

  .cover {
    padding: 0 1.5rem;
  }
  .cover .btn-lg {
    padding: 0.75rem 1.25rem;
    font-weight: 700;
  }

  .mastfoot {
    color: rgba(255, 255, 255, 0.5);
  }
</style>


<script>
  export default {
    name: "app"
  };
</script> 