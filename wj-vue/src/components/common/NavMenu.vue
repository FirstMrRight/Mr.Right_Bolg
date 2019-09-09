<template>
  <div>
    <el-menu
      :default-active="'/index'"
      router
      mode="horizontal"
      @select="handleSelect"
      background-color="white"
      text-color="#222"
      active-text-color="red"
      style="min-width: 1300px">
      <el-menu-item v-for="(item,i) in navList" :key="i" :index="item.name">
        {{ item.navItem }}
      </el-menu-item>
      <!--<a href="#nowhere" style="color: #222;float: right;padding: 20px;">More...</a>-->
      <a href="/admin" target="_blank">
        <img src="../../assets/img/icon/user.png"  width="20px" height="20px" style="float: right; padding: 20px; margin-left: 10px">
      </a>
      <iframe width="125" style="padding-top: 18px" marginwidth="45px" scrolling="no" height="25" frameborder="0" align="right" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=34&icon=1&num=2"></iframe>
      <!--原來的四方块-->
      <!--<i class="el-icon-menu" style="float:right;font-size: 45px;color: #222;padding-top: 8px"></i>-->
      <span style="position: absolute;padding-top: 20px;right: 43%;font-size: 18px;font-weight: bold">MrRight_Blog - Your Mind Palace</span>
      <el-input
        placeholder="快速搜索..."
        prefix-icon="el-icon-search"
        size="medium"
        style="width: 230px;position:absolute;margin-top: 12px;right: 18%"
        v-model="keywords">
      </el-input>
    </el-menu>
  </div>
</template>

<script>
  export default {
    name: 'NavMenu',
    data () {
      return {
        navList: [
          {name: '/index', navItem: '首页'},
          {name: '/jotter', navItem: '笔记本'}
          // {name: '/library', navItem: '图书馆'}
          // {name: '/admin', navItem: '个人中心'}
        ],
        keywords: ''
      }
    },
    computed: {
      hoverBackground () {
        return '#ffd04b'
      }
    },
    methods: {
      handleSelect (key, keyPath) {
        console.log(key, keyPath)
      }
    }
  }
</script>

<style scoped>
  a{
    text-decoration: none;
  }

  span {
    pointer-events: none;
  }
</style>
