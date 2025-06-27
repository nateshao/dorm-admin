<template>
  <div>
    <el-input v-model="phone" placeholder="手机号" style="width: 200px; margin-right: 10px;" />
    <el-input v-model="content" placeholder="短信内容" style="width: 300px; margin-right: 10px;" />
    <el-button type="primary" @click="sendSms">发送短信</el-button>
  </div>
</template>
<script>
import request from '@/utils/request'
export default {
  data() {
    return { phone: '', content: '' }
  },
  methods: {
    async sendSms() {
      if (!this.phone || !this.content) {
        this.$message.error('请填写手机号和内容');
        return;
      }
      await request.post('/api/thirdparty/sms/send', null, { params: { phone: this.phone, content: this.content } })
      this.$message.success('发送成功')
    }
  }
}
</script> 