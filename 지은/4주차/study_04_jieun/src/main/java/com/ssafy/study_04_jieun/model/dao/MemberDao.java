package com.ssafy.study_04_jieun.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.study_04_jieun.model.dto.Member;

@Mapper
public interface MemberDao {
	
	public List<Member> selectAll();
	
	public Member selectOne(int id);
	
	public void addMember(Member member);
	
	public void deleteMember(int id);

	public void editMember(Member member);

}
