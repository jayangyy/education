/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.cdrb.web.edu.infrastructure.aspectj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jayan
 */
@Component
public class WebHandlerExceptionResolver implements HandlerExceptionResolver {   
    private static String sss="";
   private Log logn=null;
    @Override  
    @ResponseBody
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {   

        ////log.error("我是顶层");
        //添加自己的异常处理逻辑，如日志记录等        
        System.out.println("我是捕获的异常信息error.HANDLER 捕获:" + ex.getMessage()); 
         // TODO Auto-generated method stub   
        return new ModelAndView("exception");   
    }   
  
}