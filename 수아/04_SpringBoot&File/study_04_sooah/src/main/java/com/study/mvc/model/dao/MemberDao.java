package com.study.mvc.model.dao;

import java.util.List;

import com.study.mvc.model.dto.Member;

public interface MemberDao {

	// 전체 멤버 조회
	public List<Member> selectAll();
	
	// 특정 멤버 조회
	public Member selectOne(int id);
	
	// 멤버 등록
	public void insertMember(Member member);
	
	// 멤버 삭제
	public void deleteMember(int id);
	
	// 멤버 정보 수정
	public void updateMember(Member member);
}
