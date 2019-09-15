import Vue from 'vue'
import Vuex from 'vuex'
/*
* vuex，是为Vue开发的一个状态管理方案
* 可以把需要在各个组件中传递传递使用的变量，
* 方法定义在这里
* */

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    user: {
      // name: window.localStorage.getItem('user' || '[]') == null ? '未登录' : JSON.parse(window.localStorage.getItem('user' || '[]')).name,
      // userface: window.localStorage.getItem('user' || '[]') == null ? '' : JSON.parse(window.localStorage.getItem('user' || '[]')).userface,
      username: window.localStorage.getItem('user' || '[]') == null ? '' : JSON.parse(window.localStorage.getItem('user' || '[]')).username
      // roles: window.localStorage.getItem('user' || '[]') == null ? '' : JSON.parse(window.localStorage.getItem('user' || '[]')).roles
    },
    routes: []
  },
  mutations: {
    initMenu (state, menus) {
      state.routes = menus
    },
    login (state, user) {
      state.user = user
      window.localStorage.setItem('user', JSON.stringify(user))
    },
    logout (state) {
      window.localStorage.removeItem('user')
      state.routes = []
    }
  },
  actions: {
  }
})
