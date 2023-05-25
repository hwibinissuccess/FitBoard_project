<template>
  <div class="home">
    <img src="@/assets/logo2.png" alt="Logo" class="logo" />
    <h2 class="title">FitBada에 오신걸 환영합니다!</h2>
    <hr>
    <div class="icon-container">
      <b-icon icon="camera" class="icon"></b-icon>
      <b-icon icon="camera" rotate="45" class="icon"></b-icon>
      <b-icon icon="camera" rotate="90" class="icon"></b-icon>
      <b-icon icon="camera" rotate="180" class="icon"></b-icon>
      <b-icon icon="camera" rotate="270" class="icon"></b-icon>
      <b-icon icon="camera" rotate="-45" animation="spin" class="icon"></b-icon>
    </div>
    <b-iconstack font-scale="5" class="icon-stack">
      <b-icon stacked icon="camera" variant="info" scale="0.75"></b-icon>
      <b-icon stacked icon="slash-circle" variant="danger"></b-icon>
    </b-iconstack>
  </div>
</template>


<script>
export default {
  name: 'HomeView',
};
</script>

<style scoped>
.home {
  text-align: center;
  margin-top: 50px;
}

.logo {
  width: 200px;
}

.title {
  margin-top: 20px;
  font-size: 24px;
}

.icon-container {
  margin-top: 30px;
}

.icon {
  font-size: 32px;
  margin: 10px;
}

.icon-stack {
  margin-top: 50px;
}
</style>