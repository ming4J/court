<template>
    <div id="grey">
  <div id="content">
<!--轮播图-->
 	<div id="spic">
		<img id="p1" :src="this.defaultSrc" alt="">
		<div id="btn">
			<div v-for="data in pic" :key="data.seq" class="cyle" @mouseover="show(data.seq)" :style="{background:data.color}"></div>
		</div>	
	</div>
<!--要闻-->
	<div id="news">
		<span id="mark">要闻</span> 
			<div id="title">
			<a title="习近平出席“一带一路”论坛开幕式并发表演讲" target="_blank" href="#">习近平出席“一带一路”论坛开幕式并发表演讲</a>			
			</div>

			<div id="list">
				<ul>
					<li><a title="周强：自觉接受人大监督 让司法更加贴近群众" target="_blank" href="/zixun-xiangqing-44582.html">周强：自觉接受人大监督 让司法更加贴近群众</a></li>	

          <li><a title="《中华人民共和国宪法修正案》诞生记" target="_blank" href="#">《中华人民共和国宪法修正案》诞生记</a></li>
        	
					<li><a title="诠释神圣使命 实现国家安全——人民法院深入推进平安中国建设工作综述" target="_blank" href="#">诠释神圣使命 实现国家安全——人民法院深入推进平安中国建设工作综述</a></li>				

					<li><a title="司法公开：让人民群众实实在在看到公平正义" target="_blank" href="#">司法公开：让人民群众实实在在看到公平正义</a></li>	

					<li><a title="工作报告解读系列访谈：加快建设智慧法院" target="_blank" href="#">工作报告解读系列访谈：加快建设智慧法院</a></li>		

					<li><a title="全国法院干警：做宪法的捍卫者践行者宣传者" target="_blank" href="#">全国法院干警：做宪法的捍卫者践行者宣传者</a></li>	

          <li><a title="周强会见赞比亚国民议会议长马蒂比尼" target="_blank" href="#">周强会见赞比亚国民议会议长马蒂比尼</a></li>	

					<li><a title="人民法院党组坚决拥护宪法修正案" target="_blank" href="#">人民法院党组坚决拥护宪法修正案</a></li>			

					<li><a title="沈德咏率团成功访问新西兰、澳大利亚" target="_blank" href="#">沈德咏率团成功访问新西兰、澳大利亚</a></li>	

					<li><a title="张述元:为“一带一路”建设和西北发展提供保障" target="_blank" href="#">张述元:为“一带一路”建设和西北发展提供保障</a></li>

          <li><a title="杜万华:认识家庭职能定位 维护共同生活基础" target="_blank" href="#">杜万华:认识家庭职能定位 维护共同生活基础</a></li>  			
				</ul>
				    <a id="more" href="news.html">更多</a>
			</div>
    </div>

    <div id="one">
            <div class="dont">
             <center>
               <a href="https://splcgk.court.gov.cn/gzfwww/"><img src="../assets/images/fr1.png" width="53" height="47"  alt=""/></a><br>
               <a href="https://splcgk.court.gov.cn/gzfwww/">中国审判流程<br>信息公开</a>
             </center>
            </div>
          
            <div>
             <center>
               <a href="http://tingshen.court.gov.cn/"><img src="../assets/images/fr2.png" width="53" height="47"  alt=""/></a><br>
               <a href="http://tingshen.court.gov.cn/">中国庭审直播<br>信息公开</a>
             </center>
            </div>
          
            <div>
             <center>
               <a href="http://wenshu.court.gov.cn/"><img src="../assets/images/fr3.png" width="53" height="47"  alt=""/></a><br>
               <a href="http://wenshu.court.gov.cn/">中国裁判文书<br>信息公开</a>
             </center>
            </div>

            <div>
             <center>
               <a href="http://shixin.court.gov.cn/"><img src="../assets/images/fr4.png" width="53" height="47"  alt=""/></a><br>
               <a href="http://shixin.court.gov.cn/">中国执行<br>信息公开</a>
             </center>
            </div>
          
            <div>
             <center>
               <a href="https://anli.court.gov.cn/static/web/index.html"><img src="../assets/images/fr1.png" width="53" height="47"  alt=""/></a><br>
               <a href="https://anli.court.gov.cn/static/web/index.html">中国司法<br>案例网</a>
             </center>
            </div>
          
            <div>
             <center>
               <a href="#http://data.court.gov.cn/pages/index.html"><img src="../assets/images/fr6.png" width="53" height="47"  alt=""/></a><br>
               <a href="http://data.court.gov.cn/pages/index.html">中国司法大数据<br>服务网</a>
             </center>
            </div>
          
            <div>
             <center>
               <a href="http://peixun.court.gov.cn/"><img src="../assets/images/f7.png" width="53" height="47"  alt=""/></a><br>
               <a href="http://peixun.court.gov.cn/">中国法官<br>培训网</a>
             </center>
            </div>
          
            <div>
             <center>
               <a href="http://songda.court.gov.cn/wscx/ws_loginp.html"><img src="../assets/images/fr8.png" width="53" height="47"  alt=""/></a><br>
               <a href="http://songda.court.gov.cn/wscx/ws_loginp.html">全国法院诉讼活<br>动查询网</a>
             </center>
            </div> 
    </div>
       
    <div id="clearfloat"></div>
       
    <div id="two">
       <a title="中国共产党第十九次全国代表大会专题" target="_blank" href="http://www.chinacourt.org/article/subjectdetail/type/index/id/MzAwNMjINYABAA%3D%3D.shtml"><img src="../assets/images/1.jpg" width="327" height="70"  alt=""/></a>
       <a class="left" title="我最喜爱的好法官推选" target="_blank" href="http://www.chinacourt.org/article/subjectdetail/id/MzAwNEjPNYABAA%3D%3D.shtml"><img src="../assets/images/2.png" width="327" height="70"  alt=""/></a>
       <a class="left" title="2017年“推动法治建设十大案件”评选活动" target="_blank" href="http://fayuan.chinacourt.org/pollcase/index/3.html"><img src="../assets/images/3.jpg" width="326" height="70"  alt=""/></a>
    </div>
    
  <div id="add">

    <div id="three">
        <div class="first">
         <a href="#">开庭与庭审直播公告</a>
        </div>
     
        <div class="other">
        <img src="../assets/images/gg_tit.jpg" width="161" height="33"  alt=""/>
        <ul>
        <a href="#">
             最高人民法院定于二〇一<br>
             七年五月十七日上午九点<br>
             在最高人民法院第六巡回<br>
             法庭第十法庭公开开庭审<br>
             理重庆恒森实业集...</a>
        </ul>
        </div>
       
        <div class="other none">
        <img src="../assets/images/gg_tit.jpg" width="161" height="33"  alt=""/>
        <ul>
        <a href="#">
             最高人民法院定于二〇一<br>
             七年五月十七日上午九点<br>
             在最高人民法院第六巡回<br>
             法庭第十法庭公开开庭审<br>
             理重庆恒森实业集...</a>
        </ul>
        </div>
     </div>
     
    
    <div id="four">
    
      <div class="al">
       <a href="#">新闻发布会</a>
      </div>
      
      <div id="xuan">
        <ul id="as">
         <li class="have"><a class="active" href="#">发布会实录</a></li>
         <li class="width"><a href="#">典型案例发布</a></li>
         <li><a href="#">图文直播</a></li>
         <li><a href="#">视频播报</a></li>
        </ul>
        
        <div class="show">
         <ol><a href="#"><img src="../assets/images/c1.jpg" width="152" height="100"  alt=""/></a></ol>
         <ol><a href="#">最高法工作报告解读系列访谈：加快建设智慧法院</a></ol>
        </div>
        
        <div>
          <ul class="for">
            <li><a href="#">全国法院审理破产典型案例</a></li>
            <li><a href="#">人民法院保护产权和企业家合法权益典型案例</a></li>
            <li><a href="#">人民法院司法改革案例选编（二）</a></li>
            <li><a href="#">最高人民法院第四巡回法庭当庭宣判十大案例</a></li>
          </ul>
        </div>
        
        <div>
         <ol><a href="#"><img src="../assets/images/s2.jpg" width="152" height="100"  alt=""/></a></ol>
         <ol><a href="#">《平安中国2017》第五集《一个都不能少》</a></ol>
        </div>
        
        <div>
         <ol><a href="#"><img src="../assets/images/s3.jpg" width="152" height="100"  alt=""/></a></ol>
         <ol><a href="#">《今日说法》4.26国际知识产权日特别节目：助你高飞</a></ol>
        </div>
      </div> 

      <div class="al1">
       <a href="#">庭审直播</a>
       <div class="mobo"><a href="#" target="_blank">更多直播&nbsp;<span>>></span></a></div>
      </div> 
      <div class="bo">
         <div class="boin">
         <a href="#" title="乔丹商标争议行政纠纷案宣判" target="_blank"><img src="../assets/images/bo1.png"  /></a>
         <a href="#" title="聂树斌故意杀人、强奸妇女再审案宣判" target="_blank"><img src="../assets/images/bo2.png"  /></a>
         <a href="#" title="海难救助纠纷" target="_blank"><img src="../assets/images/bo3.png" /></a>           
        </div>
      </div>

    </div> 
    
    <div id="five">
            <div class="law"><a href="/wenshu.html">案件直击</a></div>
            <div class="doc">
                <li><a title="霸占共享汽车   盗窃获刑三年三个月" target="_blank" href="#">霸占共享汽车   盗窃获刑三年三个月</a></li>
                <li><a title="油路故障宝马自燃 转租车间无照经营 汽修中心及租赁车间的无照个人被判连带赔偿" target="_blank" href="#">油路故障宝马自燃 转租车间无照经营 汽修中心及租赁车间的无照个人被判连带赔偿</a></li>
                <li><a title="现场活动被指抄袭策划案 竞标方诉黄小厨侵权被驳" target="_blank" href="#">现场活动被指抄袭策划案 竞标方诉黄小厨侵权被驳</a></li>
                <li><a title="机构“私人定制”艺考保过 未兑承诺全额退款" target="_blank" href="#">机构“私人定制”艺考保过 未兑承诺全额退款</a></li>
              <li><a title="58元美容烧伤眼睛 河狸家被判赔八千余元" target="_blank" href="#">58元美容烧伤眼睛 河狸家被判赔八千余元</a></li>
              <li><a title="充电电池爆炸引火灾 八旬老人获赔16万" target="_blank" href="#">充电电池爆炸引火灾 八旬老人获赔16万</a></li>
                <li><a title="律师函被指侵权　乔丹体育索赔110万" target="_blank" href="#">律师函被指侵权　乔丹体育索赔110万</a></li>
                <li><a title="高德诉嘀嘀 八案管辖异议被驳" target="_blank" href="#">高德诉嘀嘀 八案管辖异议被驳</a></li>
                <li><a title="民间借贷纠纷2年增5倍 中介费或成规避利率限制“法宝”" target="_blank" href="#">民间借贷纠纷2年增5倍 中介费或成规避利率限制“法宝”</a></li>
                <li><a title="突出“盘古”字样 盘古七星酒店侵权" target="_blank" href="#">突出“盘古”字样 盘古七星酒店侵权</a></li>
                <li><a title="销售假冒BURBERRY 尚品网被判赔180万" target="_blank" href="#">销售假冒BURBERRY 尚品网被判赔180万</a></li>
            </div>  
    </div>
   </div> 
 <div id="gov">
    <div id="out">
 	<ul>
		<li class="all">全国法院</li>
		<li class="ll">政务网站群</li>
	</ul>
	</div>
	<div id="in">
	  <a href="http://bjgy.chinacourt.org/" target="_blank" title="北京">北京</a> 
    <a href="http://tjfy.chinacourt.org/" target="_blank" title="天津">天津</a>
    <a href="http://www.hbcourt.org/" target="_blank" title="河北">河北</a>
    <a href="http://shanxify.chinacourt.org/index.shtml" target="_blank" title="山西">山西</a>
    <a href="http://lnfy.chinacourt.org/" target="_blank" title="辽宁">辽宁</a>
    <a href="http://jlfy.chinacourt.org/" target="_blank" title="吉林">吉林</a>
    <a href="http://hunanfy.chinacourt.org/" target="_blank" title="湖南">湖南</a>
    <a href="http://www.hshfy.sh.cn/shfy/gweb/index.html" target="_blank" title="上海">上海</a>
    <a href="http://www.jsfy.gov.cn/" target="_blank" title="江苏">江苏</a>
    <a href="http://nmgfy.chinacourt.org" target="_blank" title="内蒙古">内蒙古</a>
    <a href="http://www.zjcourt.cn/" target="_blank" title="浙江">浙江</a>
    <a href="http://www.ahcourt.gov.cn/" target="_blank" title="安徽">安徽</a>
    <a href="http://fjfy.chinacourt.org/" target="_blank" title="福建">福建</a>
    <a href="http://jxfy.chinacourt.org/" target="_blank" title="江西">江西</a>
    <a href="http://sdfy.chinacourt.org/" target="_blank" title="山东">山东</a>
    <a href="http://www.hncourt.gov.cn/" target="_blank" title="河南">河南</a>
    <a href="http://hubeigy.chinacourt.org/" target="_blank" title="湖北">湖北</a> 
    <a href="http://www.gdcourts.gov.cn/gdgy/s" target="_blank" title="广东">广东</a>
    <a href="http://gxfy.chinacourt.org/" target="_blank" title="广西">广西</a>
    <a href="http://www.hljcourt.gov.cn/" target="_blank" title="黑龙江">黑龙江</a>
    <a href="http://www.hicourt.gov.cn" target="_blank" title="海南">海南</a>
    <a href="http://cqfy.chinacourt.org/" target="_blank" title="重庆">重庆</a>
    <a href="http://www.sccourt.gov.cn/" target="_blank" title="四川">四川</a>
    <a href="http://www.guizhoucourt.gov.cn/" target="_blank" title="贵州">贵州</a>
    <a href="http://www.gy.yn.gov.cn/" target="_blank" title="云南">云南</a>
    <a href="http://tibet.chinacourt.org/" target="_blank" title="西藏">西藏</a>
    <a href="http://sxfy.chinacourt.org/" target="_blank" title="陕西">陕西</a>
    <a href="http://www.chinagscourt.gov.cn/index.htm" target="_blank" title="甘肃">甘肃</a>
    <a href="http://qhfy.chinacourt.org/" target="_blank" title="青海">青海</a>
    <a href="http://www.nxfy.gov.cn/" target="_blank" title="宁夏">宁夏</a>
   </div>
  </div>

 </div>	
</div>
</template>

<script>
export default {
  name: 'Court',
  data() {
    return {
      pic: [
        {
          seq: 1,
          img: require('../assets/images/pic1.jpg'),
          color: '#fffbd9'
        },
        {
          seq: 2,
          img: require('../assets/images/pic2.jpg'),
          color: '#fffbd9'
        },
        {
          seq: 3,
          img: require('../assets/images/pic3.jpg'),
          color: '#fffbd9'
        },
        {
          seq: 4,
          img: require('../assets/images/pic4.jpg'),
          color: '#fffbd9'
        }
      ],
      defaultSrc: require('../assets/images/pic1.jpg'),
      defaultColor: ''
    }
  },
  methods: {
    show(number) {
      this.defaultSrc = this.pic[number - 1].img;
      this.pic.map((data)=>{data.color = '#fffbd9'});
      this.pic[number - 1].color = 'red';
    }
  }
}
</script>

<style scoped>
    #grey{background:#eeeeee;width: 100%;height:1150px;}
    #content{position:absolute;left:160px;width:1050px;height: 1150px;background:#ffffff;}
    /*轮播图*/
    #spic{float:left;position:absolute;height:400px;}
    #pic{display:none;}
	#p1{border:1px solid #fffbda;position:absolute;height: 340px;}
	#btn{display:inline-block;position:absolute;left:597px;top:1px;width:100px;height:10px;}
    .cyle{width:10px;height:85px;background:#fffbd9;margin-left: 5px;}
    /*要闻*/
    #news{float:right;position:absolute;right:2px;height:400px;}
    #mark{display:block;background:url(../assets/images/mark_bg.png) no-repeat;width:75px;height:21px;line-height:20px;text-indent:17px;font-size:16px;color:#fff000;overflow:hidden;}
    #title{height:45px;line-height:45px;border-bottom:1px dashed #bebebe;overflow:hidden;text-align:center;}
    #title a{color:black;text-decoration:none;font-size:16px;font-weight:bold;}
    #list{height:261px;padding:4px 0 0;overflow:auto;overflow-x: hidden}
    #list li{list-style:inside;width:372px;height:32px;line-height:32px;text-indent:15px;overflow:hidden;}
    #list a{font-size:15px;color:black;text-decoration:none;}
    #news a:hover{color:#e4393c;}
    #more{position: absolute;right:5px;top:5px;}
    /*小图标*/
	#one{width:1005px;margin-top:360px;margin-left:24px;}
	#one div{width:117px;height:117px;float:left;border:1px solid #DEDEDE;margin-left:7px;}
	#one div.dont{margin-left:0px;}
	#one div a{color:#000;font-size:13px;font-weight:bold;}
	#one div a img{margin-top:16px;}
	#clearfloat{clear:both;height:1px;overflow:hidden;margin-top:-1px;}
    /*图片导航*/
	#two{margin-top:10px;margin-left:24px;}
	#two a.left img{margin-left:7px;}
	#add{margin-top:30px;}

	#three{float:left;width:222px;height:373px;border:1px solid #DEDEDE;border-top:none;margin-left:24px;}
	#three div.first a{color:#E4393C;font-size:16px;font-weight:bold;width:222px;height:38px;display:block;text-align:center;line-height:38px;border-top:2px solid #E4393C;border-bottom:1px solid #DEDEDE;}
	#three div.other{width:206px;height:165px;border-bottom:1px solid #DEDEDE;margin-left:2px;}
	#three div.other img{margin-top:10px;margin-left:10px;}
	#three div.other ul{margin-top:10px;width:185px;height:auto;}
	#three div.none{border-bottom:none;}
#four{width:363px;float:left;margin-left:20px;height:373px;}
    #four div.al{width:360px;height:38px;border:1px solid #DEDEDE;border-top:2px solid #E4393C;}
    #four div.al a{color:#E4393C;font-size:16px;font-weight:bold;line-height:38px;margin-left:10px;}
    #four div.al1{position: absolute;margin-top:200px;width:360px;height:38px;border:1px solid #DEDEDE;border-top:2px solid #E4393C;}
    #four div.al1 a{color:#E4393C;font-size:16px;font-weight:bold;line-height:38px;margin-left:10px;}
    #four div.mobo{float: right;}
    #four div.mobo a{color:#36414D;font-size:12px;}
    #four div.mobo a:hover{color:#e4393c;}
    #four #xuan div{position: absolute;margin-top:40px;float:left;display:none;width:360px;height:150px;border:1px solid #DEDEDE;border-top:0;}
    #four #xuan #as{margin-left:-40px;position: absolute;margin-top:10px;}
    #four #xuan #as li{float:left;background:#F8F8F8;border:1px solid #DEDEDE;border-left:none;text-align: center;}
    #four #xuan #as li.have{border-left: 1px solid #DEDEDE;}
    #four #xuan #as li.width a{width:100px;}
    #four #xuan #as li a{line-height:30px;width:86px;height:30px;display:block;}
    #four #xuan #as li a.active{background:#E4393C;color:#fff;}
    #four #xuan div.show ol{float:left;width:152px;margin-top:30px;margin-left:-20px;}
    #four #xuan div ol{float:left;width:152px;margin-top:30px;margin-left:-20px;}
    #four #xuan .show{position: absolute;margin-top:40px;display:block;width:360px;height:160px;border:1px solid #DEDEDE;border-top:0;}
    #four #xuan .for{margin-left:0px;position:absolute;margin-top:30px;}
    #four #xuan .for li{list-style:inside;height:30px;}
    #four .bo{position: absolute;margin-top:238px;display:block;width:360px;height:95px;border:1px solid #DEDEDE;border-top:0;}
    #four .boin {margin-top:18px;margin-left:12px;}
    #four .boin a{margin-left:5px;}
    #four .boin img{width: 100px;height: 60px;}
    #five{float:left;width:370px;height:373px;border:1px solid #DEDEDE;border-top:none;margin-left:24px;}
    #five .law{width:370px;height:38px;display:block;line-height:38px;border-top:2px solid #E4393C;border-bottom:1px solid #DEDEDE;}
    #five .law a{color:#E4393C;font-size:16px;font-weight:bold;margin-left:10px;}
    #five .doc li{height:30px;line-height:30px;overflow:hidden;padding-left:20px;list-style:inside;background-position:5px 15px;}
    
	#six{float:left;width: 1010px;height: 140px;margin-left:24px;margin-top:20px;}
	#six img{border:1px solid #DEDEDE;}
	#six .platform{float:left;width: 630px;height: 140px;}
    #six .platform a{margin-right: 10px;}
    #six .last a{margin-right:none;}
    #six .map{float:left;width: 380px;height: 140px;} 
    #six .map a{margin-right: 6px;}
	#gov{float:left;width: 1000px;height: 110px;margin-left:24px;border:1px solid #DEDEDE; margin-top:20px;}
	#gov #out{float:left;width: 190px;height: 110px;}
	#gov .all{margin-top:20px;margin-left:42px;width:80px;font-size:16px;font-weight:bold;text-align:center;overflow:hidden;}
	#gov .ll{margin-top:10px;margin-left:36px;width:100px;font-size:17px;font-weight:bold;text-align:center;overflow:hidden;color:#e4393c;}
	#gov #in{float:right;width: 765px;height: 110px;margin-top: 20px;}
	#gov #in a{margin-right: 42px; margin-top:5px;color:#3d3d3d;}
	#gov #in a:hover{color:#e4393c;}
</style>


