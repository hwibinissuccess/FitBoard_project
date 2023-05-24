<template>
    <header>
      <nav>
        <router-link to="/">Home</router-link> |
        <router-link :to="{ name: 'BoardFitbridge' }">Fit-Bridge</router-link> |
        <router-link :to="{ name: 'boardList' }">Community</router-link> | 
        <router-link :to="{ name: 'tmdb' }">Videos</router-link> | 
        <router-link :to="{ name: 'login' }">로그인</router-link> 
        <a v-if="this.$store.state.isLogin" @click="fnLogout">로그아웃</a>
      </nav>
    </header>
  </template>
  
  <script>
  export default {
    methods: {
    fnLogout() {
      localStorage.removeItem("user_token")
      localStorage.removeItem("user_role")
      location.reload()
    }
  }
  };
  </script>
  
  <style>
  nav {
    text-align: center;
    padding: 30px;
    font-size: 21px;
    margin-top: 15px;
  }
  
  nav a {
    font-weight: bold;
    color: #043e79;
  }
  
  nav a.router-link-exact-active {
    color: #03ac60;
  }
  </style>
  