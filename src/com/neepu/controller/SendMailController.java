package com.neepu.controller;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neepu.utils.EmailUtils;

import freemarker.template.Configuration;

/**
 * 测试邮件发送controller
 * @author Huaxiren
 * 2019年3月25日
 */

@RestController
@RequestMapping("/mail")
public class SendMailController {
	@Autowired
	private JavaMailSender javaMailSender;  //在spring中配置的发送邮件的bean
	
	@Autowired
	private Configuration configuration;
	
	@Autowired            
	private VelocityEngine velocityEngine;
	
	    
	// text
		@RequestMapping("/send")
		public String sendEmail() {
			System.out.println("text格式的邮件发送成功！！！");
			EmailUtils emailUtils = new EmailUtils();
			 emailUtils.sendMail("Huaxiren，Hello！！！", "发送给我QQ邮箱的~", "E:/picture/meizi.jpg", "1875205395@qq.com",
					javaMailSender, false);
			 return "text success";
			
		}

		// html
		@RequestMapping("send2")
		public String sendEmail2() {
			System.out.println("HTML格式的邮件发送成功！！！");
			EmailUtils emailUtils = new EmailUtils();
			emailUtils.sendMail(
					"<p>Huaxiren，Hello！！！</p><br/>" + "<a href='https://github.com/zixi5534'>点击打开我的Github!</a><br/>",
					"发送给我QQ邮箱的~", "E:/picture/meizi.jpg", "1875205395@qq.com", javaMailSender, true);
			return "HTML success";
		}

		// freemarker
		@RequestMapping("send3")
		public String sendEmail3() {
			System.out.println("基于FreeMarker模板引擎的邮件发送成功！！！");
			EmailUtils emailUtils = new EmailUtils();
			emailUtils.sendMailFreeMarker("发送给我QQ邮箱的~", "E:/picture/meizi.jpg", "1875205395@qq.com", javaMailSender,
					configuration);
			
			return "FreeMarker success";

		}

		// velocity
		@RequestMapping("send4")
		public String sendEmail4() {
			System.out.println("基于Velocity模板引擎的邮件发送成功！！！");
			EmailUtils emailUtils = new EmailUtils();
			emailUtils.sendMailVelocity("发送给我QQ邮箱的~", "E:/picture/meizi.jpg", "1875205395@qq.com", javaMailSender,
					velocityEngine);
			return "Velocity success";
		}

}























