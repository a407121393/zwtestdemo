package com.scl.netease;

import android.os.Bundle;

import com.scl.netease.formwork.MyFormwork;

public class TabVoteActivity extends MyFormwork {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		alabSetContentView(R.layout.layout_vote);

		setTopBarAndAction();
	}

	private void setTopBarAndAction() {
		// TODO �Զ����ɵķ������
		alabSetBarTitleText(R.string.vote_top_left_text); // ����Title����
		alabHideImageView(true);// ����ģ���ϵ����������ͼ��
	}
}
