package ai.yue.library.test.webflux.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ai.yue.library.data.redis.client.Redis;
import lombok.extern.slf4j.Slf4j;

/**
 * @author  ylyue
 * @version 创建时间：2017年10月14日
 */
@Slf4j
@Aspect
@Component
public class HttpAspect {
	
	@Autowired
	Redis redis;
	
	/**
	 * HttpAspect请求切入点
	 */
	public static final String POINTCUT = "@annotation(org.springframework.web.bind.annotation.RequestMapping)"
			+ " || @annotation(org.springframework.web.bind.annotation.GetMapping)"
			+ " || @annotation(org.springframework.web.bind.annotation.PostMapping)"
			+ " || @annotation(org.springframework.web.bind.annotation.PutMapping)"
			+ " || @annotation(org.springframework.web.bind.annotation.PatchMapping)"
			+ " || @annotation(org.springframework.web.bind.annotation.DeleteMapping)";
	
	@Pointcut(POINTCUT)
	public void pointcut() {}
	
	@Before("pointcut()")
	public void doVerifyBefore(JoinPoint joinPoint) {
        // 1. 参数校验
        Signature signature = joinPoint.getSignature();
        
        // 2. 开发环境-打印日志
//        String ip = ServletUtils.getClientIP();
//		String uri = request.getRequestURI();
//		UserDTO user_info = null;
//		if (!uri.startsWith("/open")) {
//			user_info = UserUtils.getUser(request, redis, UserDTO.class);
//		}
		
//        log.info("ip={}", ip);
//		log.info("uri={}", uri);
//		log.info("user_info={}", user_info);
//		log.info("method={}", request.getMethod());
		log.info("class_method={}", signature.getDeclaringTypeName() + "." + signature.getName() + "()");
	}
	
}
