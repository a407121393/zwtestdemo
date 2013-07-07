package com.scl.netease;

import android.os.Bundle;

import com.scl.netease.formwork.MyFormwork;

public class TabPicActivity extends MyFormwork {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		alabSetContentView(R.layout.layout_picture);

		setTopBarAndAction();
	}

	private void setTopBarAndAction() {
		// TODO �Զ����ɵķ������
		alabSetBarTitleText(R.string.picture_top_left_text); // ����Title����
		alabHideImageView(true);// ����ģ���ϵ����������ͼ��
	}
}
