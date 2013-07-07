package com.scl.netease.formwork;

import com.scl.netease.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyFormwork extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.formwork);
	}

	/**
	 * 设置主内容区域的layoutRes
	 * 
	 * @param layoutResId
	 */
	public void alabSetContentView(int layoutResId) {
		LinearLayout llContent = (LinearLayout) findViewById(R.id.llContent);
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(layoutResId, null);
		llContent.addView(v);
	}

	/**
	 * 设置模板上导航栏的标题文字
	 * 
	 * @param titleText
	 * @return 修改成功返回true，失败返回false
	 */
	public boolean alabSetBarTitleText(int title) {
		TextView tv = (TextView) findViewById(R.id.textView_netease_top);
		if (null != tv) {
			tv.setText(title);
			return true;
		}
		return false;
	}

	/**
	 * 得到模板上导航栏的左侧图像[天气预报图片]
	 * 
	 * @return 成功则返回ImageView对象，失败则返回null。
	 */
	public ImageView alabGetImageView() {
		return (ImageView) findViewById(R.id.imageView);
	}

	/**
	 * 隐藏模板上导航栏的左侧图像[天气预报图片]
	 */
	public void alabHideImageView(boolean bSetHide) {
		ImageView imageview = alabGetImageView();
		if (null != imageview) {
			if (bSetHide)
				imageview.setVisibility(View.INVISIBLE);
			else
				imageview.setVisibility(View.VISIBLE);
		}
	}
}
