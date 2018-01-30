package cliu.tutorialoncrypto;

import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ListCryptoAlgorithms extends Activity {
	static final String TAG = "ListCryptoAlgorithms";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.algs);
		
		ListSupportedAlgorithms();
	}

	public void ListSupportedAlgorithms() {
		String result = "";
		
		// get all the providers
		Provider[] providers = Security.getProviders();

		for (int p = 0; p < providers.length; p++) {
			// get all service types for a specific provider
			Set<Object> ks = providers[p].keySet();
			Set<String> servicetypes = new TreeSet<String>();
			for (Iterator<Object> it = ks.iterator(); it.hasNext();) {
				String k = it.next().toString();
				k = k.split(" ")[0];
				if (k.startsWith("Alg.Alias."))
					k = k.substring(10);				
				
				servicetypes.add(k.substring(0, k.indexOf('.')));
			}
			
			// get all algorithms for a specific service type
			int s = 1;
			for (Iterator<String> its = servicetypes.iterator(); its.hasNext();) {
				String stype = its.next();
				Set<String> algorithms = new TreeSet<String>();
				for (Iterator<Object> it = ks.iterator(); it.hasNext();) {
					String k = it.next().toString();
					k = k.split(" ")[0];
					if (k.startsWith(stype + "."))
						algorithms.add(k.substring(stype.length() + 1));
					else if (k.startsWith("Alg.Alias." + stype +".")) 
						algorithms.add(k.substring(stype.length() + 11));
				}

				int a = 1;
				for (Iterator<String> ita = algorithms.iterator(); ita.hasNext();) {
					result += ("[P#" + (p + 1) + ":" + providers[p].getName() + "]" +
					        "[S#" + s + ":" + stype + "]" +
							"[A#" + a + ":" + ita.next() + "]\n");
					a++;
				}
				
				s++;
			}
		}
		
		TextView tv = (TextView)findViewById(R.id.tv);
		tv.setText(result);
	}
	
}
