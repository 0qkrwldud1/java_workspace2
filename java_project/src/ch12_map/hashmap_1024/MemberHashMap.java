package ch12_map.hashmap_1024;

import java.util.HashMap;
import java.util.Iterator;

import ch12_collection_1024.Member;

public class MemberHashMap {
	
	//추가로 멤버클래스를 벤치마킹해서 애니멀만들기.
	//멤버클래스에 있는 인터페이스및 클래스참고
	//출력시 내림차순
	//애니멀 클래스 객체4개 임의 만들기.
	//컬렉션 헤시맵
	
	//arraylist, map
	//포함관계로 다른클래스 등을 첨부하는 것은 매우 많이 사용.
	private HashMap<Integer, Member> hashMap;
	
	// 기본 생성자를 호출 하면서, 다른 클래스형의 컬렉션을 선언한 참조형 변수에 할당하는 작업. 
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}
	// 해당 맵이라는 컬렉션에 추가하고.
	public void addMember(Member member){
		
		hashMap.put(member.getMemberId(), member);
		
	}
	// 해당 맵에 원소를 제거하고
	public boolean removeMember(int memberId){
		
		if(hashMap.containsKey(memberId)){
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	// 해당 컬렉션의 반복자를 이용해서 가져오기.
	public void showAllMember(){
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
}
