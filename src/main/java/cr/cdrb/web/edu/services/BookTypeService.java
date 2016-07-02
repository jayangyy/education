///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package cr.cdrb.web.edu.services;
//
//import cr.cdrb.web.edu.dao.BookTypeDao;
//import cr.cdrb.web.edu.domains.easyui.DataModel;
//import java.sql.SQLException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author Administrator
// */
//@Component
//public class BookTypeService {
//    @Autowired
//    private BookTypeDao dao;
//    
//    public DataModel getBookType() throws SQLException {
//        return new DataModel().withData(dao.getBookType());
//    }
//    
//    public DataModel getBigType() throws SQLException {
//        return new DataModel().withData(dao.getBigType());
//    }
//    
//    public DataModel getSmallType() throws SQLException {
//        return new DataModel().withData(dao.getSmallType());
//    }
//    
//    public DataModel getSmallTypeByCode(String code) throws SQLException {
//        return new DataModel().withData(dao.getSmallTypeByCode(code));
//    }
//}
