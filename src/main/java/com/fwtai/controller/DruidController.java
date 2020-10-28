package com.fwtai.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * druid 监控
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020/10/28 16:45
 * @QQ号码 444141300
 * @Email service@yinlz.com
 * @官网 <url>http://www.yinlz.com</url>
*/
@Controller
@RequestMapping("/druid")
public class DruidController{

  @Resource
  private JdbcTemplate jdbcTemplate;

  // http://127.0.0.1/druid
  @GetMapping()
  public String index(){
    jdbcTemplate.execute("SELECT 1 FROM DUAL");
    return "redirect:/druid/index";
  }
}