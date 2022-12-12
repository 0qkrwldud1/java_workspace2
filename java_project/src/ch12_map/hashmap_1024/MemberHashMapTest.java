package ch12_map.hashmap_1024;

import ch12_collection_1024.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		//member형 객체 4개 생성.
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		//해당 4개 객체를 컬렉션인 멥에 추가하고,
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		// 해당 컬렉션의 객체에 있는 수납도구에(메서드)를 이용해서 출력하기. 
		// 반복자를 이용하는 알고리즘이 포함되어 있음. 
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		AnimalHashMap animalHashMap = new AnimalHashMap();
		Member membercat = new Member(1005, "고양이");
		Member memberdog = new Member(1006, "강아지");
		Member memberbird = new Member(1007, "새");
		Member memberfish = new Member(1008, "물고기");
		
		animalHashMap.addMember(membercat);
		animalHashMap.addMember(memberdog);
		animalHashMap.addMember(memberbird);
		animalHashMap.addMember(memberfish);
		
		animalHashMap.showAllMember();
		
		animalHashMap.removeMember(1004);
		animalHashMap.removeMember(1005);
		animalHashMap.showAllMember();
		
		
		
	}
}
