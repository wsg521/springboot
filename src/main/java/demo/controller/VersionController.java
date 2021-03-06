package demo.controller;

/**
 * Created by Administrator on 2016/10/11.
 */

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import demo.service.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhengyunfei on 2016/9/2.
 * 用户反馈api接口
 */
@RestController
@Api(value = "j:财富街app全部接口api", description = "<font color='red'>app2.0接口文档</font>", produces = "application/json",position =1 )
public class VersionController {
    @Autowired
    UserMapper userMapper;

    @ApiOperation(httpMethod = "POST", value = "1:站内信列表",position = 1,nickname = "获取所有用户站内信消息", notes = "" +
            "<table border=\"1\"><tr><th>字段</th><th>是否为空</th><th>\t备注</th></tr>" +
            "<tr><td>token</td><td>否</td><td>token</td></tr>" +
            "<tr><td>pageSize</td><td>否</td><td>每页显示多少条</td></tr>" +
            "<tr><td>pageNow</td><td>否</td><td>当前页码</td></tr></table>" +
            "<h4>返回结果</h4>" +
            "<h4>token无效</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\"code\":1005,\"message\":\"token无效\",\"data\":null}" +
            "</code></pre></div>"+
            "<h4>返回结果集</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{" +
            "    \"data\": {\n" +
            "        \"list\": [\n" +
            "            {\n" +
            "                \"title\": \"审核通过\", \n" +
            "                \"content\": \"测试用户消息\", \n" +
            "                \"sendTime\": \"2015-07-22 15:34:23\"\n" +
            "            }, \n" +
            "            {\n" +
            "                \"title\": \"3条短信又没有\", \n" +
            "                \"content\": \"有啊\", \n" +
            "                \"sendTime\": \"2014-12-11 13:52:53\"\n" +
            "            }, \n" +
            "            {\n" +
            "                \"title\": \"3条短信又没有\", \n" +
            "                \"content\": \"有啊\", \n" +
            "                \"sendTime\": \"2014-12-11 13:52:53\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }, \n" +
            "    \"code\": 0, \n" +
            "    \"message\": \"成功\"\n" +
            "}" +

            "</code></pre></div>"
    )
    @RequestMapping(value = "/api/newstation/list", method = RequestMethod.POST)
    @ResponseBody
    public Object investor(@RequestParam String token,@RequestParam int pageSize,@RequestParam int pageNow){
        String myJsonData="";
        return myJsonData;
    }


    @ApiOperation(httpMethod = "POST", value = "2:私人订制内容新增",position = 2,nickname = "私人订制内容新增", notes = "" +
            "<table border=\"1\"><tr><th>字段</th><th>是否为空</th><th>\t备注</th></tr>" +
            "<tr><td>token</td><td>否</td><td>token</td></tr>" +
            "<tr><td>content</td><td>否</td><td>私人订制内容</td></tr></table>" +
            "<h4>返回结果</h4>" +
            "<h4>token无效</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\"code\":1005,\"message\":\"token无效\",\"data\":null}" +
            "</code></pre></div>"+
            "<h4>content为空时</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 1061, \n" +
            "    \"message\": \"请填写私人订制内容\", \n" +
            "    \"data\": null\n" +
            "}" +
            "</code></pre></div>"+
            "<h4>content字数过多时</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 1062, \n" +
            "    \"message\": \"私人订制内容字数过多\", \n" +
            "    \"data\": null\n" +
            "}" +
            "</code></pre></div>"+
            "<h4>返回结果集</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 0, \n" +
            "    \"message\": \"成功\", \n" +
            "    \"data\": null\n" +
            "}" +

            "</code></pre></div>"
    )
    @RequestMapping(value = "/api/pt/add", method = RequestMethod.POST)
    @ResponseBody
    public Object ptadd(@RequestParam String token,@RequestParam String content){
        String myJsonData="";
        return myJsonData;
    }


    @ApiOperation(httpMethod = "POST", value = "3:私人订制查询列表",position = 3,nickname = "私人订制查询列表", notes = "" +
            "<table border=\"1\"><tr><th>字段</th><th>是否为空</th><th>\t备注</th></tr>" +
            "<tr><td>token</td><td>否</td><td>token</td></tr>" +
            "</table>" +
            "<h4>返回结果</h4>" +
            "<h4>token无效</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\"code\":1005,\"message\":\"token无效\",\"data\":null}" +
            "</code></pre></div>"+

            "<h4>返回结果集</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 0, \n" +
            "    \"message\": \"成功\", \n" +
            "    \"data\": {\n" +
            "        \"list\": [\n" +
            "            {\n" +
            "                \"id\": \"2\", \n" +
            "                \"userId\": \"f01c3adc-fe2c-43b6-9b35-6fa8f9954405\", \n" +
            "                \"content\": \"测试私人订制内容第二条\", \n" +
            "                \"createDate\": \"2016年12月8日\"\n" +
            "            }, \n" +
            "            {\n" +
            "                \"id\": \"1\", \n" +
            "                \"userId\": \"f01c3adc-fe2c-43b6-9b35-6fa8f9954405\", \n" +
            "                \"content\": \"测试私人订制\", \n" +
            "                \"createDate\": \"2016年12月8日\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}" +

            "</code></pre></div>"
    )
    @RequestMapping(value = "/api/pt/list", method = RequestMethod.POST)
    @ResponseBody
    public Object ptlist(@RequestParam String token){
        String myJsonData="";
        return myJsonData;
    }

    @ApiOperation(httpMethod = "POST", value = "4:获取当前正在上架的活动--注册送红包活动",position = 4,nickname = "获取当前正在上架的活动-注册送红包活动", notes = "" +
            "<h4>没有正在上架的活动时返回</h4>" +

            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 0, \n" +
            "    \"message\": \"成功\", \n" +
            "    \"data\": null\n" +
            "}" +
            "</code></pre></div>"+

            "<h4>返回结果集:status:0未使用1已使用</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 0, \n" +
            "    \"message\": \"成功\", \n" +
            "    \"data\": {\n" +
            "        \"name\": \"APP专享新人注册大礼\", \n" +
            "        \"url\": \"http://www.pestreet.cn/c/freemarker/upload/img/20161116/20161116174027rdd.png\", \n" +
            "        \"money\": 10000\n" +
            "    }\n" +
            "}" +

            "</code></pre></div>"
    )
    @RequestMapping(value = "/api/hd/get", method = RequestMethod.POST)
    @ResponseBody
    public Object hdget(){
        String myJsonData="";
        return myJsonData;
    }


    @ApiOperation(httpMethod = "POST", value = "5:我的优惠券",position = 4,nickname = "我的优惠券", notes = "" +
            "<h4>没有获取任何优惠券时返回</h4>" +

            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 0, \n" +
            "    \"message\": \"成功\", \n" +
            "    \"data\": null\n" +
            "}" +
            "</code></pre></div>"+

            "<h4>返回结果集</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "{\n" +
            "    \"code\": 0, \n" +
            "    \"message\": \"成功\", \n" +
            "    \"data\": {\n" +
            "        \"list\": [\n" +
            "            {\n" +
            "                \"name\": \"测试红包11\", \n" +
            "                \"status\": 0, \n" +
            "                \"money\": 20000\n" +
            "            }, \n" +
            "            {\n" +
            "                \"name\": \"APP专享新人注册大礼\", \n" +
            "                \"status\": 0, \n" +
            "                \"money\": 10000\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}" +

            "</code></pre></div>"
    )
    @RequestMapping(value = "/api/hd/list", method = RequestMethod.POST)
    @ResponseBody
    public Object hdlist(@RequestParam String token){
        String myJsonData="";
        return myJsonData;
    }
}
