<template>
    <div class="quick-nav">
      <img src="../../assets/img/icon/icon2.png" alt="" class="monster">
      <a href="https://github.com/FirstMrRight?tab=repositories" target="_blank">
        <img src="../../assets/img/icon/icon9.png" alt="" class="readme" >
       </a>
      <img src="../../assets/img/icon/icon7.png" alt="" class="spark">
      <img src="../../assets/img/icon/logo.png" alt="" class="logo">
    </div>
</template>

<script>
  export default {
    name: 'QuickNav'
  }
</script>

<style scoped>
  .quick-nav {
    width: 303px;
    height: 318px;
    background-color: transparent;
  }

  .monster {
    width: 280px;
    height: 260px;
    /*position: absolute;*/
    top: 120px;
    left: 100px;
  }

  .readme {
    width: 225px;
    height: 200px;
    position: absolute;
    margin-left: 50%;
    top: 350px;
    left: 255px;
  }

  .spark {
    position: absolute;
    margin-left: 50%;
    top: 100px;
    left: 20px;
  }

  .logo {
    width: 280px;
    position: absolute;
    margin-left: 50%;
    top: 50px;
    left: 210px;
  }

</style>
