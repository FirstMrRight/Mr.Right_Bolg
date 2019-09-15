<template>
  <el-aside>
      <el-menu
        default-active="1"
        style="width: 170px">
        <!--Vue实现类似锚点功能：给标签设置slot属性-->
        <a href="#header-div">
          <el-menu-item index="1">
            <i class="el-icon-menu"></i>
            <span slot="title">技术选型</span>
          </el-menu-item>
        </a>
        <a href="#update-card">
          <el-menu-item index="2">
            <i class="el-icon-menu"></i>
            <span slot="title">最近更新</span>
          </el-menu-item>
        </a>
        <a href="#slogan">
          <el-menu-item index="3">
            <i class="el-icon-document"></i>
            <span slot="title">下载源码</span>
          </el-menu-item>
        </a>
        <a href="#about">
          <el-menu-item index="4">
            <i class="el-icon-setting"></i>
            <span slot="title">关于我们</span>
          </el-menu-item>
        </a>
      </el-menu>
  </el-aside>
</template>

<script>
  export default {

  }
</script>

<style>
  a {
    text-decoration: none;
    color: white;
  }
</style>
