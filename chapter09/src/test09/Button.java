package test09;

public class Button {
	OnClickListener listener; //인터페이스 타입 필드(listener)를 선언
	
	//var OnClickListener listener = new aaa();
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.OnClick(); // 구현 객체의 OnClick() 메소드 호출
	}

	//중첩 인터페이스 : 버튼을 클릭했을 때 실제로 실행할 내용을 담고 있는 구현 객체를 얻기 위해서...
	//static이 선언된 interface는 객체 없이 사용가능
	static interface OnClickListener{
		void OnClick();
	}
}
