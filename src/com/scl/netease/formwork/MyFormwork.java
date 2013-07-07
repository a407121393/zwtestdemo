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
	 * ���������������layoutRes
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
	 * ����ģ���ϵ������ı�������
	 * 
	 * @param titleText
	 * @return �޸ĳɹ�����true��ʧ�ܷ���false
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
	 * �õ�ģ���ϵ����������ͼ��[����Ԥ��ͼƬ]
	 * 
	 * @return �ɹ��򷵻�ImageView����ʧ���򷵻�null��
	 */
	public ImageView alabGetImageView() {
		return (ImageView) findViewById(R.id.imageView);
	}

	/**
	 * ����ģ���ϵ����������ͼ��[����Ԥ��ͼƬ]
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
