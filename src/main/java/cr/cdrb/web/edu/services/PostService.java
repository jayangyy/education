/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.cdrb.web.edu.services;

import cr.cdrb.web.edu.dao.PostDao;
import cr.cdrb.web.edu.domains.easyui.DataModel;
import java.sql.SQLException;
import javax.annotation.Resource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrator
 */
@Component
public class PostService {
    @Resource
    private PostDao dao;
    //private static Log log =LogService.getLog(PostService.class);  
     private static Log log1 = LogFactory.getLog(LogService.class);
    public void getPost() throws SQLException {
//        return new DataModel().withData(dao.getPost());
    }
    public Object TestAspectj() throws Throwable
    {
        Log log =LogService.getLog(PostService.class); 
        log.error("我是错误提示");
        log.debug("我是调试日志");
        log.warn("我是警告级别日志");
        log.info("我是信息级别日志");
        log.trace("我是堆栈日志");
        log1.error("我是错误提示");
        log1.debug("我是调试日志");
        log1.warn("我是警告级别日志");
        log1.info("我是信息级别日志");
        log1.trace("我是堆栈日志");
         System.out.println(log.getClass());
                System.out.println(log1.getClass());
       /// int i=9/0;
        return "";
    }
}
