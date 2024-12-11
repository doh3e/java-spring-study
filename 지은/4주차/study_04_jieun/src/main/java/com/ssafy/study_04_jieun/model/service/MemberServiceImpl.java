package com.ssafy.study_04_jieun.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.study_04_jieun.model.dao.MemberDao;
import com.ssafy.study_04_jieun.model.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	private final MemberDao memberDao;
	
	@Autowired
	public MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	

	@Override
	public List<Member> getMemberList() {
		System.out.println("모든 회원 가지고 왔음!");
		return memberDao.selectAll();
	}

	
	@Override
	public Member readMember(int id) {
		System.out.println(id + "번 회원 정보 가져왔음!");
		return memberDao.selectOne(id);
	}


	@Override
	public void addMember(Member member) {
		System.out.println("회원 입력!");
		memberDao.addMember(member);
	}


	@Override
	public void deleteMember(int id) {
		System.out.println("회원 삭제!");
		memberDao.deleteMember(id);
	}


	@Override
	public void editMember(Member member) {
		System.out.println("회원 수정!");
		memberDao.editMember(member);
	}


}
