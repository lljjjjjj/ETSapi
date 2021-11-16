package com.project.etsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//@CrossOrigin(origins = {"http://localhost:8888", "null"})
@RestController
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin(origins = {"http://localhost:8888", "null"})
    @RequestMapping("/courseList")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from course";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry = iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }

    @RequestMapping("/teacherList")
    public List<Map<String, Object>> getTeacherList(){
        String sql = "select * from teacher";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for(Map<String, Object> map : list){
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            if(entries != null){
                Iterator<Map.Entry<String, Object>> i = entries.iterator();
                while(i.hasNext()){
                    Map.Entry<String, Object> entry = i.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }
}


