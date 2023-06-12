package test11;

public class Button {
	OnClickListener Listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.Listener = listener;
	}
	
	void touch() {
		Listener.OnClick();
	}
	
	
	static interface OnClickListener{
		void OnClick();
	}
}
