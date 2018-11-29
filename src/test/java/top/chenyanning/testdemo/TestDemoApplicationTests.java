package top.chenyanning.testdemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.chenyanning.testdemo.entity.User;
import top.chenyanning.testdemo.mapper.UserMapper;

import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.CoreMatchers.is;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		Assert.assertThat("数量不正确!", 5, is(userList.size()));
		userList.forEach(System.out::println);
	}

	@Test
	public void testLambda(){
		Predicate<String> predicate = name -> {return false;};
		System.out.println(predicate.test("陈彦宁"));
		ThreadLocal
	}

}
