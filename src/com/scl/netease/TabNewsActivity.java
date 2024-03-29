package com.scl.netease;

import java.util.Date;

import com.scl.netease.CalendarView;
import com.scl.netease.CalendarView.OnItemClickListener;
import com.scl.netease.formwork.MyFormwork;
import com.scl.netease.utils.MoveBg;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout.LayoutParams;

public class TabNewsActivity extends MyFormwork {

	RelativeLayout layout;
	TextView tv_front;// 需要移动的View

	TextView tv_bar_news;
	TextView tv_bar_sport;
	TextView tv_bar_play;
	TextView tv_bar_finance;
	TextView tv_bar_science;
	TextView tv_bar_more;

	int avg_width = 0;// 用于记录平均每个标签的宽度，移动的时候需要

	class calendarItemClickListener implements OnItemClickListener{
		@Override
		public void OnItemClick(Date date) {
			Toast.makeText(getApplicationContext(), date+"", Toast.LENGTH_SHORT).show();
		}
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		alabSetContentView(R.layout.layout_news);
		initViews();
		
		//获取日历控件对象
		CalendarView calendar = (CalendarView)findViewById(R.id.calendar);
		//设置控件监听，可以监听到点击的每一天（大家也可以在控件中自行设定）
		calendar.setOnItemClickListener(new calendarItemClickListener());
	}

	private void initViews() {
		layout = (RelativeLayout) findViewById(R.id.layout_title_bar);

		tv_bar_news = (TextView) findViewById(R.id.tv_title_bar_news);
		tv_bar_sport = (TextView) findViewById(R.id.tv_title_bar_sport);
		tv_bar_play = (TextView) findViewById(R.id.tv_title_bar_play);
		tv_bar_finance = (TextView) findViewById(R.id.tv_title_bar_finance);
		tv_bar_science = (TextView) findViewById(R.id.tv_title_bar_science);
		tv_bar_more = (TextView) findViewById(R.id.tv_title_bar_more);

		tv_bar_news.setOnClickListener(onClickListener);
		tv_bar_sport.setOnClickListener(onClickListener);
		tv_bar_play.setOnClickListener(onClickListener);
		tv_bar_finance.setOnClickListener(onClickListener);
		tv_bar_science.setOnClickListener(onClickListener);
		tv_bar_more.setOnClickListener(onClickListener);

		tv_front = new TextView(this);
		tv_front.setBackgroundResource(R.drawable.slidebar);
		tv_front.setTextColor(Color.WHITE);
		tv_front.setText("头条");
		tv_front.setGravity(Gravity.CENTER);
		RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		param.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
		layout.addView(tv_front, param);

	}

	private OnClickListener onClickListener = new OnClickListener() {
		int startX;// 移动的起始位置

		@Override
		public void onClick(View v) {
			avg_width = findViewById(R.id.layout).getWidth();
			switch (v.getId()) {
			case R.id.tv_title_bar_news:
				MoveBg.moveFrontBg(tv_front, startX, 0, 0, 0);
				startX = 0;
				tv_front.setText(R.string.title_news_category_tops);
				break;
			case R.id.tv_title_bar_sport:
				MoveBg.moveFrontBg(tv_front, startX, avg_width, 0, 0);
				startX = avg_width;
				tv_front.setText(R.string.title_news_category_sport);
				break;
			case R.id.tv_title_bar_play:
				MoveBg.moveFrontBg(tv_front, startX, avg_width * 2, 0, 0);
				startX = avg_width * 2;
				tv_front.setText(R.string.title_news_category_play);
				break;
			case R.id.tv_title_bar_finance:
				MoveBg.moveFrontBg(tv_front, startX, avg_width * 3, 0, 0);
				startX = avg_width * 3;
				tv_front.setText(R.string.title_news_category_finance);
				break;
			case R.id.tv_title_bar_science:
				MoveBg.moveFrontBg(tv_front, startX, avg_width * 4, 0, 0);
				startX = avg_width * 4;
				tv_front.setText(R.string.title_news_category_science);
				break;
			case R.id.tv_title_bar_more:
				MoveBg.moveFrontBg(tv_front, startX, avg_width * 5, 0, 0);
				startX = avg_width * 5;
				tv_front.setText(R.string.title_news_category_more);
				break;

			default:
				break;
			}

		}
	};

}