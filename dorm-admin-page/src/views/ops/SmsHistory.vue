<template>
  <el-table :data="list" style="width: 100%">
    <el-table-column prop="phone" label="手机号" />
    <el-table-column prop="content" label="内容" />
    <el-table-column prop="success" label="状态">
      <template slot-scope="scope">
        <el-tag :type="scope.row.success ? 'success' : 'danger'">
          {{ scope.row.success ? '成功' : '失败' }}
        </el-tag>
      </template>
    </el-table-column>
    <el-table-column prop="sendTime" label="发送时间" />
  </el-table>
</template>
<script>
import request from '@/utils/request'
export default {
  data() { return { list: [] } },
  async created() {
    this.list = await request.get('/api/sms/history/all')
  }
}
</script> 