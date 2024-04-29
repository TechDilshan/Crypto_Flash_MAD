
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		my_profile
	 *	@date 		Tuesday 05th of March 2024 05:49:26 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class my_profile_activity extends Activity {

	
	private View _bg__my_profile_ek2;
	private View rectangle_9;
	private View _rectangle_8;
	private View _rectangle_7;
	private ImageView _rectangle_6;
	private ImageView customer;
	private ImageView increase;
	private ImageView average_price;
	private ImageView home_page;
	private View rectangle_11;
	private View ellipse_2;
	private ImageView rectangle_10;
	private ImageView binance_street_lights_n5w33gffc2x7taka_1;
	private View ellipse_1;
	private ImageView _326468355_1349001115674824_3075924500137757105_n_1;
	private TextView chamika_dilshan;
	private View rectangle_12;
	private TextView e_mail;
	private TextView chamikadilshan_gmail_com;
	private View rectangle_13;
	private TextView mobile;
	private TextView _075_3945328;
	private View rectangle_14;
	private TextView birth_day;
	private TextView _25_12_2002;
	private View rectangle_15;
	private TextView summary;
	private TextView notable_achievements_in_the_cryptocurrency_world__including_milestones__innovations__and_breakthroughs_;
	private View _bg__frame_7_ek1;
	private ImageView wi_fi;
	private ImageView signal;
	private ImageView battery_level;
	private TextView _17___20;
	private View _rectangle_7_ek1;
	private View _rectangle_16;
	private View _rectangle_18;
	private TextView view_usage;
	private TextView delete_account;
	private TextView edit;
	private View _rectangle_17;
	private TextView log_out;
	private TextView home;
	private TextView news;
	private TextView analysis;
	private TextView profile;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_profile);

		
		_bg__my_profile_ek2 = (View) findViewById(R.id._bg__my_profile_ek2);
		rectangle_9 = (View) findViewById(R.id.rectangle_9);
		_rectangle_8 = (View) findViewById(R.id._rectangle_8);
		_rectangle_7 = (View) findViewById(R.id._rectangle_7);
		_rectangle_6 = (ImageView) findViewById(R.id._rectangle_6);
		customer = (ImageView) findViewById(R.id.customer);
		increase = (ImageView) findViewById(R.id.increase);
		average_price = (ImageView) findViewById(R.id.average_price);
		home_page = (ImageView) findViewById(R.id.home_page);
		rectangle_11 = (View) findViewById(R.id.rectangle_11);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		rectangle_10 = (ImageView) findViewById(R.id.rectangle_10);
		binance_street_lights_n5w33gffc2x7taka_1 = (ImageView) findViewById(R.id.binance_street_lights_n5w33gffc2x7taka_1);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		_326468355_1349001115674824_3075924500137757105_n_1 = (ImageView) findViewById(R.id._326468355_1349001115674824_3075924500137757105_n_1);
		chamika_dilshan = (TextView) findViewById(R.id.chamika_dilshan);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		e_mail = (TextView) findViewById(R.id.e_mail);
		chamikadilshan_gmail_com = (TextView) findViewById(R.id.chamikadilshan_gmail_com);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
		mobile = (TextView) findViewById(R.id.mobile);
		_075_3945328 = (TextView) findViewById(R.id._075_3945328);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		birth_day = (TextView) findViewById(R.id.birth_day);
		_25_12_2002 = (TextView) findViewById(R.id._25_12_2002);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		summary = (TextView) findViewById(R.id.summary);
		notable_achievements_in_the_cryptocurrency_world__including_milestones__innovations__and_breakthroughs_ = (TextView) findViewById(R.id.notable_achievements_in_the_cryptocurrency_world__including_milestones__innovations__and_breakthroughs_);
		_bg__frame_7_ek1 = (View) findViewById(R.id._bg__frame_7_ek1);
		wi_fi = (ImageView) findViewById(R.id.wi_fi);
		signal = (ImageView) findViewById(R.id.signal);
		battery_level = (ImageView) findViewById(R.id.battery_level);
		_17___20 = (TextView) findViewById(R.id._17___20);
		_rectangle_7_ek1 = (View) findViewById(R.id._rectangle_7_ek1);
		_rectangle_16 = (View) findViewById(R.id._rectangle_16);
		_rectangle_18 = (View) findViewById(R.id._rectangle_18);
		view_usage = (TextView) findViewById(R.id.view_usage);
		delete_account = (TextView) findViewById(R.id.delete_account);
		edit = (TextView) findViewById(R.id.edit);
		_rectangle_17 = (View) findViewById(R.id._rectangle_17);
		log_out = (TextView) findViewById(R.id.log_out);
		home = (TextView) findViewById(R.id.home);
		news = (TextView) findViewById(R.id.news);
		analysis = (TextView) findViewById(R.id.analysis);
		profile = (TextView) findViewById(R.id.profile);
	
		
		_rectangle_8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), analysis_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), crypto_news_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_7_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_18.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), usage_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_17.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	