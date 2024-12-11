package com.ssafy.study_04_jieun.model.service;

import java.util.List;

import com.ssafy.study_04_jieun.model.dto.Member;

public interface MemberService {
	
	// 회원 목록
	public List<Member> getMemberList();
	
	// 회원 상세
	public Member readMember(int id);
	
	// 회원 입력
	public void addMember(Member member);
	
	// 회원 삭제
	public void deleteMember(int id);

	public void editMember(Member member);
	
}
