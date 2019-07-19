package ai.yue.library.data.redis.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * 微信开放平台
 * @author 	 孙金川
 * @version 创建时间：2018年11月6日
 */
@Data
@ConfigurationProperties("yue.wx.open")
public class WxOpenProperties {

	/**
	 * 微信开放平台-appid
	 */
	private String appid;
	
	/**
	 * 微信开放平台-密钥
	 */
	private String secret;
	
}