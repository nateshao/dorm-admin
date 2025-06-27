<template>
  <div>
    <el-input v-model="studentNo" placeholder="学号" style="width: 200px; margin-right: 10px;" />
    <el-button type="primary" @click="syncCard">同步一卡通信息</el-button>
    <div v-if="result" style="margin-top: 20px;">
      <el-alert :title="result" type="success" show-icon />
    </div>
  </div>
</template>
<script>
import request from '@/utils/request'
export default {
  data() {
    return { studentNo: '', result: '' }
  },
  methods: {
    async syncCard() {
      if (!this.studentNo) {
        this.$message.error('请填写学号');
        return;
      }
      const res = await request.post('/api/thirdparty/card/sync', null, { params: { studentNo: this.studentNo } })
      this.result = res
    }
  }
}
</script> 