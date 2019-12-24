<template>
  <div id="main">
      <div class="top">
        <img src="../assets/images/top1.png" alt="">
        <img src="../assets/images/top2.png" alt="">
      </div>

      <div id="abs">  
        <ul>
          <li class="language">[ <router-link to="/">登录</router-link> ]&nbsp;&nbsp;&nbsp;[ <a target="_blank" href="http://english.court.gov.cn/">注册</a> ]</li>
        </ul>
    </div>

      <!--菜单开始-->
      <div id="header">
          <div id="nav">
              <div id="container">
                <ul>
                    <li><router-link to="/main/court">首页</router-link></li>
                    <li><router-link to="/main/consultation">法律法规</router-link></li>
                    <li><router-link to="">经典案例</router-link></li>
                    <li><router-link to="">裁判文书</router-link></li>
                    <li><router-link to="">诉讼文书</router-link></li>
                    <li><router-link to="">法庭介绍</router-link></li>
                    <li id="last"><router-link to="/main/about">关于我们</router-link></li>
                  </ul>			
              </div>
          </div>
      </div>

      <div id="context">
          <router-view></router-view>
      </div>

    <!--友情链接开始-->
    <div id="links">
        <a href="http://cpc.people.com.cn" target="_blank" title="中国共产党新闻网">中国共产党新闻网</a>
        <font>|</font>
        <a href="http://www.gov.cn" target="_blank" title="中国政府网">中国政府网</a>
        <font>|</font>
        <a href="http://www.npc.gov.cn" target="_blank" title="中国人大网">中国人大网</a>
        <font>|</font>
        <a href="http://www.cppcc.gov.cn" target="_blank" title="中国政协网">中国政协网</a>
        <font>|</font>	
        <a href="http://www.chinacourt.org" target="_blank" title="中国法院网">中国法院网</a>
        <font>|</font>	
        <a href="http://www.spp.gov.cn" target="_blank" title="最高人民检察院">最高人民检察院</a>
    </div>
<!--友情链接结束-->
<!--版权开始-->
    <div id="ft">
        <ul id="contact">
          <span>地址：北京市东城区东交民巷27号</span>
          <span>邮编：100745</span>
          <span>总机：67550114</span>
          <span>举报电话：67556131</span>	
          <li>中华人民共和国最高人民法院  版权所有</li>	
          <li>京ICP备05023036号</li>	
          <li><a href="#"><img src="../assets/images/red.png" alt=""/></a></li>
        </ul>			
    </div>
<!--版权结束-->

  </div>
  
</template>


<script>
export default {
  name: "Main"
}
</script>

<style scoped>

  #abs {
    position: absolute;
    top:125px;
    left: 1130px;
  }

  .language{
    color: #E4393C;
    width:200px;
    height:20px;
  }

  .language a {
    font-weight: 700;
    color: #E4393C;
  }

  /*菜单*/
    #header{
      height:54px;
    }

    #nav{
      background:#e4393c;
      height:47px;
      display: flex;
      justify-content: center;
    }

    #container{
      width:800px;
      height:61px;
      margin-top: -21px;
    }

    #container ul{
      background-color:#fff;
      text-align:center;
    }

    #container li{
      display:inline;
      border-right:1px solid #e2e2e2;
      font-size:16px;
      font-weight:bold;
      line-height:47px
    }
    #container a{
      color:#000;
      text-decoration:none;
      padding:5px 13px;
    }

    #container ul li a:hover{
      color:#e4393c;
      text-decoration:underline;
      font-weight:none;
    }

    #container .last{
      border-right:none;
    }

    

    /*结尾版权等*/
    #links{
      background:#e4393c;
      height:40px;
      line-height:40px;
      margin:0 auto 0 auto;
      color:#fff;overflow:hidden;
      text-align:center;
      width:100%;
    }

    #links font{
      padding:0 20px;
    }

    #links a{
      font-weight:bold;
      color:#fff;
      font-family:"Hiragino Sans GB","Microsoft Yahei";
    }

    #ft font{
      padding:0 10px;
    }

    #contact{
      height:100px;
      text-align:center;
      padding-top:2px;
    }

    #contact span{
      padding:0 10px;
      height:80px;
      line-height:40px;
    }

    #contact li{
      line-height:30px;
    }
</style>


