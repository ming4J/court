package com.court.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.court.bean.Law;

/**
 * 
 * @author zJay~
 *
 */
@Repository
public interface LawMapper {

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Select("select serialkey,lawtit,lawdate,lawlink from c_law")
	public List<Law> query() throws Exception;
	
	/**
	 * 
	 * @param law
	 * @throws Exception
	 */
	@Insert("insert into C_LAW (lawtit,lawdate,lawlink) values(#{lawtit},#{lawdate},#{lawlink})")
	public void add(Law law) throws Exception;
	
	/**
	 * 
	 * @param lawtit
	 * @return
	 * @throws Exception
	 */
	@Select("select count(1) from C_LAW where lawtit = #{lawtit}")
	public Integer count(String lawtit) throws Exception;
}
