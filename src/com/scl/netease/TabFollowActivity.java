package com.scl.netease;

import android.os.Bundle;

import com.scl.netease.formwork.MyFormwork;

public class TabFollowActivity extends MyFormwork {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		alabSetContentView(R.layout.layout_follow);

		setTopBarAndAction();
	}

	private void setTopBarAndAction() {
		// TODO �Զ����ɵķ������
		alabSetBarTitleText(R.string.follow_top_left_text); // ����Title����
		alabHideImageView(true);// ����ģ���ϵ����������ͼ��
	}
}
