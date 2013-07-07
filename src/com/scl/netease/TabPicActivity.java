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
		// TODO 自动生成的方法存根
		alabSetBarTitleText(R.string.picture_top_left_text); // 设置Title标题
		alabHideImageView(true);// 隐藏模板上导航栏的左侧图像
	}
}
