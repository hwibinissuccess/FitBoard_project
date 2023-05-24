import Vue from "vue";
import VueRouter from "vue-router";
import HomeView from "../views/HomeView.vue";
import BoardView from "../views/BoardView.vue";
import TMDBView from "../views/TMDBView.vue";

import BoardCreate from "../components/board/BoardCreate.vue";
import BoardList from "../components/board/BoardList.vue";
import BoardDetail from "../components/board/BoardDetail.vue";
import BoardUpdate from "../components/board/BoardUpdate.vue";
import BoardFitbridge from "../components/board/BoardFitbridge.vue";


import TMDBPopular from "../components/tmdb/TMDBPopular.vue";
import UserLogin from "../components/user/UserLogin.vue";
import UserRegister from "../components/user/UserRegister.vue";
Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: HomeView,
  },
  {
    path: "/board",
    component: BoardView,
    children: [
      {
        path: "",
        name: "boardList",
        component: BoardList,
      },
      {
        path: "create",
        name: "boardCreate",
        component: BoardCreate,
      },
      {
        path: ":id",
        name: "boardDetail",
        component: BoardDetail,
      },
      {
        path: "update",
        name: "boardUpdate",
        component: BoardUpdate,
      },
      {
        path: "/BoardFitbridge",
        name: "BoardFitbridge",
        component: BoardFitbridge,
      },
    ],
  },
  {
    path: "/tmdb",
    name: "tmdb",
    component: TMDBView,
    children: [
      {
        path: "popular",
        name: "popular",
        component: TMDBPopular,
      },
    ],
  },
  {
    path: "/login",
    name: "login",
    component: UserLogin,
  },
  {
    path: "/register",
    name: "register",
    component: UserRegister,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
