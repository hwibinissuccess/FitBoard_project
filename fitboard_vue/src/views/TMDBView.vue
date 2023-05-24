<template>
    <div>
      <h2>비디오 뷰입니다</h2>
      <!-- 링크를 여러개를 만들면 좋겠다. -->
      <router-link to="/tmdb/popular">인기동영상</router-link>
      <router-view></router-view>
    </div>
  </template>
  
  <script>
  export default {
      name: "TMDBView"
  }
  </script>
  
  <style>
  
  </style>