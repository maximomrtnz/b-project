package maximomartinezgonzalez.adapters;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.example.b_project.R;

import maximomartinezgonzalez.modelo.Money;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MoneyAdapter extends BaseAdapter{
	
	private ArrayList<Money> moneyList;
	private Context context;
	private DecimalFormat df = new DecimalFormat("####.##");
	
	public MoneyAdapter(ArrayList<Money> moneyList, Context context){
		this.moneyList = moneyList;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.moneyList.size();
	}

	@Override
	public Object getItem(int itemId) {
		// TODO Auto-generated method stub
		return this.moneyList.get(itemId);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	static class ViewHolder{
		TextView  text_row;
		ImageView image_row;
    }

	@Override
	public View getView(int itemId, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Money money = (Money)getItem(itemId);
		ViewHolder viewHolder;
		
		if(convertView == null){
			LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.money_conversor_input_money_row, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.text_row = (TextView) convertView.findViewById(R.id.text_row);
            viewHolder.image_row = (ImageView)convertView.findViewById(R.id.image_row);
            convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		
		viewHolder.text_row.setText(money.getMoneyName()+" "+"("+money.getMoneySymbol()+")"); 
		viewHolder.image_row.setImageDrawable(money.getCountryFlag());
		
		return convertView;
	}

}
