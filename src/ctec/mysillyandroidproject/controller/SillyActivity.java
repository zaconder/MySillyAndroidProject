package ctec.mysillyandroidproject.controller;

import java.util.ArrayList;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
/**
 * @version 1.0 10/14/14
 * @author zcon5199
 * Does everything in side "SillyActivity"
 */
public class SillyActivity extends Activity
{

	private Button appButton;
	private Button otherButton;
	private TextView appLayoutText;
	private ArrayList<Integer> colorList;
	private ArrayList<Integer> textList;
	private RelativeLayout appLayout;
	
	/**
	 * Will create and use everything in the app.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		//Gives you access to a button or any View object
		appButton = (Button) findViewById(R.id.firstButton);
		otherButton = (Button) findViewById(R.id.secondButton);
		appLayoutText = (TextView) findViewById(R.id.appLayoutText);
		colorList = new ArrayList<Integer>();
		textList = new ArrayList<Integer>();
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		fillTheColorList();
		fillTheTextList();
		setupListeners();
	}
	/**
	 * This adds colors to the colorlist
	 */
	private void fillTheColorList()
	{
		colorList.add(R.color.uglyRed);
		colorList.add(R.color.white);
		colorList.add(R.color.uglyGreen);
		colorList.add(R.color.otherBlack);
	}
	/**
	 * This adds texts to the textlist
	 */
	private void fillTheTextList()
	{
		textList.add(R.string.app_name);
		textList.add(R.string.labelText);
		textList.add(R.string.funText);
		textList.add(R.string.sarcasmText);
		textList.add(R.string.boringText);
	}
	/**
	 * This sets up listeners that look for user input and execute a command based on the input
	 */
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				int myRandomSpot = (int) (Math.random()*colorList.size());
				appLayout.setBackgroundResource(colorList.get(myRandomSpot));
			}
			
			
		});
		
		otherButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				int myRandomText = (int) (Math.random()*textList.size());
				appLayoutText.setText(textList.get(myRandomText));
			}
			
		});
		
	}

}

