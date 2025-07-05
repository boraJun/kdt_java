package interfaceTest06;

//23번 : 어댑터클래스
public interface Fan {
	int MAX_STRANGTH = 3;
	int MIN_STRANGTH = 0;
	
	void on();
	void off();
	void turbo();
}
