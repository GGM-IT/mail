package com.jc.demo.comtroller;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class startMail {


    @RequestMapping("/start")
    @ResponseBody
    public String start(@RequestParam(value = "mailIndex")String mailIndex) throws EmailException {
        String code = new EmailUtil().achieveCode();  //生成随机密码
        System.out.println(code);
        HtmlEmail htmlEmail=new HtmlEmail();
        htmlEmail.setHostName("smtp.qq.com");//设置邮箱的SMTP服务器
        htmlEmail.setCharset("utf-8");
        htmlEmail.addTo(mailIndex);//目标邮箱地址
        System.out.println(mailIndex);
        htmlEmail.setFrom("243380920@qq.com","秘密验证码");//你的邮箱地址
        htmlEmail.setAuthentication("243380920@qq.com","nrjkeocwcfnmcbef");//你的邮箱地址和你的stmp密码
        htmlEmail.setTextMsg("验证码");
        htmlEmail.setMsg("您的验证码为"+code+",请打死都不要告诉别人!!! hahahahahahah  第二次是使用修改 哈哈");//内容最好不要太简单了，不然容易进垃圾邮箱
        htmlEmail.send();
        return "发送成功";
    }
}
