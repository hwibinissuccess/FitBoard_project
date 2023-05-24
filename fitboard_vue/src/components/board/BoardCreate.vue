<template>
<<<<<<< HEAD
    <div id="regist">
      <h3>게시판 등록</h3>
      <div id= "wrapper">
      <fieldset>
        <legend>등록</legend>
        <label for="title" >제목 : </label>
=======
    <div>
      <h3>게시판 등록</h3>
      <fieldset>
        <legend>등록</legend>
        <label for="title">제목 : </label>
>>>>>>> d7cbc2f8fb6ea05f5c0821bdfd27b8ed484c163e
        <input type="text" id="title" v-model="title" /><br />
        <label for="writer">쓴이 : </label>
        <input type="text" id="writer" v-model="writer" /><br />
        <label for="content">내용 : </label>
<<<<<<< HEAD
        <textarea  id="content" cols="30" rows="10" v-model="content"></textarea>
        <button @click="createBoard">등록</button>
      </fieldset>
    </div>
    </div>
=======
        <textarea id="content" cols="30" rows="10" v-model="content"></textarea>
        <button @click="createBoard">등록</button>
      </fieldset>
    </div>
>>>>>>> d7cbc2f8fb6ea05f5c0821bdfd27b8ed484c163e
  </template>
  
  <script>
  export default {
    name: 'BoardCreate',
    data() {
      return {
        title: '',
        writer: '',
        content: '',
      };
    },
    methods: {
      createBoard() {
        let board = {
          id: 0,
          title: this.title,
          writer: this.writer,
          content: this.content,
        };
<<<<<<< HEAD

=======
  
>>>>>>> d7cbc2f8fb6ea05f5c0821bdfd27b8ed484c163e
        this.$store.dispatch('createBoard', board);
      },
    },
  };
  </script>
  
<<<<<<< HEAD
  <style scoped>
  #wrapper {
    display: flex;
    justify-content: center;
  align-items: center;
  }
 fieldset{
  justify-content: center;
  align-items: center;
 }
</style>
=======
  <style></style>
  
>>>>>>> d7cbc2f8fb6ea05f5c0821bdfd27b8ed484c163e
