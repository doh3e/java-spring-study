package com.study.mvc.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.mvc.model.dao.MemberDao;
import com.study.mvc.model.dto.Member;


@Service
public class MemberServiceImpl implements MemberService{
	
	private final MemberDao memberDao;
	
	public MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public List<Member> getMemberList() {
		return memberDao.selectAll();
	}

	@Override
	public Member readMember(int id) {
		return memberDao.selectOne(id);
	}

	@Override
	public void registerMember(Member member) {
		System.out.println("멤버 등록");
		memberDao.insertMember(member);
	}

	@Override
	public void deleteMemeber(int id) {
		memberDao.deleteMember(id);
	}

	@Override
	public void updateMember(Member member) {
		memberDao.updateMember(member);
	}


	
	
}
