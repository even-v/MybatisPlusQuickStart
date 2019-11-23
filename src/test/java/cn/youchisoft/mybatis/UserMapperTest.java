package cn.youchisoft.mybatis;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.youchisoft.mybatisplus.App;
import cn.youchisoft.mybatisplus.mapper.UserMapper;
import cn.youchisoft.mybatisplus.model.User;

/**
 * 测试MybatisPlus BaseMapper中的各种方法
 * 
 * @author jiangjingwei@yysoft.org.cn
 * @Package cn.youchisoft.mybatis
 * @version Nov 21, 2019
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 根据条件查询记录
	 */
	@Test
	public void testSelect() {

		List<User> userList = userMapper.selectList(null);
		userList.forEach(System.out::println);
		Assert.assertNotNull(userList);
	}

}
