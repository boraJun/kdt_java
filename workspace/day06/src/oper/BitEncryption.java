package oper;

//8번 : 비트연산자를 이용하여 암호화와 복호화
public class BitEncryption {
	public static void main(String[] args) {
		//전달할 데이터(원본데이터)
		int originalMsg = 42;
		int key = 99; //비트 마스크(암호화, 복호화에 사용)
		
		System.out.println("원본 메시지 : "+ originalMsg);
		
		int encryptMsg = originalMsg ^ key; //xor 연산을 통한 암호화
		System.out.println("암호화된 메시지 : " + encryptMsg);
		
		int decryptMsg = encryptMsg ^ key; //암호화된 메시지를 동일한 키로 xor 연산을 통한 복호화
		System.out.println("복호화된 메시지 : " + decryptMsg);
		
		//XOR => 두 비트의 값이 서로 다르면 1 그 외에는 0을 반환
		//0 XOR 0 => 0
		//0 XOR 1 => 1
		//1 XOR 0 => 1
		//1 XOR 1 => 0
		
	}
}
