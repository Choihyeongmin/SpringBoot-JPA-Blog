package com.cos.blog.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//스프링이 com.cos.blog 그 이하를 스캔하여 모든 파일을 메모리에 new 하는 것은 아님
// 특정 어노테이션이 붙어있는 class 파일들을 new(IoC)하여 컨테이너에 관리해줌.
@RestController
public class BlogControllerTest {
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String Hello() {
		return "<h1>hello spring boot</h1>";
	}	
}
