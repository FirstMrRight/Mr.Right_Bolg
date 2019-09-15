<template>
  <el-container>
    <el-aside style="width: 200px;margin-top: 20px">
      <switch></switch>
      <!--代码解读
      @等同于v:on，
      indexSelect是一个触发事件的名字
      listByCategory是一个方法
      所以下面的代码就是使用v:on的形式给SideMenu这个组件添加一个触发事件，具体方法是listByCategory这个方法中的内容
      sideMenu是LibraryIndex的一个子组件，
      -->
      <SideMenu @indexSelect="listByCategory" ref="sideMenu"></SideMenu>
    </el-aside>
    <el-main>
      <books class="books-area" ref="booksArea"></books>
    </el-main>
  </el-container>
</template>

<script>
  import SideMenu from './SideMenu'
  import Books from './Books'

  export default {
    name: 'AppLibrary',
    components: {Books, SideMenu},
    methods: {
      /*
      * 分类功能：点击左侧菜单栏，向后端发送一个GET请求，将返回的数据实时渲染到页面
      * */
      listByCategory () {
        var _this = this
        var cid = this.$refs.sideMenu.cid
        var url = 'categories/' + cid + '/books'
        this.$axios.get(url).then(resp => {
          if (resp && resp.status === 200) {
            _this.$refs.booksArea.books = resp.data
          }
        })
      }
    }
  }
</script>

<style scoped>
  .books-area {
    width: 990px;
    margin-left: auto;
    margin-right: auto;
  }
</style>
