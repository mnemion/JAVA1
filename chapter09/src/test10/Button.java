package test10;

public class Button {
	OnClickListener Listener;
	
	// 자동형변환 / 다형성
	public void setOnClickListener(OnClickListener listener) {
		this.Listener = listener;
	}
	
	void touch() {
		Listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
