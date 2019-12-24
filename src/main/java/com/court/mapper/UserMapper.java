package com.court.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.court.bean.User;

/**
 * 
 * @author zJay~
 *
 */
@Repository
public interface UserMapper {
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	@Select("select count(1) from c_users where username = #{username} and password = #{password}")
	public Integer login(@Param("username") String username,@Param("password") String password) throws Exception;
	
	/**
	 * 
	 * @param user
	 * @throws Exception
	 */
	@Insert("insert into c_users (username,password,email)values(#{username},#{password},#{email})")
	public void register(User user) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Select("select serialkey,username,password,email from c_users")
	public List<User> query() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @throws Exception
	 */
	@Delete("delete from c_users where serialkey = #{id}")
	public void delete(String id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Select("select count(1) from c_users where username = #{username}")
	public Integer count(String username) throws Exception;
	
}
