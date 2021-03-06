package ai.yue.library.test.ipo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import ai.yue.library.base.validation.annotation.Birthday;
import ai.yue.library.base.validation.annotation.Cellphone;
import ai.yue.library.base.validation.annotation.Chinese;
import lombok.Data;

/**
 * @author	ylyue
 * @since	2019年9月25日
 */
@Data
public class UserIPO {

	@NotBlank
	@Cellphone
	String cellphone;// 用户手机号码
	
	@NotBlank
	@Length(min = 8, max = 20, message = "密码长度范围：8 - 20")
	String password;// 密码
	
	String nickname;// 用户昵称

	@NotBlank
	@Email
	String email;// 邮箱
	
	String head_img;// 用户头像
	
	@Chinese
	Character sex;// 用户性别
	
	@Birthday
	LocalDate birthday;// 用户生日
	LocalTime birthday2;// 用户生日
	LocalDateTime birthday3;// 用户生日
	
}
