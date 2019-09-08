<template>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span style="font-weight: bold;font-size: 20px">最近更新</span>
      <!--<el-button style="float: right; padding: 3px 0" type="text">修改</el-button>-->
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item timestamp="2019/9/2" placement="top">
          <el-card>
            <h4>Spring MVC框架浅析</h4>
            <p>Debug 提交于 2019/9/2 21:32</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/8/13" placement="top">
          <el-card>
            <h4>谈谈我对Vue生命周期、钩子函数的理解</h4>
            <p>Debug 提交于 2019/8/13 09:02</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/8/10" placement="top">
          <el-card>
            <h4>Postman使用教程</h4>
            <p>Debug 提交于 2019/8/10 22:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/2/20" placement="top">
          <el-card>
            <h4>最新的spring boot技术实现登录、列表、分页、上传等功能</h4>
            <p>Debug 提交于 2019/2/20 19:51</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/2/11" placement="top">
          <el-card>
            <h4>MVC设计模式及流程</h4>
            <p>Debug 提交于 2019/2/11 22:52</p>
          </el-card>
        </el-timeline-item>
      </el-timeline>
    </div>
  </el-card>
</template>

<script>
  export default {
    name: 'UpdateCard'
  }
</script>

<style scoped>
  .box-card {
    margin-top: 5px;
    width: 988px;
    height: 1050px;
    text-align: left;
  }
</style>
