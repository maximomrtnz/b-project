package maximomartinez.controladores;

import java.util.ArrayList;

import maximomartinezgonzalez.adapters.MoneyAdapter;
import maximomartinezgonzalez.modelo.Money;

import com.example.b_project.R;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MoneyConversorActivity extends Activity{
	
	private Spinner spinnerInputMoney;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.money_conversor_activity);
		
		loadObjectFromXML();
		loadSpinnerInputMoneyData();
		
	}

	private void loadObjectFromXML(){
		this.spinnerInputMoney = (Spinner)findViewById(R.id.input_money_spinner);
	}
	
	private void loadSpinnerInputMoneyData(){
		
		ArrayList<Money> moneyList = new ArrayList<Money>();
		
		
		Money money = new Money();
		money.setCountry("Argentina");
		money.setDolarConvertion(2.6f);
		money.setMoneyName("Peso");
		money.setMoneySymbol("$");
		money.setCountryFlag(getResources().getDrawable(R.drawable.ar));
		
		moneyList.add(money);
		
		
		money = new Money();
		money.setCountry("Chile");
		money.setDolarConvertion(2.6f);
		money.setMoneyName("Peso Chileno");
		money.setMoneySymbol("$");
		money.setCountryFlag(getResources().getDrawable(R.drawable.cl));
		
		moneyList.add(money);
		
	
		
		MoneyAdapter moneyAdapter = new MoneyAdapter(moneyList, this);
		spinnerInputMoney.setAdapter(moneyAdapter);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
