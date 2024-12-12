package com.study.mvc.model.service;

import java.util.List;

import com.study.mvc.model.dto.Member;

public interface MemberService {

	// 전체 멤버 조회
	public List<Member> getMemberList();
	
	// 특정 멤버 조회
	public Member readMember(int id);
	
	// 멤버 등록
	public void registerMember(Member member);
	
	// 멤버 삭제
	public void deleteMemeber(int id);
	
	// 멤버 정보 수정
	public void updateMember(Member member);
}
