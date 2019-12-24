<template>
  <div id="login">
      <div id="bc">

        <div id="title">
          <a href="#"><img src="../assets/images/title.png" width="730" height="100"  alt=""/></a>
        </div>

        <div id="main">
            <div id="tle">
              <a href="#"><img src="../assets/images/login-bc.png" width="395" height="300"  alt=""/></a>
            </div>

            <div id="one">
              <a href="#"><img src="../assets/images/login.png" width="333" height="89"  alt=""/></a>

              <div>
                用户名:&nbsp;&nbsp;<input type="text" name="username" v-model.trim="userInfo.username">
              </div>

              <div class="mid">
                <font face="Arial, Helvetica, sans-serif" ><strong>@court.gov.cn</strong></font>
              </div>

              <div>
                密&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;
                <input type="password" name="password" v-model.trim="userInfo.password">
                &nbsp;&nbsp;<a class="forget" href="#">忘记密码?</a>
              </div>

              <div class="mid">
                <input type="checkbox" id="remembeMe" v-model="remembeMe" value="记住">
                <a class="forget" href="#">记住用户名</a>
              </div>

              <div class="btn">
                <a href="#" @click="login"><img src="../assets/images/button.png" width="89" height="33"  alt=""/></a><br>
              </div>
            </div>
        </div>

        
        
    </div>
  </div>
</template>

<script>

export default {
  name: "Login",
  data () {
    return {
      userInfo: {
        username: '',
        password: ''
      },
      remembeMe: false
    }
  },
  methods: {
    login:  async function() {
      try {
        let code = await this.$axios.post(`http://127.0.0.1:8080/user/login`,this.userInfo);
        if(code.data.code === '400'){
          alert(code.data.desc);
        }else {
          this.$router.push('/main/court');
        }
      } catch (error) {
        alert(error.message);
      }
    }
  }
};
</script>


<style scoped>

#login {
  display: flex;
  height: 100vh;
  justify-content: center;
  align-items: center;
}

#bc {
  background: #e97a05;
  width: 850px;
  height: 400px;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}

#title a{
 display: block;
 height: 100px;
}

#main {
  display: flex;
}

#one {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  width: 333px;
  height: 295px;
  background: #fbf5ca;
}
#one div {
  margin-top: 10px;
  margin-left: 40px;
}
#one .mid {
  margin-top: 10px;
  margin-left: 90px;
}
#one .mid input {
  width: 20px;
  height: 16px;
}
#one .forget {
  color: #555555;
  font-size: 10px;
  text-align: right;
}
#one input {
  width: 120px;
  height: 15px;
  z-index: 1;
  text-align: left;
  margin: 0px;
  background: #ffffff;
}
#one .btn {
  width: 89px;  
  height: 33px;
  margin-left: 120px;
  margin-top: 15px;
}
</style>