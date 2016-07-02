package cr.cdrb.web.edu.controllers;

import cr.cdrb.web.edu.infrastructure.annotation.AuthPassport;
import cr.cdrb.web.edu.infrastructure.annotation.SysLog;
import cr.cdrb.web.edu.infrastructure.aspectj.WebHandlerExceptionResolver;
import cr.cdrb.web.edu.services.PostService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Autowired
    private WebHandlerExceptionResolver tttt;
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("zhangsan", "hello");
        result.put("lisi", "world");
        result.put("wangwu", "nihao");
        return result;
    }

    @Autowired
    PostService service;

    @RequestMapping("/post")
    @ResponseBody
    @SysLog(name="测试")
    public Object post() throws Throwable {
         return service.TestAspectj();
        //return service.getPost();
    }
     @AuthPassport
    @RequestMapping("/post1")
    @ResponseBody
    public void post1() throws Throwable {
        
        //return service.getPost();
    }
}
