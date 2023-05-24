<template>
    <div>
<<<<<<< HEAD
        <div>
      <h2>Please Log In</h2>
      <div id="loginForm">
        <form>
          <p>
            <input class="w3-input" name="uid" placeholder="Enter your ID" v-model="user_id"><br>
          </p>
          <p>
            <input name="password" class="w3-input" placeholder="Enter your password" v-model="user_pw" type="password">
          </p>
          <p>
            <button type="submit" @click.prevent="login" class="w3-button w3-green w3-round">Login</button>
          
            <router-link class="w3-button w3-green w3-round" to="/register">회원가입</router-link>
          </p>
        </form>
      </div>
    </div>
  </div>
  </template>
  
  <script>
import router from '@/router'

  export default {
    name: "UserLogin",
    data() {
        return {
            user_id: "",
            user_pw: ""
        };
    },
    methods: {
        login() {
            if (this.user_id === "") {
                alert("ID를 입력하세요.");
                return;
            }
            if (this.user_pw === "") {
                alert("비밀번호를 입력하세요.");
                return;
            }
            alert("로그인 되었습니다.");
            //   this.$store.dispatch('userLogin', this.user)
        }
    },
    components: { router }
}
  </script>
  
  <style>
  #loginForm {
  width: 500px;
  margin: auto;
}
=======
      <h3>로그인</h3>
      <div>
          <input type="text" v-model.trim="user.id" placeholder="아디">
          <input type="password" v-model.trim="user.password" placeholder="비번">
          <button @click="login">로그인</button>
      </div>
    </div>
  </template>
  
  <script>
  export default {
      name: "UserLogin",
      data() {
          return {
              user : {
                  id: "",
                  password: ""
              }
          }
      },
      methods: {
          login(){
              this.$store.dispatch('userLogin', this.user)
          }
      },
  }
  </script>
  
  <style>
  
>>>>>>> d7cbc2f8fb6ea05f5c0821bdfd27b8ed484c163e
  </style>