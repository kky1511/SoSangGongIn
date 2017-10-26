package com.icia.sboard.vo;

import java.beans.PropertyEditorSupport;

public class BirthDatePropertyEditor extends PropertyEditorSupport {
	// 사용자 입력에서 데이터를 만들어내는 메소드를 재정의
	public void setAsText(String text) {
		// 사용자가 폼에 입력한 데이터가 text에 담겨서 전달
		// 지금같은 경우 2017-11-20 -> 20171120로 변경한 다음 setValue()해준다
		String result = text.replace("-", "");
		setValue(result);
	}
}
